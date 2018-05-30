package com.adeng.compair.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.adeng.compair.multDao.oracleDao.OracleDao;

@Service("oracleService")
public class OracleServiceImpl implements OracleService{

	@Autowired
	private OracleDao dao;
	
	
	
	/**
	 * 根据订单状态查询订单表和订单字表（0或1）
	 * @return
	 */
	@Override
	public List<OrderCarEntity> selectOrder() {
		List<OrderCarEntity> value =  dao.selectOrder();
		return value;
	}

	/**
	 * 车牌号是否存在。
	 * @param licensePlate
	 * @return
	 */
	@Override
	public Truck selectLicensePlatel(String planLicensePlateNumber) {
		return dao.selectLicensePlatel(planLicensePlateNumber);
	}

	/**
	 * 查询起始点是否存在
	 */
	@Override
	public Ioc selectCountLocation(String startingLocation) {
		return dao.selectCountLocation(startingLocation);
	}

	/**
	 * 查询车次号是否唯一
	 */
	@Override
	public List<BookingSheet> selectCountSheet(String trainNumber) {
		return dao.selectCountSheet(trainNumber);
	}

	/**
	 * 查询承运商
	 */
	@Override
	public Carrier selectCarrier(String carrierId) {
		return dao.selectCarrier(carrierId);
	}

	/**
	 * 查询订单的零件总数
	 */
	@Override
	public int countOrderCode(String orderCode) {
		return dao.countOrderCode(orderCode);
	}

	/**
	 * 去获取调度单ID
	 */
	@Override
	public Integer getOrderId() {
		return dao.getOrderId();
	}

	/**
	 * 插入到路单对应订单
	 */
	@Override
	public int insertBookingSheetOrder(BookingSheetOrder bookingSheetOrder) {
		return dao.insertBookingSheetOrder(bookingSheetOrder);
	}

	/**
	 * 插入到路单站点时间
	 */
	@Override
	public int insertBookSheetTrip(BookSheetTrip bookingSheetTrip) {
		return dao.insertBookSheetTrip(bookingSheetTrip);
	}
	
	/**
	 * 插入到路单
	 * @param bookingSheet
	 * @return
	 */
	public int insertBookingSeet(BookingSheet bookingSheet) {
		return dao.insertBookingSeet(bookingSheet);
	}
	
	/**
	 * 修改订单表的状态
	 * @param id
	 */
	public void UpdateOrderType(Integer orderCode) {
		dao.UpdateOrderType(orderCode);
	}

	/**
	 * 拆主表  插入
	 */
	@Override
	public int insertOrder(OrderInfo orderInfos) {
		return dao.insertOrder(orderInfos);
	}
	
	/**
	 * 获取父类ID
	 * @param id
	 * @return
	 */
	public List<OrderInfoItem> selectById(Integer id){
		return dao.selectById(id);
	}
	
	/**
	 * 修改零件的数量
	 */
	public int updatePart(Map<String, Object> map) {
		return dao.updatePart(map);
	}
	
	/**
	 * 拆子表  插入
	 */
	public int insertOrderItme(OrderInfoItem orderInfoItem) {
		return dao.insertOrderItme(orderInfoItem);
	}

	/**
	 * 根据订单号查询零件信息
	 * @param part
	 * @return
	 */
	public List<OrderCarEntity> queryOrderInfo(OrderCarEntity part){
		return dao.queryOrderInfo(part);
	}
	
	/**
	 * 根据订单号查询零件条数
	 * @param part
	 * @return
	 */
	public List<CompairClass> queryOrderCount(OrderCarEntity part) {
		return dao.queryOrderCount(part);
	}
	
	/**
	 * 保存路单
	 * @param car
	 * @return
	 */
	public int saveBookingSheet(OrderCarEntity car) {
		return dao.saveBookingSheet(car);
	}
	
	/**
	 * 保存路单对应订单信息
	 * @param c
	 */
	public void saveBookingSheetOrder(OrderCarEntity c) {
		dao.saveBookingSheetOrder(c);
	}
	
	/**
	 * 保存路单站点时间
	 * @param c
	 */
	public void saveBookingSheetTrip(OrderCarEntity c) {
		dao.saveBookingSheetTrip(c);
	}
	
	/**
	 * 生成主订单的拆分单
	 * @param order
	 * @return
	 */
	public int insertNewOrder(OrderCarEntity order) {
		return dao.insertNewOrder(order);
	}
	
	/**
	 * 更新订单子表中关联主表的新id
	 * @param order
	 */
	public void updateOrderItem(OrderCarEntity order) {
		dao.updateOrderItem(order);
	}
	
	/**
	 * 更新原订单子表中的qty
	 * @param order
	 */
	public void updateOrderItemNum(OrderCarEntity order) {
		dao.updateOrderItemNum(order);
	}
	
	/**
	 * 生成拆分后的子订单信息
	 * @param order
	 */
	public void insetOrderItem(OrderCarEntity order) {
		dao.insetOrderItem(order);
	}
	
	/**
	 * 根据订单号查询订单id
	 * @param count
	 * @return
	 */
	public List<Integer> queryOrderIdByOrderCode(OrderCarEntity count) {
		return dao.queryOrderIdByOrderCode(count);
	}

	@Override
	public void UpdateOrderType2(Integer integer) {
		dao.UpdateOrderType2(integer);
		
	}
	
	/**
	 * 查询原子表订单信息
	 * @param order
	 * @return
	 */
	public OrderCarEntity queryOldOrderInfo(OrderCarEntity order) {
		return dao.queryOldOrderInfo(order);
	}
	
	/**
	 * 查询bookingSheetOrder绑定的orderID是否已存在
	 * @param c
	 * @return
	 */
	public int queryCountBookingSheetOrder(OrderCarEntity c) {
		return dao.queryCountBookingSheetOrder(c);
	}
	
	/**
	 * 根据orderId查询对比的实体
	 * @param c
	 * @return
	 */
	public OrderCarEntity queryBaseOrder(OrderCarEntity c) {
		return dao.queryBaseOrder(c);
	}
	
	/**
	 * 查询指定orderId下是否存在零件
	 * @param temp
	 * @return
	 */
	public int queryPartIsExistOrder(OrderCarEntity temp) {
		return dao.queryPartIsExistOrder(temp);
	}
	
	/**
	 * 查询订单主表中同orderCode的记录条数
	 * @param o
	 * @return
	 */
	public int queryOrderCountByOrderCode(OrderCarEntity o) {
		return dao.queryOrderCountByOrderCode(o);
	}
	
	/**
	 * 更新子表中原orderId下满足零件号的orderId
	 * @param o
	 */
	public void updateOrderItemId(OrderCarEntity o) {
		dao.updateOrderItemId(o);
	}
	
	/**
	 * 查询trip表中按车次站点提货时间的顺序
	 * @param c
	 * @return
	 */
	public List<BookSheetTrip> queryBookSheetTrip(OrderCarEntity c){
		return dao.queryBookSheetTrip(c);
	}
	
	/**
	 * 更新trip表中seq字段值
	 * @param trip
	 */
	public void updateTripSeq(BookSheetTrip trip) {
		dao.updateTripSeq(trip);
	}
	

	/**
	 * 根据orderCode查找最大的运输单号
	 * @param o
	 * @return
	 */
	public OrderCarEntity queryMaxTransportCode(OrderCarEntity o) {
		return dao.queryMaxTransportCode(o);
	}
	
	/**
	 * 根据location_name查找id
	 * @param tempCar
	 * @return
	 */
	public Ioc queryLocInfo(OrderCarEntity tempCar) {
		return dao.queryLocInfo(tempCar);
	}
}
