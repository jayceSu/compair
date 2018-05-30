package com.adeng.compair.service;

import java.util.List;

import com.adeng.compair.entity.CompairClass;
import com.adeng.compair.entity.OrderCarEntity;

public interface SqlServerService {
	/**
	 * 根据 处理状态查询车次主表和车次字表
	 * @param c 
	 * @return
	 */
	public List<CompairClass> selectSmpvOrder(OrderCarEntity c);
	/**
	 * 查询一个车次的零件总数
	 */
	public int countPart(String orderCode);
	/**
	 * 记录sqlserver车次失败信息
	 * @param car
	 */
	public void logResult(OrderCarEntity car);
	/**
	 * 查询车次主表中所有符合条件的车次信息
	 * @return
	 */
	public List<OrderCarEntity> queryMainCar();
	/**
	 * 查询订单对应的零件数
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> selectSmpvPart(OrderCarEntity c);
	/**
	 * 根据车次主表ExcelServerRCID和订单号
	 * @param c
	 * @return
	 */
	public OrderCarEntity queryTempCarInfo(OrderCarEntity c);
	
	/**
	 * 根据订单号查询车次字表中零件信息
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> queryPartInfo(OrderCarEntity c);
	
	/**
	 * 根据车次号查出所有的订单号
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> queryOrderCodeByCar(OrderCarEntity c);
}
