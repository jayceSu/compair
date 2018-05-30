package com.adeng.compair.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.adeng.compair.entity.BookSheetTrip;
import com.adeng.compair.entity.BookingSheet;
import com.adeng.compair.entity.Carrier;
import com.adeng.compair.entity.CompairClass;
import com.adeng.compair.entity.Ioc;
import com.adeng.compair.entity.OrderCarEntity;
import com.adeng.compair.entity.Truck;
import com.alibaba.druid.util.StringUtils;

//@WebService(endpointInterface = "com.adeng.compair.service.InvokeService",serviceName = "dealData")
@Service("invokeService")
public class InvokeServiceImpl implements InvokeService {
	private static Logger log = Logger.getLogger(InvokeServiceImpl.class);

	@Resource(name = "oracleService")
	private OracleService oracleService;

	@Resource(name = "sqlserverService")
	private SqlServerService sqlserverService;

	@Override
	@Transactional(value = "otransactionManager")
	public void dealOrder() {
		// 查询车次主表中所有符合条件的车次信息
		List<OrderCarEntity> car = sqlserverService.queryMainCar();
		log.info("===================本次需操作的车次数：" + car.size() +" ======================");
//		car.clear();
		// 车牌实例
		Truck truck = null;
		// 起始点实例
		Ioc ioc = null;
		// 承运商实例
		Carrier carrier = null;
		
		for (OrderCarEntity c : car) {
			log.info("===================车次号：" + c.getTrainNumber() +" ======================");
			log.info("===================ExcelServerRCID：" + c.getExcelServerRCID() +" ======================");
//			DataSourceTypeManager.set(DataSources.ORACLE.name());
			// 校验车牌是否存在
			if (StringUtils.isEmpty(c.getPlanLicensePlateNumber())) {
				logResult("3", "车牌不存在", c.getExcelServerRCID());
				continue;
			} else {
				truck = oracleService.selectLicensePlatel(c.getPlanLicensePlateNumber());
				if (truck == null) {
					logResult("3", "车牌不存在", c.getExcelServerRCID());
					continue;
				}
			}

			// 校验起始点是否存在
			if (StringUtils.isEmpty(c.getStartingLocation())) {
				logResult("3", "起始点不存在", c.getExcelServerRCID());
				continue;
			} else {
				ioc = oracleService.selectCountLocation(c.getStartingLocation());
				if (ioc == null) {
					logResult("3", "起始点不存在", c.getExcelServerRCID());
					continue;
				}
			}

			// 校验承运商是否存在
			if (StringUtils.isEmpty(c.getCommonCarrier())) {
				logResult("3", "承运商不存在", c.getExcelServerRCID());
				continue;
			} else {
				carrier = oracleService.selectCarrier(c.getCommonCarrier());
				if (carrier == null) {
					logResult("3", "承运商不存在", c.getExcelServerRCID());
					continue;
				}
			}

			// 校验车次号是否存在且唯一
			if (StringUtils.isEmpty(c.getTrainNumber())) {
				logResult("3", "车次号不存在", c.getExcelServerRCID());
				continue;
			} else {
				List<BookingSheet> booksheet = oracleService.selectCountSheet(c.getTrainNumber());
				if (booksheet.size() > 0) {
					logResult("3", "车次号不唯一或已生成", c.getExcelServerRCID());
					continue;
				}
			}

			boolean flag = true;
//			// 订单零件数量是否>车次零件数量标志
//			boolean numIsBig = false;
//			// 订单零件条数是否>车次零件条数标志
//			boolean itemIsBig = false;
//			String msg = "";
//			// 订单零件条数>车次零件条数的订单号集合
//			List<Map<String, String>> itemOrderCode = new ArrayList<Map<String, String>>();
//			// 订单零件数>车次零件数的订单号、零件号集合
//			List<Map<String, String>> numList = new ArrayList<Map<String, String>>();

			/**
			 * 比较车次信息(sqlserver)和订单信息(oracle) 车次信息：
			 * 根据主车次的ExcelServerRCID查出子表中的记录（同订单号、同零件号的数量），需对订单号、零件号分组，防止同订单、同零件出现多条记录
			 * ---针对计划数量 根据主车次的ExcelServerRCID查出子表中的记录（同订单号的条数），需对订单号分组 ---针对条目数
			 * 通过分组查出的子表记录的条数即为条目数，各记录的计划数量即为零件数量 订单信息：
			 * 根据上述查出的结果中的订单号，去订单子表中查询相应的订单信息（通过零件号分组） 判断： 
			 * 1、零件数量：
			 * 若订单子表的同订单号、同零件号的数量<车次子表查出的同订单号、同零件号的数量，则记录为错误
			 * 若订单子表的同订单号、同零件号的数量=车次子表查出的同订单号、同零件号的数量，则继续向下执行程序
			 * 若订单子表的同订单号、同零件号的数量>车次子表查出的同订单号、同零件号的数量，则拆主单，一拆为二，
			 * 原子单QTY与车次中的一致，多余的记录到新增主单（新增主单与原单除TRANSPORT_CODE递增外其余字段都相同）关联的子单中去，其余字段与原记录相同
			 * 2、订单条目数： 
			 * 若订单子表中同订单号的条数<车次子表查出的同订单号的条数，则记录为错误
			 * 若订单子表中同订单号的条数=车次子表查出的同订单号的条数，则继续向下执行程序
			 * 若订单子表中同订单号的条数>车次子表查出的同订单号的条数，则拆主单，一拆为二， 保留订单子表中与车次那相同的零件信息，多余的关联新增主单
			 */

//			DataSourceTypeManager.set(DataSources.SQLSERVER.name());
			// orderId集合 最后存路单相关信息时使用
			Set<Integer> orderIdList = new HashSet<Integer>();
			
			//根据车次号查出所有的订单号
			List<OrderCarEntity> orderCodeList = sqlserverService.queryOrderCodeByCar(c); 
			if(orderCodeList.size() == 0) { 
				logResult("3", "车次号:" + c.getTrainNumber() + "无订单信息或订单内零件数量都为0", c.getExcelServerRCID());
				continue;
			}else {
				//==================================以下是各个订单的拆单==============================================
				for(OrderCarEntity order : orderCodeList) {
					List<Integer> orderId = oracleService.queryOrderIdByOrderCode(order); //根据订单号查出订单ID
					c.setOrderCode(order.getOrderCode());
					c.setOrderIds(orderId);
					orderIdList.addAll(orderId);
					
					if(orderId.size() == 0) {
						logResult("3", "订单号:" + c.getOrderCode() + "不存在或已调度", c.getExcelServerRCID());
						flag = false;
						break;
					}
					
					//sqlserver 根据订单号查出零件条数
					List<CompairClass> sPartAndNum = sqlserverService.selectSmpvOrder(c); //只有零件和数量信息
					//oracle 根据订单ID查出零件数
					List<CompairClass> oPartAndNum = oracleService.queryOrderCount(c); //只有零件和数量信息
					
					//记录sqlserver和oracle中都有的零件号
					Set<String> samePart = new HashSet<String>();
					//记录不需要拆单的零件号
					Set<String> normalPart = new HashSet<String>();
					//记录零件数需要拆单的零件号
					Set<String> numPullPart = new HashSet<String>();
					//需要拆单的零件号对应sqlserver中的数量
					Map<String, Integer> partMap = new HashMap<String, Integer>();
					
					//记录sqlserver中所有的零件号
					List<String> sqlserverPartList = new ArrayList<String>();
					
					//sqlserver作为主，oracle作为比较对象
					for(CompairClass s : sPartAndNum) {
						boolean isExist = false;
						for(CompairClass o : oPartAndNum) {
							if(o.getPartReference().equals(s.getPartReference())) {
								samePart.add(o.getPartReference());
								if(o.getQty() < s.getQty()) {
									logResult("3", "订单号:" + c.getOrderCode() + "，零件号：" + s.getPartReference() + "计划数量大于订单表中的记录", c.getExcelServerRCID());
									flag = false;
									break;
								}else if((int)o.getQty() == (int)s.getQty()) {
									normalPart.add(o.getPartReference());
								}else {
									numPullPart.add(o.getPartReference());
									partMap.put(o.getPartReference(), s.getQty());
								}
								
								isExist = true;
								break;
							}
							
							if(!flag) {
								break;
							}
						}
						
						if(!isExist) {
							logResult("3", "订单号:" + c.getOrderCode() + "，零件号：" + s.getPartReference() + "在订单表中不存在", c.getExcelServerRCID());
							flag = false;
							break;
						}
						
						sqlserverPartList.add(s.getPartReference());
					}
					
					//记录条目数需要拆单的零件号
					Set<String> countPullPart = new HashSet<String>();
					//oracle作为主，sqlserver作为比较对象
					for(CompairClass o : oPartAndNum) {
						boolean isExist = true;
						if(!samePart.contains(o.getPartReference())) {
							for(CompairClass s : sPartAndNum) {
								if(!samePart.contains(s.getPartReference())) {
									if(o.getPartReference().equals(s.getPartReference())) {
										isExist = false;
										break;
									}
								}else {
									continue;
								}
							}
						}else {
							continue;
						}
						
						if(isExist) {
							countPullPart.add(o.getPartReference());
						}
					}
					
					//拆单  orderId.size() == 1
					//拆零件条目数的单子
					for(Integer index : orderId) {
						//新增主单的ID
						int id = 0;
						if(countPullPart.size() > 0) {
							//查询该orderID在订单子表中是否存在sqlserver中的零件
							OrderCarEntity temp = new OrderCarEntity();
							List<String> partNos = new ArrayList<String>(countPullPart);
							temp.setPartNos(partNos);
							temp.setOrderId(index);
							int count = oracleService.queryPartIsExistOrder(temp);
							
							if(count != 0) { //orderId在订单子表中有sqlserver中符合条件的零件记录
								//原单
								OrderCarEntity o = new OrderCarEntity();
								o.setId(index);
								o = oracleService.queryBaseOrder(o);
								//查询订单主表中同orderCode的记录条数
								int num = oracleService.queryOrderCountByOrderCode(o);
								if(num == 1) {
									o.setTransportCode(o.getTransportCode() + "-1");
								}else if(num > 1) {
									OrderCarEntity transport = oracleService.queryMaxTransportCode(o);
									o.setTransportCode(Integer.parseInt(transport.getTransportCode().substring(transport.getTransportCode().indexOf("-"))+1) + "");
								}
								//新增主单
								oracleService.insertNewOrder(o);
								id = o.getId();
								
								//更新订单子表中原orderId,满足拆单的零件记录的orderId
								o.setPartNos(partNos);
								o.setOrderId(index);
								oracleService.updateOrderItemId(o);
							}
						}
						
						
						//拆零件数的单子
						for(String partNo : numPullPart) {
							if(id == 0) {
								//原单
								OrderCarEntity o = new OrderCarEntity();
								o.setId(index);
								o = oracleService.queryBaseOrder(o);
								//查询订单主表中同orderCode的记录条数
								int num = oracleService.queryOrderCountByOrderCode(o);
								if(num == 1) {
									o.setTransportCode(o.getTransportCode() + "-1");
								}else {
									o.setTransportCode(Integer.parseInt(o.getTransportCode().substring(o.getTransportCode().indexOf("-"))+1) + "");
								}
								//新增主单
								oracleService.insertNewOrder(o);
								id = o.getId();
							}
							
							//sqlserver该零件需要的数量
							Integer needNum = partMap.get(partNo);
							
							OrderCarEntity o = new OrderCarEntity();
							o.setId(index);
							o.setPartReference(partNo);
							OrderCarEntity oldOrder = oracleService.queryOldOrderInfo(o);
							//oracle该零件现在的数量
							Integer oldQty = oldOrder.getQty();
							//oracle该零件现在的箱数    原单箱数
							Integer oldPackage = oldOrder.getPackageQty();
							Double unit = 0.0;
							//新拆单箱数
							Integer newPackege = 0;
							
							if (oldPackage == 0) {
								logResult("3", "订单号:" + c.getOrderCode() + "，零件号：" + partNo + "的箱数为0", c.getExcelServerRCID());
								flag = false;
								break;
							} else {
								unit = (double) (oldQty / oldPackage);
								oldPackage = (int) Math.ceil(needNum / unit); //原箱数需要改成sqlserver中需要数量除以每箱的数量
								newPackege = (int) Math.ceil((oldQty - needNum) / unit); //拆单后的新箱数
							}

							// 新增订单子表拆分的记录
							oldOrder.setOrderInfoId(id);
							oldOrder.setPackageQty(newPackege);
							oldOrder.setQty(oldQty - needNum);
							oracleService.insetOrderItem(oldOrder);

							// 修改原子订单的数量为num
							oldOrder.setPackageQty(oldPackage);
							oldOrder.setQty(needNum);
							oldOrder.setOrderId(index);
							oracleService.updateOrderItemNum(oldOrder);
						}
						
//						if(!flag) {
//							break;
//						}
					}
					
//					if(!flag) {
//						break;
//					}
				}
				
				if(!flag) {
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					continue;
				}
				
				//==================================以下是保存路单及相关订单操作==============================================
				c.setTruckId(truck.getId());
				c.setIocId(ioc.getId());
				c.setCarrierId(carrier.getId());
				// 保存路单
				oracleService.saveBookingSheet(c);
				Integer bookingSheetID = c.getId();
				System.out.println("车次号为：" + c.getTrainNumber() + "保存路单成功！");

				// 是否都保存成功标志
				boolean saveFlag = true;
				// 保存路单对应订单 and 保存路单站点时间 and 修改订单状态
				for (Integer i : orderIdList) {
					c.setBookingSheetID(bookingSheetID);
					c.setId(i);

					// 对比的实例
					OrderCarEntity baseOrder = oracleService.queryBaseOrder(c);
					baseOrder.setBookingSheetID(bookingSheetID);
					baseOrder.setIocId(c.getIocId());
					baseOrder.setTruckId(c.getTruckId());

					int isExist = oracleService.queryCountBookingSheetOrder(c);
					if (isExist > 0) {
						saveFlag = false;
						logResult("3", "订单号为：" + c.getOrderCode() + "的订单信息已存在路单表中，保存至路单对应订单表失败", c.getExcelServerRCID());
						flag = false;
						break;
					}
					// 保存路单对应订单
					oracleService.saveBookingSheetOrder(c);
					Date now = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

					// 手动设下orderCode
					c.setOrderCode(baseOrder.getOrderCode());
					OrderCarEntity tempCar = sqlserverService.queryTempCarInfo(c);
					if (tempCar != null) {
						Date planTime = null; //ex子表计划提货时间
						Date requireTime = null; //ex子表需求时间
						
						if (!StringUtils.isEmpty(tempCar.getUnloadingPoint())) {
							Ioc ioc2 = oracleService.queryLocInfo(tempCar);
							if(ioc2 != null && ioc2.getId() != null && !"".equals(ioc2.getId()+"")) {
								baseOrder.setDeliveryLocationId(ioc2.getId());
//								System.out.println(tempCar.getUnloadingPoint());
//								System.out.println(ioc2.getId());
							}
						}
						
						if (!StringUtils.isEmpty(tempCar.getPlannedPickUpTime())) {
							try {
								planTime = sdf.parse(tempCar.getPlannedPickUpTime());
								if (!planTime.before(now)) {
									baseOrder.setPickup_time(tempCar.getPlannedPickUpTime());
//									System.out.println(tempCar.getPlannedPickUpTime());
								}
							} catch (ParseException e) {
								e.printStackTrace();
								saveFlag = false;
								logResult("3", "订单号为：" + c.getOrderCode() + " 的订单在保存至路单站点时间表前的提货时间校验出错", c.getExcelServerRCID());
								flag = false;
								break;
							}
						}
						
						if (!StringUtils.isEmpty(tempCar.getRequiredTime())) {
							try {
								requireTime = sdf.parse(tempCar.getRequiredTime());
								if(!requireTime.before(now)) {
									baseOrder.setDelivery_time(tempCar.getRequiredTime());
//									System.out.println(tempCar.getRequiredTime());
								}
							} catch (ParseException e) {
								e.printStackTrace();
								saveFlag = false;
								logResult("3", "订单号为：" + c.getOrderCode() + "的订单在保存至路单站点时间表前的卸货时间校验出错", c.getExcelServerRCID());
								flag = false;
								break;
							}
						}
						
					}
					
					//校验提货时间和卸货时间
					if("".equals(baseOrder.getPickup_time()) || null == baseOrder.getPickup_time() ||
							"".equals(baseOrder.getDelivery_time()) || null == baseOrder.getDelivery_time()) {
						saveFlag = false;
						logResult("3", "订单号为：" + c.getOrderCode() + "的订单提货时间或卸货时间为空", c.getExcelServerRCID());
						flag = false;
						break;
					}
					
					Date pickTime = null;
					Date deliveryTime = null;
					try {
						pickTime = sdf.parse(baseOrder.getPickup_time());
						deliveryTime = sdf.parse(baseOrder.getDelivery_time());
						
					} catch (ParseException e) {
						e.printStackTrace();
						saveFlag = false;
						logResult("3", "订单号为：" + c.getOrderCode() + "的订单在校验提货时间/卸货时间出错", c.getExcelServerRCID());
						flag = false;
						break;
					}
					
					if(pickTime.before(now) || deliveryTime.before(now)){
						saveFlag = false;
						logResult("3", "订单号为：" + c.getOrderCode() + "的订单的卸货时间/提货时间早于当前时间", c.getExcelServerRCID());
						flag = false;
						break;
					}else {
						if(deliveryTime.before(pickTime)) {
							saveFlag = false;
							logResult("3", "订单号为：" + c.getOrderCode() + "的订单的卸货时间早于提货时间", c.getExcelServerRCID());
							flag = false;
							break;
						}
					}
					
					baseOrder.setStartingLocation(c.getStartingLocation());
					baseOrder.setTaskStartTime(c.getTaskStartTime());
					baseOrder.setTaskEndTime(c.getTaskEndTime());

					try {
						// 保存路单站点时间
						oracleService.saveBookingSheetTrip(baseOrder);
					} catch (Exception e) {
						e.printStackTrace();
						saveFlag = false;
						logResult("3", "订单号为：" + c.getOrderCode() + "的订单信息保存至路单站点时间表失败", c.getExcelServerRCID());
						flag = false;
						break;
					}

					// 修改订单状态
					oracleService.UpdateOrderType(i);
				}
				//更新trip表中的seq顺序
				List<BookSheetTrip> tripList = oracleService.queryBookSheetTrip(c);
				for(BookSheetTrip trip : tripList) {
					oracleService.updateTripSeq(trip);
				}
				
				//假如有差错，事务回滚
				if(!flag) {
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					continue;
				}

				if (saveFlag) {
					// 成功 修改车次处理状态
					logResult("2", " ", c.getExcelServerRCID());
				}
			}
		}
	}

	/**
	 * 记录日志原因 标记车次订单状态
	 */
	public void logResult(String code, String msg, String excelServerRCID) {
		// DataSourceTypeManager.set(DataSources.SQLSERVER.name());
		OrderCarEntity car = new OrderCarEntity();
		car.setProcessingState(code);
		car.setProcessingDescription(msg);
		car.setExcelServerRCID(excelServerRCID);
		sqlserverService.logResult(car);
	}
}
