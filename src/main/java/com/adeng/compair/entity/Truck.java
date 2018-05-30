package com.adeng.compair.entity;

import java.util.Date;

/**
 * 卡车
 * 
 * @author Administrator
 * 
 */
public class Truck {
	private Integer id;// ID（主键）
	private String licensePlate;// 车牌号（加承运商唯一）
	private String truckType;// 车辆类型(1飞翼、2高杆、3平板、4箱车、5帘布)
	private String gpsNumber;// GPS编号
	private Integer carrierId;// 承运商
	private Integer length;// 长(米)
	private Integer width;// 宽(米)
	private Integer height;// 高(米)
	private Integer tonnage;// 吨位
	private Character isValid;// 是否有效（默认1有效，0无效）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID
	private String driverName;
	private String driverPhone;
	private String truckStatus;
	private String transType;// 运输类型（DB短驳和GX干线，通用二期接口）
	private Character isState;//是否可以同步数据通用二期接口
	private Character isSend;// 是否发送（1已修改要发送，0未修改，通用二期接口同步基础数据）

	public Truck() {
		super();
	}

	public Truck(Integer id, String licensePlate, String truckType,
			String gpsNumber, Integer carrierId, Integer length, Integer width,
			Integer height, Integer tonnage, Character isValid,
			Date createDate, Integer createUserId, Date lastUpdateDate,
			Integer lastUpdateUserId, String driverName, String driverPhone,
			String truckStatus, String transType, Character isState,
			Character isSend) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.truckType = truckType;
		this.gpsNumber = gpsNumber;
		this.carrierId = carrierId;
		this.length = length;
		this.width = width;
		this.height = height;
		this.tonnage = tonnage;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.truckStatus = truckStatus;
		this.transType = transType;
		this.isState = isState;
		this.isSend = isSend;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getGpsNumber() {
		return gpsNumber;
	}

	public void setGpsNumber(String gpsNumber) {
		this.gpsNumber = gpsNumber;
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getTonnage() {
		return tonnage;
	}

	public void setTonnage(Integer tonnage) {
		this.tonnage = tonnage;
	}

	public Character getIsValid() {
		return isValid;
	}

	public void setIsValid(Character isValid) {
		this.isValid = isValid;
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

	public String getTruckStatus() {
		return truckStatus;
	}

	public void setTruckStatus(String truckStatus) {
		this.truckStatus = truckStatus;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Character getIsState() {
		return isState;
	}

	public void setIsState(Character isState) {
		this.isState = isState;
	}

	public Character getIsSend() {
		return isSend;
	}

	public void setIsSend(Character isSend) {
		this.isSend = isSend;
	}

	@Override
	public String toString() {
		return "truck [id=" + id + ", licensePlate=" + licensePlate
				+ ", truckType=" + truckType + ", gpsNumber=" + gpsNumber
				+ ", carrierId=" + carrierId + ", length=" + length
				+ ", width=" + width + ", height=" + height + ", tonnage="
				+ tonnage + ", isValid=" + isValid + ", createDate="
				+ createDate + ", createUserId=" + createUserId
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUserId="
				+ lastUpdateUserId + ", driverName=" + driverName
				+ ", driverPhone=" + driverPhone + ", truckStatus="
				+ truckStatus + ", transType=" + transType + ", isState="
				+ isState + ", isSend=" + isSend + "]";
	}

}
