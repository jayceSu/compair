package com.adeng.compair.entity;

import java.util.Date;

/**
 * 路单
 * 
 * @author Administrator
 * 
 */
public class BookingSheet {
	private Integer id;// 主键ID(PK)
	private String bookingSheetNum;// 调度单号
	private Character bookingSheetype;// 调度单状态(2已调度、3已发运、4已完成)
	private Integer truckId;// 卡车ID(FK)
	private String driverName;// 司机名称
	private String driverPhone;// 司机电话
	private Date bookingSheetDate;// 调度日期
	private Character isValue;// 是否有效
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID(FK)
	private Integer carrierId;// 承运商ID(FK)
	private String gpsNumber;// GPS编号
	private Integer routeId;// 路线ID(FK)
	private Date monitorStartTime;// 监控开始时间
	private Date monitorEndTime;// 监控结束时间
	private Character isMonitor;// 是否生成监控(1:是，0:否)
	private Character dataFrom;// 数据来源（1：GPS，2：手工录入）
	private Integer bookingRouteId;
	private Integer run;
	private Integer truckTypeId;
	private Integer cubeiqRate;
	private Character syncFlag;
	private Integer weightRate;
	private Character pdrType;
	private Integer solidRateFord;
	private Character isSend;
	private Character isSendCq;// 是否发送（重庆水运同步CCWMS 标记是否发送）
	private String transType;// 运输方式（水运、陆运、空运）(重庆杭州项目)
	private String containerNum;// 集装箱号(不等于空，为CC重庆)
	private String cjlrStatus;// CJLR状态（常熟路虎项目）0 未发送 1 发送中 2 已发送
	private String tailafterType;// 集装箱号(不等于空，为CC重庆)

	public BookingSheet(Integer id, String bookingSheetNum,
			Character bookingSheetype, Integer truckId, String driverName,
			String driverPhone, Date bookingSheetDate, Character isValue,
			Date createDate, Integer createUserId, Date lastUpdateDate,
			Integer lastUpdateUserId, Integer carrierId, String gpsNumber,
			Integer routeId, Date monitorStartTime, Date monitorEndTime,
			Character isMonitor, Character dataFrom, Integer bookingRouteId,
			Integer run, Integer truckTypeId, Integer cubeiqRate,
			Character syncFlag, Integer weightRate, Character pdrType,
			Integer solidRateFord, Character isSend, Character isSendCq,
			String transType, String containerNum, String cjlrStatus,
			String tailafterType) {
		super();
		this.id = id;
		this.bookingSheetNum = bookingSheetNum;
		this.bookingSheetype = bookingSheetype;
		this.truckId = truckId;
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.bookingSheetDate = bookingSheetDate;
		this.isValue = isValue;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.carrierId = carrierId;
		this.gpsNumber = gpsNumber;
		this.routeId = routeId;
		this.monitorStartTime = monitorStartTime;
		this.monitorEndTime = monitorEndTime;
		this.isMonitor = isMonitor;
		this.dataFrom = dataFrom;
		this.bookingRouteId = bookingRouteId;
		this.run = run;
		this.truckTypeId = truckTypeId;
		this.cubeiqRate = cubeiqRate;
		this.syncFlag = syncFlag;
		this.weightRate = weightRate;
		this.pdrType = pdrType;
		this.solidRateFord = solidRateFord;
		this.isSend = isSend;
		this.isSendCq = isSendCq;
		this.transType = transType;
		this.containerNum = containerNum;
		this.cjlrStatus = cjlrStatus;
		this.tailafterType = tailafterType;
	}

	public BookingSheet() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookingSheetNum() {
		return bookingSheetNum;
	}

	public void setBookingSheetNum(String bookingSheetNum) {
		this.bookingSheetNum = bookingSheetNum;
	}

	public Character getBookingSheetype() {
		return bookingSheetype;
	}

	public void setBookingSheetype(Character bookingSheetype) {
		this.bookingSheetype = bookingSheetype;
	}

	public Integer getTruckId() {
		return truckId;
	}

	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public Date getBookingSheetDate() {
		return bookingSheetDate;
	}

	public void setBookingSheetDate(Date bookingSheetDate) {
		this.bookingSheetDate = bookingSheetDate;
	}

	public Character getIsValue() {
		return isValue;
	}

