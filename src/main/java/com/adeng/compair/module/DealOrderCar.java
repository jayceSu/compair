package com.adeng.compair.module;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.adeng.compair.dataSource.DataSourceTypeManager;
//import com.adeng.compair.entity.BookingSheet;
//import com.adeng.compair.entity.Carrier;
//import com.adeng.compair.entity.Ioc;
//import com.adeng.compair.entity.OrderCarEntity;
//import com.adeng.compair.entity.Truck;
//import com.adeng.compair.enums.DataSources;
//import com.adeng.compair.service.OracleService;
//import com.adeng.compair.service.SqlServerService;
//import com.adeng.compair.util.ApplicationContextUtils;
//import com.alibaba.druid.util.StringUtils;

public class DealOrderCar {

	//处理数据
//	@Transactional(propagation=Propagation.REQUIRED)
//	public void dealData() {
//		try {
//			DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//			SqlServerService sqlserverService = (SqlServerService) ApplicationContextUtils.getBean("sqlserverService");
//			OracleService oracleService = (OracleService) ApplicationContextUtils.getBean("oracleService");
//			//车牌实例
//			Truck truck = null;
//			//起始点实例
//			Ioc ioc = null;
//			//承运商实例
//			Carrier carrier = null;
//			
//			//查询车次主表中所有符合条件的车次信息
//			List<OrderCarEntity> car = sqlserverService.queryMainCar();
//			
//			for(OrderCarEntity c : car) {
//				DataSourceTypeManager.set(DataSources.ORACLE.name());
//				// 校验车牌是否存在
//				if(StringUtils.isEmpty(c.getPlanLicensePlateNumber())) {
//					c.setProcessingState("3");
//					c.setProcessingDescription("车牌不存在");
//					logResult(c);
//					continue;
//				}else {
//					truck = oracleService.selectLicensePlatel(c.getPlanLicensePlateNumber());
//					if(truck == null) {
//						c.setProcessingState("3");
//						c.setProcessingDescription("车牌不存在");
//						logResult(c);
//						continue;
//					}
//				}
//				
//				//校验起始点是否存在
//				if(StringUtils.isEmpty(c.getStartingLocation())) {
//					c.setProcessingState("3");
//					c.setProcessingDescription("起始点不存在");
//					logResult(c);
//					continue;
//				}else {
//					ioc = oracleService.selectCountLocation(c.getStartingLocation());
//					if(ioc == null) {
//						c.setProcessingState("3");
//						c.setProcessingDescription("起始点不存在");
//						logResult(c);
//						continue;
//					}
//				}
//				
//				//校验承运商是否存在
//				if(StringUtils.isEmpty(c.getCommonCarrier())) {
//					c.setProcessingState("3");
//					c.setProcessingDescription("承运商不存在");
//					logResult(c);
//					continue;
//				}else {
//					carrier = oracleService.selectCarrier(c.getCommonCarrier());
//					if(carrier == null) {
//						c.setProcessingState("3");
//						c.setProcessingDescription("承运商不存在");
//						logResult(c);
//						continue;
//					}
//				}
//				
//				//校验车次号是否存在且唯一
//				if(StringUtils.isEmpty(c.getTrainNumber())) {
//					c.setProcessingState("3");
//					c.setProcessingDescription("车次号不存在");
//					logResult(c);
//				}else {
//					List<BookingSheet> booksheet = oracleService.selectCountSheet(c.getTrainNumber());
//					if(booksheet.size() > 0) {
//						c.setProcessingState("3");
//						c.setProcessingDescription("车次号不唯一或已生成");
//						logResult(c);
//						continue;
//					}else if(booksheet.size() == 0) {
////						c.setProcessingState("1");
////						c.setProcessingDescription("车次号不存在");
////						logResult(c);
////						continue;
//					}
//				}
//				
//				boolean flag = true;
//				//订单零件数量是否>车次零件数量标志
//				boolean numIsBig = false;
//				//订单零件条数是否>车次零件条数标志
//				boolean itemIsBig = false;
//				String msg = "";
//				//订单零件条数>车次零件条数的订单号集合
//				List<Map<String, String>> itemOrderCode = new ArrayList<Map<String, String>>();
//				//订单零件数>车次零件数的订单号、零件号集合
//				List<Map<String, String>> numList = new ArrayList<Map<String, String>>();
//				
//				/**
//				 * 比较车次信息(sqlserver)和订单信息(oracle)
//				 * 车次信息：
//				 * 根据主车次的ExcelServerRCID查出子表中的记录（同订单号、同零件号的数量），需对订单号、零件号分组，防止同订单、同零件出现多条记录 ---针对计划数量
//				 * 根据主车次的ExcelServerRCID查出子表中的记录（同订单号的条数），需对订单号分组  ---这对条目数
//				 * 通过分组查出的子表记录的条数即为条目数，各记录的计划数量即为零件数量
//				 * 订单信息：
//				 * 根据上述查出的结果中的订单号，去订单子表中查询相应的订单信息（通过零件号分组）
//				 * 判断：
//				 * 1、零件数量：
//				 * 若订单子表的同订单号、同零件号的数量<车次子表查出的同订单号、同零件号的数量，则记录为错误
//				 * 若订单子表的同订单号、同零件号的数量=车次子表查出的同订单号、同零件号的数量，则继续向下执行程序
//				 * 若订单子表的同订单号、同零件号的数量>车次子表查出的同订单号、同零件号的数量，则拆主单，一拆为二，
//				 * 		原子单QTY与车次中的一致，多余的记录到新增主单（新增主单与原单除TRANSPORT_CODE递增外其余字段都相同）关联的子单中去，其余字段与原记录相同
//				 * 2、订单条目数：
//				 * 若订单子表中同订单号的条数<车次子表查出的同订单号的条数，则记录为错误
//				 * 若订单子表中同订单号的条数=车次子表查出的同订单号的条数，则继续向下执行程序
//				 * 若订单子表中同订单号的条数>车次子表查出的同订单号的条数，则拆主单，一拆为二，
//				 * 		保留订单子表中与车次那相同的零件信息，多余的关联新增主单
//				 */
//				
//				//查出当前车次的订单零件信息
//				DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//				List<OrderCarEntity> partNum  = sqlserverService.selectSmpvPart(c); //根据订单号分组  查出条目数
//				List<OrderCarEntity> partInfo = sqlserverService.selectSmpvOrder(c); //根据订单号、 零件号分组查出 计划数量
//				
//				//orderId集合   最后存路单相关信息时使用
//				List<Integer> orderIdList = new ArrayList<Integer>();
//				
//				boolean orderISInvoke = true;
//				
//				//校验条目数
//				for(OrderCarEntity count : partNum) {
//					DataSourceTypeManager.set(DataSources.ORACLE.name());
//					
//					Integer orderId = null;// oracleService.queryOrderIdByOrderCode(count);
//					if(orderId == null) {
//						orderISInvoke = false;
//						c.setProcessingState("3");
//						c.setProcessingDescription("订单号:"+count.getOrderCode() + "不存在或已调度");
//						logResult(c);
//						break;
//					}
//					orderIdList.add(orderId);
//					
//					//根据count的订单号去查询订单子表中的条目数
//					List<OrderCarEntity> ordNum = oracleService.queryOrderCount(count);
//					int num = count.getNum() == null ? 0 : count.getNum();
//					
//					if(ordNum.size() == 0) {
//						continue;
//					}
//					
//					if(num > ordNum.size()) {
//						flag = false;
//						msg = "EX零件条目数大于ITMS零件条目数";
//						itemOrderCode.clear();
//						break;
//					}else if(num < ordNum.size()) {
//						itemIsBig = true;
//						Map<String, String> map = new HashMap<String, String>();
//						map.put("orderCode", count.getOrderCode());
//						map.put("partReference", num+"");
//						itemOrderCode.add(map);
//					}
//				}
//				
//				if(!orderISInvoke) {
//					continue;
//				}
//				
//				if(!flag){
//					c.setProcessingState("1");
//					c.setProcessingDescription(msg);
//					logResult(c);
//					continue;
//				}
//				
//				//校验零件数
//				for(OrderCarEntity count : partInfo) {
//					DataSourceTypeManager.set(DataSources.ORACLE.name());
//					//根据订单号、零件号查询零件信息
//					List<OrderCarEntity> orderInfo = oracleService.queryOrderInfo(count);  
//					if(orderInfo.size() == 0) {
////						flag = false;
////						msg = "订单号：" + count.getOrderCode() + "零件号：" + count.getPartReference() + "的信息不存在订单表中";
////						break;
//						continue;
//					}else {
//						if(count.getQty() > orderInfo.get(0).getQty()) {
//							flag = false;
//							msg = "订单号：" + count.getOrderCode() + "零件号：" + count.getPartReference() + "的数量大于订单表";
//							break;
//						}else if(count.getQty() < orderInfo.get(0).getQty()) {
//							Map<String, String> map = new HashMap<String, String>();
//							map.put("orderCode", count.getOrderCode());
//							map.put("partReference", count.getPartReference());
//							map.put("num", count.getQty()+"");
//							numList.add(map);
//							numIsBig = true;
//						}
//					}
//				}
//				
//				if(!flag){
//					c.setProcessingState("3");
//					c.setProcessingDescription(msg);
//					logResult(c);
//					continue;
//				}
//				
//				
//				//订单零件条目数多  需拆单
//				if(itemIsBig) {
//					for(Map<String, String> orderInfo : itemOrderCode) {
//						String orderCode = orderInfo.get("orderCode");
////						int count = Integer.parseInt(orderInfo.get("partReference"));
//						
//						OrderCarEntity order = new OrderCarEntity();
//						order.setOrderCode(orderCode);
//						order.setExcelServerRCID(c.getExcelServerRCID());
//						
//						DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//						//根据订单号查询车次字表中零件信息
//						List<OrderCarEntity> carNum = sqlserverService.queryPartInfo(order);
//						
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						//根据订单号查询订单子表中的记录数
//						List<OrderCarEntity> ordNum = oracleService.queryOrderCount(order);
//						
////						List<OrderCarEntity> resultOrder = new ArrayList<OrderCarEntity>();
//						
//						//生成订单主表中的拆单信息
//						oracleService.insertNewOrder(order);
//						Integer id = order.getId();
//						
//						for(OrderCarEntity s : ordNum) {
//							boolean f = true;
//							for(OrderCarEntity t : carNum) {
//								if(s.getPartReference().equals(t.getPartReference())) {
//									f = false;
//									break;
//								}
//							}
//							
//							if(f) {
////								resultOrder.add(s);
//								order.setId(s.getId());
//								order.setOrderInfoId(id);
//								//更新订单子表中关联主表的新id
//								oracleService.updateOrderItem(order);
//							}
//						}
//						
//						
////						for(int i=count;i<ordNum.size();i++) {
////							
////						}
//					}
//				}
//				
//				//订单零件数多  需拆单
//				if(numIsBig) {
//					DataSourceTypeManager.set(DataSources.ORACLE.name());
//					for(Map<String, String> orderInfo : numList) {
//						String orderCode = orderInfo.get("orderCode");
//						String partReference = orderInfo.get("partReference");
//						int num = Integer.parseInt(orderInfo.get("num"));
//						OrderCarEntity order = new OrderCarEntity();
//						order.setOrderCode(orderCode);
//						order.setPartReference(partReference);
//						order.setNum(num);
//						//生成订单主表中的拆单信息
//						oracleService.insertNewOrder(order);
//						
//						//新增订单子表拆分的记录
//						order.setOrderInfoId(order.getId());
//						oracleService.insetOrderItem(order);
//						//修改原子订单的数量为num
//						oracleService.updateOrderItemNum(order);
//					}
//				}
//				
//				DataSourceTypeManager.set(DataSources.ORACLE.name());
//				//保存路单
//				oracleService.saveBookingSheet(c);
//				Integer bookingSheetID = c.getId();
//				
//				//保存路单对应订单   and  保存路单站点时间   and  修改订单状态
//				for(int i=0;i<orderIdList.size();i++) {
//					c.setBookingSheetID(bookingSheetID);
//					c.setId(orderIdList.get(i));
//					//保存路单对应订单
//					oracleService.saveBookingSheetOrder(c);
//					DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//					OrderCarEntity tempCar = sqlserverService.queryTempCarInfo(c);
//					if(tempCar != null) {
//						c.setUnloadingPoint(tempCar.getUnloadingPoint());
//						c.setPlannedPickUpTime(tempCar.getPlannedPickUpTime());
//						c.setRequiredTime(tempCar.getRequiredTime());
//					}
//					
//					DataSourceTypeManager.set(DataSources.ORACLE.name());
//					// 保存路单站点时间
//					oracleService.saveBookingSheetTrip(c);
//					// 修改订单状态
//					oracleService.UpdateOrderType(orderIdList.get(i));
//				}
//				
//				DataSourceTypeManager.set(DataSources.ORACLE.name());
//				//
////				for(OrderCarEntity order : partNum) {
////					
////				}
//				
//				
//				//成功  修改车次处理状态
//				c.setProcessingState("2");
//				c.setProcessingDescription(" ");
//				logResult(c);
//			}
//		} catch (Exception e) {
//			OrderCarEntity c = new OrderCarEntity();
//			c.setProcessingDescription("处理过程出错");
//			c.setProcessingState("3");
//			logResult(c);
//			e.printStackTrace();
//			throw e;
//		}
//	}
//	
//	
//	/**
//	 * 记录日志原因 标记车次订单状态
//	 */
//	public void logResult(OrderCarEntity car) {
//		DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//		SqlServerService sqlserverService = (SqlServerService) ApplicationContextUtils.getBean("sqlserverService");
//		sqlserverService.logResult(car);
//	}
}
