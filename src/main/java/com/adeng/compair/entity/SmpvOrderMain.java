package com.adeng.compair.entity;

import java.util.Date;
import java.util.List;

/**
 * 车次主表
 * 
 * @author Administrator
 * 
 */
public class SmpvOrderMain {
	private Date dates;// 日期
	private String commonCarrier;// 承运商
	private String trainNumber;// 车次
	private Date deliveryDatel;// 提货日期
	private String startingLocation;// 起始地点
	private Date taskStartTime;// 任务开始时间
	private Date taskEndTime;// 任务结束时间
	private String planLicensePlateNumber;// 计划车牌号
	private String actualLicensePlateNumber;// 实际车牌号
	private String planDriverName;// 计划司机姓名
	private String actualDriverName;// 实际司机姓名
	private String planDriverPhone;// 计划司机手机号
	private String actualDriverPhone;// 实际手机号
	private String ExcelServerRCID;
	private String ExcelServerRC1;
	private String ExcelServerWIID;
	private String ExcelServerRTID;
	private Integer ExcelServerRN;
	private Integer ExcelServerCN;
	private Integer ExcelServerCHG;
	private String processingState;// 处理状态
	private String processingDescription;// 处理描述
	private List<SmpvOrderDetail> smpv_Order_Details;

	public SmpvOrderMain() {
		super();
	}

	public SmpvOrderMain(Date dates, String commonCarrier,
			String trainNumber, Date deliveryDatel, String startingLocation,
			Date taskStartTime, Date taskEndTime,
			String planLicensePlateNumber, String actualLicensePlateNumber,
			String planDriverName, String actualDriverName,
			String planDriverPhone, String actualDriverPhone,
			String excelServerRCID, String excelServerRC1,
			String excelServerWIID, String excelServerRTID,
			Integer excelServerRN, Integer excelServerCN,
			Integer excelServerCHG, String processingState,
			String processingDescription,
			List<SmpvOrderDetail> smpv_Order_Details) {
		super();
		this.dates = dates;
		this.commonCarrier = commonCarrier;
		this.trainNumber = trainNumber;
		this.deliveryDatel = deliveryDatel;
		this.startingLocation = startingLocation;
		this.taskStartTime = taskStartTime;
		this.taskEndTime = taskEndTime;
		this.planLicensePlateNumber = planLicensePlateNumber;
		this.actualLicensePlateNumber = actualLicensePlateNumber;
		this.planDriverName = planDriverName;
		this.actualDriverName = actualDriverName;
		this.planDriverPhone = planDriverPhone;
		this.actualDriverPhone = actualDriverPhone;
		ExcelServerRCID = excelServerRCID;
		ExcelServerRC1 = excelServerRC1;
		ExcelServerWIID = excelServerWIID;
		ExcelServerRTID = excelServerRTID;
		ExcelServerRN = excelServerRN;
		ExcelServerCN = excelServerCN;
		ExcelServerCHG = excelServerCHG;
		this.processingState = processingState;
		this.processingDescription = processingDescription;
		this.smpv_Order_Details = smpv_Order_Details;
	}

