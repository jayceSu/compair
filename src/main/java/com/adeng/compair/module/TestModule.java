package com.adeng.compair.module;

//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.adeng.compair.dataSource.DataSourceTypeManager;
//import com.adeng.compair.entity.BookSheetTrip;
//import com.adeng.compair.entity.BookingSheet;
//import com.adeng.compair.entity.BookingSheetOrder;
//import com.adeng.compair.entity.Carrier;
//import com.adeng.compair.entity.Ioc;
//import com.adeng.compair.entity.OrderCarEntity;
//import com.adeng.compair.entity.OrderInfo;
//import com.adeng.compair.entity.OrderInfoItem;
//import com.adeng.compair.entity.Truck;
//import com.adeng.compair.enums.DataSources;
//import com.adeng.compair.service.OracleService;
//import com.adeng.compair.service.SqlServerService;
//import com.adeng.compair.util.ApplicationContextUtils;
//import com.alibaba.druid.util.StringUtils;

public class TestModule {
//	static int i = 0;
//
//	/**
//	 * 记录日志原因 标记车次订单状态
//	 */
//	public void logResult(OrderCarEntity car) {
//		DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//		SqlServerService sqlserverService = (SqlServerService) ApplicationContextUtils.getBean("sqlserverService");
//		sqlserverService.logResult(car);
//	}
//
//	public void getData() {
//		DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//		SqlServerService sqlserverService = (SqlServerService) ApplicationContextUtils.getBean("sqlserverService");
//		// 车次
//		List<OrderCarEntity> carList = sqlserverService.selectSmpvOrder();
//
//		// DataSourceTypeManager.set(DataSources.POSTGRES.name());
//		// PostService postService = (PostService)
//		// ApplicationContextUtils.getBean("postService");
//		// List<User> postList = postService.postTest();
//
//		DataSourceTypeManager.set(DataSources.ORACLE.name());
//		OracleService oracleService = (OracleService) ApplicationContextUtils.getBean("oracleService");
//		// 订单
//		List<OrderCarEntity> orderList = oracleService.selectOrder();
//
//		// 订单和车次异同分别处理
//		for (OrderCarEntity order : orderList) {
//			for (OrderCarEntity car : carList) {
//				// 订单和车次相同 订单零件和数量满足调度订单
//				if (!StringUtils.isEmpty(order.getOrderCode()) && !StringUtils.isEmpty(order.getPartReference())
//						&& order.equals(car)) { // oracle中的订单号、零件号不为空，且oracle的订单号、零件号与数量须与sqlserver一样，这里的equals已被重写
//					// 关联卡车、承运商、订单、路单唯一验证
//					// 打印信息
//					System.out.println("数据" + order.getOrderCode() + "零件号：" + order.getPartReference() + "订单表数量："
//							+ order.getQty() + "车次表数据：" + car.getQty());
//
//					// 查询车牌是否存在
//					Truck truck = oracleService.selectLicensePlatel(car.getPlanLicensePlateNumber());
//					if (truck == null) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的车牌不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//					// 查询起始点是否存在
////					Ioc ioc = oracleService.selectCountLocation(car.getStartingLocation());
////					if (ioc == null) {
////						car.setProcessingState("1");
////						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的起始点不存在");
////						this.logResult(car);
////						DataSourceTypeManager.set(DataSources.ORACLE.name());
////						continue;
////					}
//					// 查询车次号是否存在且唯一
//					List<BookingSheet> booksheet = oracleService.selectCountSheet(car.getTrainNumber());
//					if (booksheet == null || booksheet.size() != 1) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的车次号不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//					// 查询承运商是否存在
//					Carrier carrier = oracleService.selectCarrier(order.getCarrierId());
//					if (carrier == null) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的承运商不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//
//					// 查询订单的零件条数
//					int countOrder = oracleService.countOrderCode(order.getOrderCode());
//
//					DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//					// 查询车次的零件条数
//					int countPart = sqlserverService.countPart(car.getOrderCode());
//
//					// 订单的零件条数>查询车次的零件条数
//					if (countOrder >= countPart) {
//						// 实例化BookingSheet 路单
//						BookingSheet bookingSheet = new BookingSheet(0, car.getTrainNumber(), '2', truck.getId(),
//								car.getPlanDriverName(), car.getPlanDriverPhone(), car.getDates(), '1', new Date(),
//								order.getCreateUserId(), order.getLastUpdateDate(), order.getLastUpdateUserId(),
//								carrier.getId(), null, null, null, null, '0', null, null, null, null, null, null, null,
//								null, null, null, null, null, null, null, null);
//
//						// 定义一个路单对应的订单对象为空
//						BookingSheetOrder bookingSheetOrder = null;
//						// 获取当前时间
//						Date day = new Date();
//						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//						// 实例化BookingSheetOrder 路单对应订单
//						// 判断SqlServer的车次主表和子表的需求时间是否为空
//						if (car.getRequiredTime() != null && !"".equals(car.getRequiredTime())) {
//							// SqlServer的车次主表和子表的需求时间 添加到 实例化路单对应的订单对象
//							bookingSheetOrder = new BookingSheetOrder(1, oracleService.getOrderId(), order.getId() + 10,
//									null, '2', df.format(day).toString(), car.getPlannedPickUpTime().toString(),
//									car.getRequiredTime().toString(), null, null, null);
//						} else {
//							// Oracle的要货时间 添加到 实例化路单对应的订单对象
//							bookingSheetOrder = new BookingSheetOrder(1, oracleService.getOrderId(), order.getId() + 10,
//									null, '2', df.format(day).toString(), car.getPlannedPickUpTime().toString(),
//									order.getDelivery_time().toString(), null, null, null);
//						}
//
//						// 定义一个路单站点时间的空对象
//						BookSheetTrip bookingSheetTrip = null;
//						// SqlServer的需求时间不等于空
//						if (car.getRequiredTime() != null && !"".equals(car.getRequiredTime())) {
//							// 实例化bookSheetTrip 路单站点时间
//							bookingSheetTrip = new BookSheetTrip(0, bookingSheet.getId(), null, order.getId(),
//									order.getPickupLocationId(), order.getDeliveryLocationId(),
//									car.getPlannedPickUpTime(), car.getPlannedPickUpTime(),
//									// SqlServer的需求时间RequiredTime
//									car.getRequiredTime(), car.getRequiredTime(), null, new Date(), 0, new Date(), 0, 1,
//									ioc.getId(), car.getTaskStartTime(), car.getTaskEndTime(), null);
//						} else {
//							bookingSheetTrip = new BookSheetTrip(0, bookingSheet.getId(), null, order.getId(),
//									order.getPickupLocationId(), order.getDeliveryLocationId(),
//									car.getPlannedPickUpTime(), car.getPlannedPickUpTime(),
//									// Oracle的要货时间Delivery_time
//									order.getDelivery_time(), order.getDelivery_time(), null, new Date(), 0, new Date(),
//									0, 1, ioc.getId(), car.getTaskStartTime(), car.getTaskEndTime(), null);
//						}
//
//						System.out.println("开始插入数据");
//						// 插入到路单对应订单
//						int countBookingSheetOrder = oracleService.insertBookingSheetOrder(bookingSheetOrder);
//						if (countBookingSheetOrder > 0) {
//							System.out.print("插入路单对应订单成功！");
//						} else {
//							System.out.print("插入路单对应订单失败！");
//						}
//
//						// 插入到路单站点时间
//						int countbookingSheetTrip = oracleService.insertBookSheetTrip(bookingSheetTrip);
//						if (countbookingSheetTrip > 0) {
//							System.out.print("插入路单站点时间成功！");
//						} else {
//							System.out.print("插入路单站点时间失败！");
//						}
//
//						// 插入到路单
//						int countBookingSheet = oracleService.insertBookingSeet(bookingSheet);
//						if (countBookingSheet > 0) {
//							System.out.print("插入路单成功！");
//						} else {
//							System.out.print("插入路单失败！");
//						}
//
//						// 插入所有数据成功后修改订单表的状态
//						oracleService.UpdateOrderType(order.getId());
//
//						car.setProcessingState("2");
//						car.setProcessingDescription(" ");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//
//					} else { // 订单的零件条数>查询车次的零件条数 end if
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的零件条数小于车次字表中的零件条数");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//
//				} // end if
//					// 拆单 ITMS订单零件数或条目数大于车次的零件数或者订单零件条目数
//				else if (order.getOrderCode() != null && order.getOrderCode().equals(car.getOrderCode())) {
//					System.out.println("拆单设置-------------------");
//
//					// 关联卡车、承运商、订单、路单唯一验证
//					// 打印信息
//					System.out.println("数据" + order.getOrderCode() + "零件号：" + order.getPartReference() + "订单表数量："
//							+ order.getQty() + "车次表数据：" + car.getQty());
//
//					// 查询车牌是否存在
//					Truck truck = oracleService.selectLicensePlatel(car.getPlanLicensePlateNumber());
//					if (truck == null) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的车牌不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//					// 查询起始点是否存在
//					Ioc ioc = oracleService.selectCountLocation(car.getStartingLocation());
//					if (ioc == null) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的起始点不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//					// 查询车次号是否存在且唯一
//					List<BookingSheet> booksheet = oracleService.selectCountSheet(car.getTrainNumber());
//					if (booksheet == null || booksheet.size() != 1) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的车次号不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//					// 查询承运商是否存在
//					Carrier carrier = oracleService.selectCarrier(order.getCarrierId());
//					if (carrier == null) {
//						car.setProcessingState("1");
//						car.setProcessingDescription("订单号为：" + order.getOrderCode() + "的承运商不存在");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						continue;
//					}
//
//					// 查询订单的零件条数
//					int countOrder = oracleService.countOrderCode(order.getOrderCode());
//
//					DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//					// 查询车次的零件条数
//					int countPart = sqlserverService.countPart(car.getOrderCode());
//
//					// 判断订单条数是否大于车次条数, 并且订单零件数量大于车零件数量
//					if (countPart > 0 && countOrder > countPart && order.getQty() > car.getQty()) {
//						// 如果订单条数是否大于车次条数,
//						// 并且订单零件数量大于车零件数量（先拆条数大于的订单然后在拆数量大于的订单）
//						// 修改条数多于的运输单号
//						StringBuffer newRows = new StringBuffer();
//						newRows.append(order.getTransportCode() + "_" + (System.currentTimeMillis() + "").substring(9));
//						System.out.println("新的运输单号：" + newRows);
//						// 实例化订单主表
//						OrderInfo orderInfos = new OrderInfo(order.getId(), order.getOrderCode(), newRows.toString(),
//								order.getCustomerId(), order.getPickup_time(), order.getDelivery_time(),
//								order.getPickupLocationId(), order.getDeliveryLocationId(), order.getCarrierId(),
//								order.getOrderType(), order.getVersion(), order.getOrderPublishedTime(),
//								order.getOrderSchedulingTime(), order.getOrderShippingTime(),
//								order.getOrderCompleteTime(), order.getUserTd(), order.getIsLate(),
//								order.getCreateDate(), order.getCreateUserId(), order.getLastUpdateDate(),
//								order.getLastUpdateUserId(), order.getActualPickupTime(), order.getActualDeliveryTime(),
//								order.getPickupIsLate(), order.getIsDamag(), order.getLocMatrixEngineerId(),
//								order.getOperateType(), order.getXmlVersion(), order.getOrderDate(),
//								order.getDocCutOffDate(), order.getEtdDate(), order.getDeliverPort(),
//								order.getMtiNumber(), order.getProjectId(), order.getOrderProjectGs(),
//								order.getRemark(), order.getFordFileName(), order.getItemId(), order.getOrderPartType(),
//								order.getOrderRowNum(), order.getIsConfirm(), order.getIsAddPart(), order.getIsSend(),
//								order.getPusPickupTime(), order.getPusDeliveryTime(), order.getSylifeshenNum(),
//								order.getCcLocationId(), order.getDlvContactname(), order.getDlvTel(),
//								order.getDlvAddress(), order.getPicContactname(), order.getPicTel(),
//								order.getPicAddress(), order.getCcArrivalTime(), order.getCcLeaveTime(),
//								order.getCcCode(), order.getTransportMode(), order.getOrderInfoType(),
//								order.getNewOrderId(), order.getDisposedStatus(), order.getShippersConfirmStatus(),
//								order.getPoNo(), order.getClaimGoodsTime(), order.getPusStatus());
//
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//						// 拆主表 插入
//						int n4 = oracleService.insertOrder(orderInfos);
//						System.out.println("是否成功！-----------------------------" + n4);
//
//						// 然后在把数量大于的订单进行拆单（订单数量大于车次数量）
//						System.out.println("先拆单（订单数量大于车次数量）");
//						// 新的数量
//						int newcount = order.getQty() - car.getQty();
//						System.out.println("订单零件数量：" + order.getQty() + "：车次零件数量：" + car.getQty());
//						System.out.println("新的数量：" + newcount);
//						// 定义一个Map集合
//						Map<String, Object> map = new HashMap<String, Object>();
//						// map集合添加数据
//						// 获取父类ID
//						List<OrderInfoItem> or = oracleService.selectById(order.getId());
//						for (OrderInfoItem orderInfoItem : or) {
//							map.put("idItm", orderInfoItem.getId());
//							System.out.println("订单子表ID" + orderInfoItem.getId());
//							System.out.println("订单主表ID：" + order.getId());
//							map.put("qty", newcount);
//							// 不管有几条零件数 只去修改有匹配的零件数量
//							if (orderInfoItem.getPartReference() != null
//									&& orderInfoItem.getPartReference().equals(car.getPartReference())) {
//								// 拆单将原来的订单的零件数量和车次的零件一样
//								int n = oracleService.updatePart(map);
//								System.out.println("是否修改后的数量：" + n);
//							}
//						}
//						// 初始化订单子表
//						OrderInfoItem orderInfoItem = new OrderInfoItem(1, order.getOrderInfoId(),
//								order.getPartReference(), order.getPartName(), order.getPackageQty(), newcount,
//								order.getUnitl(), order.getLength(), order.getWidth(), order.getHeight(),
//								order.getAmountWeight(), order.getSupplierCode(), order.getSupplierName(),
//								order.getRemarkItme(), order.getPackageCode(), order.getRealQty(), order.getSolidRate(),
//								order.getLiquidRate(), order.getPartCube(), order.getPallet(), order.getFactPackpages(),
//								order.getTruckRate(), order.getIsConfirmitme(), order.getWeightRate(),
//								order.getAsnCode(), order.getReceiveDate(), order.getSylifeshenNumItme(),
//								order.getVersionNumber(), order.getRealTakeNumber(), order.getDisposedStatusItme(),
//								order.getPoItemNo(), order.getDocNum(), order.getPoNoItme());
//
//						int a = oracleService.insertOrderItme(orderInfoItem);
//						System.out.println("插子表是否成功！" + a);
//
//						// 定义一个新的运输单号
//						StringBuffer newtransportCode = new StringBuffer();
//						newtransportCode.append(
//								order.getTransportCode() + "_" + (System.currentTimeMillis() + "").substring(9));
//						System.out.println("运输单号：" + newtransportCode);
//						// 实例化订单主表
//						OrderInfo orderInfo = new OrderInfo(order.getId(), order.getOrderCode(),
//								newtransportCode.toString(), order.getCustomerId(), order.getPickup_time(),
//								order.getDelivery_time(), order.getPickupLocationId(), order.getDeliveryLocationId(),
//								order.getCarrierId(), order.getOrderType(), order.getVersion(),
//								order.getOrderPublishedTime(), order.getOrderSchedulingTime(),
//								order.getOrderShippingTime(), order.getOrderCompleteTime(), order.getUserTd(),
//								order.getIsLate(), order.getCreateDate(), order.getCreateUserId(),
//								order.getLastUpdateDate(), order.getLastUpdateUserId(), order.getActualPickupTime(),
//								order.getActualDeliveryTime(), order.getPickupIsLate(), order.getIsDamag(),
//								order.getLocMatrixEngineerId(), order.getOperateType(), order.getXmlVersion(),
//								order.getOrderDate(), order.getDocCutOffDate(), order.getEtdDate(),
//								order.getDeliverPort(), order.getMtiNumber(), order.getProjectId(),
//								order.getOrderProjectGs(), order.getRemark(), order.getFordFileName(),
//								order.getItemId(), order.getOrderPartType(), order.getOrderRowNum(),
//								order.getIsConfirm(), order.getIsAddPart(), order.getIsSend(), order.getPusPickupTime(),
//								order.getPusDeliveryTime(), order.getSylifeshenNum(), order.getCcLocationId(),
//								order.getDlvContactname(), order.getDlvTel(), order.getDlvAddress(),
//								order.getPicContactname(), order.getPicTel(), order.getPicAddress(),
//								order.getCcArrivalTime(), order.getCcLeaveTime(), order.getCcCode(),
//								order.getTransportMode(), order.getOrderInfoType(), order.getNewOrderId(),
//								order.getDisposedStatus(), order.getShippersConfirmStatus(), order.getPoNo(),
//								order.getClaimGoodsTime(), order.getPusStatus());
//						// 修改为新的订单号
//						int a1 = oracleService.insertOrder(orderInfo);
//						System.out.println("插主表是否成功：" + a1);
//
//						System.out
//								.println("车牌号：" + car.getPlanLicensePlateNumber() + "起始点：" + car.getStartingLocation());
//						// 实例化BookingSheet 路单
//						BookingSheet bookingSheet = new BookingSheet(0, car.getTrainNumber(), '2', truck.getId(),
//								car.getPlanDriverName(), car.getPlanDriverPhone(), car.getDates(), '1', new Date(),
//								order.getCreateUserId(), order.getLastUpdateDate(), order.getLastUpdateUserId(),
//								carrier.getId(), null, null, null, null, '0', null, null, null, null, null, null, null,
//								null, null, null, null, null, null, null, null);
//						BookingSheetOrder bookingSheetOrder = null;
//						// 获取当前时间
//						Date day = new Date();
//						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//						// 实例化BookingSheetOrder 路单对应订单
//						if (car.getRequiredTime() != null && car.getRequiredTime().equals("")) {
//							bookingSheetOrder = new BookingSheetOrder(1, oracleService.getOrderId(), order.getId(),
//									null, '2', df.format(day).toString(), car.getPlannedPickUpTime().toString(),
//									car.getRequiredTime().toString(), null, null, null);
//						} else {
//							bookingSheetOrder = new BookingSheetOrder(1, oracleService.getOrderId(), order.getId(),
//									null, '2', df.format(day).toString(), car.getPlannedPickUpTime().toString(),
//									order.getDelivery_time().toString(), null, null, null);
//						}
//						BookSheetTrip bookingSheetTrip = null;
//						if (car.getRequiredTime() != null && car.getRequiredTime().equals("")) {
//							// 实例化bookSheetTrip 路单站点时间
//							bookingSheetTrip = new BookSheetTrip(0, bookingSheet.getId(), null, order.getId(),
//									order.getPickupLocationId(), order.getDeliveryLocationId(),
//									car.getPlannedPickUpTime(), car.getPlannedPickUpTime(), car.getRequiredTime(),
//									car.getRequiredTime(), null, new Date(), 0, new Date(), 0, 1, ioc.getId(),
//									car.getTaskStartTime(), car.getTaskEndTime(), null);
//						} else {
//							bookingSheetTrip = new BookSheetTrip(0, bookingSheet.getId(), null, order.getId(),
//									order.getPickupLocationId(), order.getDeliveryLocationId(),
//									car.getPlannedPickUpTime(), car.getPlannedPickUpTime(), order.getDelivery_time(),
//									order.getDelivery_time(), null, new Date(), 0, new Date(), 0, 1, ioc.getId(),
//									car.getTaskStartTime(), car.getTaskEndTime(), null);
//						}
//						System.out.println("开始插入数据");
//						// 插入到路单对应订单
//						int countBookingSheetOrder = oracleService.insertBookingSheetOrder(bookingSheetOrder);
//						System.out.println("路单对应订单是否成功：" + countBookingSheetOrder);
//						// 插入到路单站点时间
//						int countbookingSheetTrip = oracleService.insertBookSheetTrip(bookingSheetTrip);
//						System.out.println("路单站点时间是否成功：" + countbookingSheetTrip);
//						// 插入到路单
//						int countBookingSheet = oracleService.insertBookingSeet(bookingSheet);
//						System.out.println("路单站点时间是否成功：" + countBookingSheet);
//						if (countBookingSheet != 0 && countBookingSheetOrder != 0 && countbookingSheetTrip != 0) {
//							System.out.println("成功 -------------------------------");
//						} else {
//							System.out.println("失败3");
//							return;
//						}
//
//						// 插入成功后就处理状态
//						// 订单状态
//						System.out.println("订单ID：" + order.getId());
//						oracleService.UpdateOrderType(order.getId());
//
//						DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//						// 修改车次状态
//						car.setProcessingState("2");
//						car.setProcessingDescription(" ");
//						this.logResult(car);
//						DataSourceTypeManager.set(DataSources.ORACLE.name());
//					} else {
//						DataSourceTypeManager.set(DataSources.SQLSERVER.name());
//						if (countOrder < countPart) {
//							System.out.println("数量小于  记录异常");
//							// 数量小于 记录异常
//							String processingDescription = "订单表的零件数量小于车次表的零件数量";
//							car.setProcessingState("1");
//							car.setProcessingDescription(processingDescription);
//							logResult(car);
//							System.out.println("对应ID：" + car.getExcelServerRCID());
//						}
//						if (order.getQty() < car.getQty()) {
//							System.out.println("条数小于  记录异常");
//							// 条数小于 记录异常
//							String processingDescription = "订单表的零件条数小于车次表的零件条数";
//							car.setProcessingState("1");
//							car.setProcessingDescription(processingDescription);
//							logResult(car);
//						}
//					}
//
//				} else { // 订单和车次不同 订单零件和数量不满足调度订单 这里是end if
//					car.setProcessingState("1");
//					car.setProcessingDescription("订单零件和数量不满足调度订单");
//					// this.logResult(car);
//				}
//
//			}
//		}
//
////		List<OrderCarEntity> oracleDifferent = new ArrayList<>();
////		List<OrderCarEntity> sqlserverDifferent = new ArrayList<>();
//
//		for (OrderCarEntity order : orderList) {
//			if (carList.contains(order)) {
////				oracleDifferent.add(order);
//				System.out.println(order.getOrderCode());
//			}
//		}

//		for (OrderCarEntity car : orderList) {
//			if (carList.contains(car)) {
//				sqlserverDifferent.add(car);
//			}
//		}

//		for (OrderCarEntity order : oracleDifferent) {
//			System.out.println(order.getQty());
//		}
//		for (OrderCarEntity car : sqlserverDifferent) {
//			System.out.println(car.getOrderCode());
//		}

//	}

}
