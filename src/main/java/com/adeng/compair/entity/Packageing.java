package com.adeng.compair.entity;

import java.util.Date;

/**
 * 包装
 * 
 * @author Administrator
 * 
 */
public class Packageing {
	private Integer id;
	private String packageCode;//打包代码
	private String packageName;//包名
	private Character packageType;//包装类型
	private Integer length;//包装长度
	private Integer width;//包装宽度
	private Integer height;//包装高度
	private Integer weight;//包装重量
	private Integer levelNum;//级别数
	private Character isPress;
	private Integer maxNumberPerTray;
	private Integer trayNo;
	private Character isValid;
	private Date createDate;//创建日期
	private Integer createUserId;//创建用户标识
	private Date lastUpdateDate;//最新更新日期
	private Integer lastUpdateUserId;//最后更新用户标识
	private Integer foldingratio;//折叠率(上海通用项目)
	private String linecase;//衬格(上海通用项目)
	private String orderType;//有序类型

	public Packageing() {
		super();
	}

	public Packageing(Integer id, String packageCode, String packageName,
			Character packageType, Integer length, Integer width,
			Integer height, Integer weight, Integer levelNum,
			Character isPress, Integer maxNumberPerTray, Integer trayNo,
			Character isValid, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId,
			Integer foldingratio, String linecase, String orderType) {
		super();
		this.id = id;
		this.packageCode = packageCode;
		this.packageName = packageName;
		this.packageType = packageType;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.levelNum = levelNum;
		this.isPress = isPress;
		this.maxNumberPerTray = maxNumberPerTray;
		this.trayNo = trayNo;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.foldingratio = foldingratio;
		this.linecase = linecase;
		this.orderType = orderType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Character getPackageType() {
		return packageType;
	}

	public void setPackageType(Character packageType) {
		this.packageType = packageType;
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getLevelNum() {
		return levelNum;
	}

	public void setLevelNum(Integer levelNum) {
		this.levelNum = levelNum;
	}

	public Character getIsPress() {
		return isPress;
	}

	public void setIsPress(Character isPress) {
		this.isPress = isPress;
	}

	public Integer getMaxNumberPerTray() {
		return maxNumberPerTray;
	}

	public void setMaxNumberPerTray(Integer maxNumberPerTray) {
		this.maxNumberPerTray = maxNumberPerTray;
	}

	public Integer getTrayNo() {
		return trayNo;
	}

	public void setTrayNo(Integer trayNo) {
		this.trayNo = trayNo;
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

	public Integer getFoldingratio() {
		return foldingratio;
	}

	public void setFoldingratio(Integer foldingratio) {
		this.foldingratio = foldingratio;
	}

	public String getLinecase() {
		return linecase;
	}

	public void setLinecase(String linecase) {
		this.linecase = linecase;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "packageing [id=" + id + ", packageCode=" + packageCode
				+ ", packageName=" + packageName + ", packageType="
				+ packageType + ", length=" + length + ", width=" + width
				+ ", height=" + height + ", weight=" + weight + ", levelNum="
				+ levelNum + ", isPress=" + isPress + ", maxNumberPerTray="
				+ maxNumberPerTray + ", trayNo=" + trayNo + ", isValid="
				+ isValid + ", createDate=" + createDate + ", createUserId="
				+ createUserId + ", lastUpdateDate=" + lastUpdateDate
				+ ", lastUpdateUserId=" + lastUpdateUserId + ", foldingratio="
				+ foldingratio + ", linecase=" + linecase + ", orderType="
				+ orderType + "]";
	}

}