	public Date getDates() {
		return dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public String getCommonCarrier() {
		return commonCarrier;
	}

	public void setCommonCarrier(String commonCarrier) {
		this.commonCarrier = commonCarrier;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDeliveryDatel() {
		return deliveryDatel;
	}

	public void setDeliveryDatel(Date deliveryDatel) {
		this.deliveryDatel = deliveryDatel;
	}

	public String getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public Date getTaskEndTime() {
		return taskEndTime;
	}

	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public String getPlanLicensePlateNumber() {
		return planLicensePlateNumber;
	}

	public void setPlanLicensePlateNumber(String planLicensePlateNumber) {
		this.planLicensePlateNumber = planLicensePlateNumber;
	}

	public String getActualLicensePlateNumber() {
		return actualLicensePlateNumber;
	}

	public void setActualLicensePlateNumber(String actualLicensePlateNumber) {
		this.actualLicensePlateNumber = actualLicensePlateNumber;
	}

	public String getPlanDriverName() {
		return planDriverName;
	}

	public void setPlanDriverName(String planDriverName) {
		this.planDriverName = planDriverName;
	}

	public String getActualDriverName() {
		return actualDriverName;
	}

	public void setActualDriverName(String actualDriverName) {
		this.actualDriverName = actualDriverName;
	}

	public String getPlanDriverPhone() {
		return planDriverPhone;
	}

	public void setPlanDriverPhone(String planDriverPhone) {
		this.planDriverPhone = planDriverPhone;
	}

	public String getActualDriverPhone() {
		return actualDriverPhone;
	}

	public void setActualDriverPhone(String actualDriverPhone) {
		this.actualDriverPhone = actualDriverPhone;
	}

	public String getExcelServerRCID() {
		return ExcelServerRCID;
	}

	public void setExcelServerRCID(String excelServerRCID) {
		ExcelServerRCID = excelServerRCID;
	}

	public String getExcelServerRC1() {
		return ExcelServerRC1;
	}

	public void setExcelServerRC1(String excelServerRC1) {
		ExcelServerRC1 = excelServerRC1;
	}

	public String getExcelServerWIID() {
		return ExcelServerWIID;
	}

	public void setExcelServerWIID(String excelServerWIID) {
		ExcelServerWIID = excelServerWIID;
	}

	public String getExcelServerRTID() {
		return ExcelServerRTID;
	}

	public void setExcelServerRTID(String excelServerRTID) {
		ExcelServerRTID = excelServerRTID;
	}

	public Integer getExcelServerRN() {
		return ExcelServerRN;
	}

	public void setExcelServerRN(Integer excelServerRN) {
		ExcelServerRN = excelServerRN;
	}

	public Integer getExcelServerCN() {
		return ExcelServerCN;
	}

	public void setExcelServerCN(Integer excelServerCN) {
		ExcelServerCN = excelServerCN;
	}

	public Integer getExcelServerCHG() {
		return ExcelServerCHG;
	}

	public void setExcelServerCHG(Integer excelServerCHG) {
		ExcelServerCHG = excelServerCHG;
	}

	public String getProcessingState() {
		return processingState;
	}

	public void setProcessingState(String processingState) {
		this.processingState = processingState;
	}

	public String getProcessingDescription() {
		return processingDescription;
	}

	public void setProcessingDescription(String processingDescription) {
		this.processingDescription = processingDescription;
	}

	public List<SmpvOrderDetail> getSmpv_Order_Details() {
		return smpv_Order_Details;
	}

	public void setSmpv_Order_Details(List<SmpvOrderDetail> smpv_Order_Details) {
		this.smpv_Order_Details = smpv_Order_Details;
	}

	@Override
	public String toString() {
		return "Smpv_Order_Main [dates=" + dates + ", commonCarrier="
				+ commonCarrier + ", trainNumber=" + trainNumber
				+ ", deliveryDatel=" + deliveryDatel + ", startingLocation="
				+ startingLocation + ", taskStartTime=" + taskStartTime
				+ ", taskEndTime=" + taskEndTime + ", planLicensePlateNumber="
				+ planLicensePlateNumber + ", actualLicensePlateNumber="
				+ actualLicensePlateNumber + ", planDriverName="
				+ planDriverName + ", actualDriverName=" + actualDriverName
				+ ", planDriverPhone=" + planDriverPhone
				+ ", actualDriverPhone=" + actualDriverPhone
				+ ", ExcelServerRCID=" + ExcelServerRCID + ", ExcelServerRC1="
				+ ExcelServerRC1 + ", ExcelServerWIID=" + ExcelServerWIID
				+ ", ExcelServerRTID=" + ExcelServerRTID + ", ExcelServerRN="
				+ ExcelServerRN + ", ExcelServerCN=" + ExcelServerCN
				+ ", ExcelServerCHG=" + ExcelServerCHG + ", processingState="
				+ processingState + ", processingDescription="
				+ processingDescription + ", smpv_Order_Details="
				+ smpv_Order_Details + "]";
	}

}
