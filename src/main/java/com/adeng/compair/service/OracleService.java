package com.adeng.compair.service;

import java.util.List;
import java.util.Map;

import com.adeng.compair.entity.BookSheetTrip;
import com.adeng.compair.entity.BookingSheet;
import com.adeng.compair.entity.BookingSheetOrder;
import com.adeng.compair.entity.Carrier;
import com.adeng.compair.entity.CompairClass;
import com.adeng.compair.entity.Ioc;
import com.adeng.compair.entity.OrderCarEntity;
import com.adeng.compair.entity.OrderInfo;
import com.adeng.compair.entity.OrderInfoItem;
import com.adeng.compair.entity.Truck;

public interface OracleService {

	/**
	 * 根据订单状态查询订单表和订单字表（0或1）
	 * @return
	 */
	public List<OrderCarEntity> selectOrder();
	/**
	 * 车牌号是否存在。
	 * @param licensePlate
	 * @return
	 */
	public Truck selectLicensePlatel(String planLicensePlateNumber);
	/**
	 * 查询起始点是否存在
	 * @param startingLocation
	 * @return
	 */
	public Ioc selectCountLocation(String startingLocation);
	/**
	 * 查询车次号是否唯一
	 * @param bookingSheetNum
	 * @return
	 */
	public List<BookingSheet> selectCountSheet(String trainNumber);
	/**
	 * 查询承运商
	 * @param carrierId
	 * @return
	 */
	public Carrier selectCarrier(String carrierId);
	/**
	 * 查询订单的零件总数
	 */
	public int countOrderCode(String orderCode);
	/**
	 * 去获取调度单ID
	 * @return
	 */
	public Integer getOrderId();
	
	/**
	 * 插入到路单对应订单
	 * @param bookingSheetOrder
	 * @return
	 */
	public int insertBookingSheetOrder(BookingSheetOrder bookingSheetOrder);
	
	/**
	 * 插入到路单站点时间
	 * @param bookingSheetTrip
	 * @return
	 */
	public int insertBookSheetTrip(BookSheetTrip bookingSheetTrip);
	
	/**
	 * 插入到路单
	 * @param bookingSheet
	 * @return
	 */
	public int insertBookingSeet(BookingSheet bookingSheet);
	
	/**
	 * 修改订单表的状态
	 * @param id
	 */
	public void UpdateOrderType(Integer integer);
	
	public void UpdateOrderType2(Integer integer);
	
	/**
	 * 拆主表  插入
	 */
	public int insertOrder(OrderInfo orderInfos);
	
	/**
	 * 获取父类ID
	 * @param id
	 * @return
	 */
	public List<OrderInfoItem> selectById(Integer id);
	/**
	 * 修改零件的数量
	 */
	public int updatePart(Map<String, Object> map);
	
	/**
	 * 拆子表  插入
	 */
	public int insertOrderItme(OrderInfoItem orderInfoItem);
	
	/**
	 * 根据订单号查询零件信息
	 * @param part
	 * @return
	 */
	public List<OrderCarEntity> queryOrderInfo(OrderCarEntity part);
	
	/**
	 * 根据订单号查询零件条数
	 * @param part
	 * @return
	 */
	public List<CompairClass> queryOrderCount(OrderCarEntity part);
	
	/**
	 * 保存路单
	 * @param c
	 * @return
	 */
	public int saveBookingSheet(OrderCarEntity c);
	
	/**
	 * 保存路单对应订单信息
	 * @param c
	 */
	public void saveBookingSheetOrder(OrderCarEntity c);
	
	/**
	 * 保存路单站点时间
	 * @param c
	 */
	public void saveBookingSheetTrip(OrderCarEntity c);
	
	/**
	 * 生成主订单的拆分单
	 * @param order
	 * @return
	 */
	public int insertNewOrder(OrderCarEntity order);
	
	/**
	 * 更新订单子表中关联主表的新id
	 * @param order
	 */
	public void updateOrderItem(OrderCarEntity order);
	
	/**
	 * 更新原订单子表中的qty
	 * @param order
	 */
	public void updateOrderItemNum(OrderCarEntity order);
	
	/**
	 * 生成拆分后的子订单信息
	 * @param order
	 */
	public void insetOrderItem(OrderCarEntity order);
	
	/**
	 * 根据订单号查询订单id
	 * @param count
	 * @return
	 */
	public List<Integer> queryOrderIdByOrderCode(OrderCarEntity count);
	
	/**
	 * 查询原子表订单信息
	 * @param order
	 * @return
	 */
	public OrderCarEntity queryOldOrderInfo(OrderCarEntity order);
	
	/**
	 * 查询bookingSheetOrder绑定的orderID是否已存在
	 * @param c
	 * @return
	 */
	public int queryCountBookingSheetOrder(OrderCarEntity c);
	
	/**
	 * 根据orderId查询对比的实体
	 * @param c
	 * @return
	 */
	public OrderCarEntity queryBaseOrder(OrderCarEntity c);
	
	/**
	 * 查询指定orderId下是否存在零件
	 * @param temp
	 * @return
	 */
	public int queryPartIsExistOrder(OrderCarEntity temp);
	
	/**
	 * 查询订单主表中同orderCode的记录条数
	 * @param o
	 * @return
	 */
	public int queryOrderCountByOrderCode(OrderCarEntity o);
	/**
	 * 更新子表中原orderId下满足零件号的orderId
	 * @param o
	 */
	public void updateOrderItemId(OrderCarEntity o);
	/**
	 * 查询trip表中按车次站点提货时间的顺序
	 * @param c
	 * @return
	 */
	public List<BookSheetTrip> queryBookSheetTrip(OrderCarEntity c);
	/**
	 * 更新trip表中seq字段值
	 * @param trip
	 */
	public void updateTripSeq(BookSheetTrip trip);
	
	/**
	 * 根据orderCode查找最大的运输单号
	 * @param o
	 * @return
	 */
	public OrderCarEntity queryMaxTransportCode(OrderCarEntity o);
	/**
	 * 根据location_name查找id
	 * @param tempCar
	 * @return
	 */
	public Ioc queryLocInfo(OrderCarEntity tempCar);
	/**
	 * 查询路单是否已经生成
	 * @param c
	 * @return
	 */
	public int queryBookingSheetNum(OrderCarEntity c);
	
}