	public void setIsValue(Character isValue) {
		this.isValue = isValue;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Integer lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public String getGpsNumber() {
		return gpsNumber;
	}

	public void setGpsNumber(String gpsNumber) {
		this.gpsNumber = gpsNumber;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public Date getMonitorStartTime() {
		return monitorStartTime;
	}

	public void setMonitorStartTime(Date monitorStartTime) {
		this.monitorStartTime = monitorStartTime;
	}

	public Date getMonitorEndTime() {
		return monitorEndTime;
	}

	public void setMonitorEndTime(Date monitorEndTime) {
		this.monitorEndTime = monitorEndTime;
	}

	public Character getIsMonitor() {
		return isMonitor;
	}

	public void setIsMonitor(Character isMonitor) {
		this.isMonitor = isMonitor;
	}

	public Character getDataFrom() {
		return dataFrom;
	}

	public void setDataFrom(Character dataFrom) {
		this.dataFrom = dataFrom;
	}

	public Integer getBookingRouteId() {
		return bookingRouteId;
	}

	public void setBookingRouteId(Integer bookingRouteId) {
		this.bookingRouteId = bookingRouteId;
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	public Integer getTruckTypeId() {
		return truckTypeId;
	}

	public void setTruckTypeId(Integer truckTypeId) {
		this.truckTypeId = truckTypeId;
	}

	public Integer getCubeiqRate() {
		return cubeiqRate;
	}

	public void setCubeiqRate(Integer cubeiqRate) {
		this.cubeiqRate = cubeiqRate;
	}

	public Character getSyncFlag() {
		return syncFlag;
	}

	public void setSyncFlag(Character syncFlag) {
		this.syncFlag = syncFlag;
	}

	public Integer getWeightRate() {
		return weightRate;
	}

	public void setWeightRate(Integer weightRate) {
		this.weightRate = weightRate;
	}

	public Character getPdrType() {
		return pdrType;
	}

	public void setPdrType(Character pdrType) {
		this.pdrType = pdrType;
	}

	public Integer getSolidRateFord() {
		return solidRateFord;
	}

	public void setSolidRateFord(Integer solidRateFord) {
		this.solidRateFord = solidRateFord;
	}

	public Character getIsSend() {
		return isSend;
	}

	public void setIsSend(Character isSend) {
		this.isSend = isSend;
	}

	public Character getIsSendCq() {
		return isSendCq;
	}

	public void setIsSendCq(Character isSendCq) {
		this.isSendCq = isSendCq;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getContainerNum() {
		return containerNum;
	}

	public void setContainerNum(String containerNum) {
		this.containerNum = containerNum;
	}

	public String getCjlrStatus() {
		return cjlrStatus;
	}

	public void setCjlrStatus(String cjlrStatus) {
		this.cjlrStatus = cjlrStatus;
	}

	public String getTailafterType() {
		return tailafterType;
	}

	public void setTailafterType(String tailafterType) {
		this.tailafterType = tailafterType;
	}

	@Override
	public String toString() {
		return "BookingSheet [id=" + id + ", bookingSheetNum="
				+ bookingSheetNum + ", bookingSheetype=" + bookingSheetype
				+ ", truckId=" + truckId + ", driverName=" + driverName
				+ ", driverPhone=" + driverPhone + ", bookingSheetDate="
				+ bookingSheetDate + ", isValue=" + isValue + ", createDate="
				+ createDate + ", createUserId=" + createUserId
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUserId="
				+ lastUpdateUserId + ", carrierId=" + carrierId
				+ ", gpsNumber=" + gpsNumber + ", routeId=" + routeId
				+ ", monitorStartTime=" + monitorStartTime
				+ ", monitorEndTime=" + monitorEndTime + ", isMonitor="
				+ isMonitor + ", dataFrom=" + dataFrom + ", bookingRouteId="
				+ bookingRouteId + ", run=" + run + ", truckTypeId="
				+ truckTypeId + ", cubeiqRate=" + cubeiqRate + ", syncFlag="
				+ syncFlag + ", weightRate=" + weightRate + ", pdrType="
				+ pdrType + ", solidRateFord=" + solidRateFord + ", isSend="
				+ isSend + ", isSendCq=" + isSendCq + ", transType="
				+ transType + ", containerNum=" + containerNum
				+ ", cjlrStatus=" + cjlrStatus + ", tailafterType="
				+ tailafterType + "]";
	}

}
