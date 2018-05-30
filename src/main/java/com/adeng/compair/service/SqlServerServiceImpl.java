package com.adeng.compair.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adeng.compair.entity.CompairClass;
import com.adeng.compair.entity.OrderCarEntity;
import com.adeng.compair.multDao.sqlServerDao.SqlServerDao;

@Service("sqlserverService")
public class SqlServerServiceImpl implements SqlServerService{
	@Autowired
	private SqlServerDao dao;
	
	/**
	 * 根据 处理状态查询车次主表和车次字表
	 * @return
	 */
	@Override
	public List<CompairClass> selectSmpvOrder(OrderCarEntity c){
		return dao.selectSmpvOrder(c);
	}

	/**
	 * 查询一个车次的零件总数
	 */
	@Override
	public int countPart(String orderCode) {
		return dao.countPart(orderCode);
	}

	/**
	 * 记录sqlserver车次失败信息
	 * @param car
	 */
	@Override
	public void logResult(OrderCarEntity car) {
		dao.logResult(car);
	}
	
	/**
	 * 查询车次主表中所有符合条件的车次信息
	 * @return
	 */
	@Transactional(value = "pstransactionManager")
	public List<OrderCarEntity> queryMainCar(){
		return dao.queryMainCar();
	}
	
	/**
	 * 查询订单对应的零件数
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> selectSmpvPart(OrderCarEntity c){
		return dao.selectSmpvPart(c);
	}

	/**
	 * 根据车次主表ExcelServerRCID和订单号查询第一条子表信息
	 * @param c
	 * @return
	 */
	public OrderCarEntity queryTempCarInfo(OrderCarEntity c) {
		return dao.queryTempCarInfo(c);
	}
	
	/**
	 * 根据订单号查询车次字表中零件信息
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> queryPartInfo(OrderCarEntity c){
		return dao.queryPartInfo(c);
	}
	
	/**
	 * 根据车次号查出所有的订单号
	 * @param c
	 * @return
	 */
	public List<OrderCarEntity> queryOrderCodeByCar(OrderCarEntity c){
		return dao.queryOrderCodeByCar(c);
	}
}
