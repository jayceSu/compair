package com.adeng.compair.entity;

/**
 * 订单子表
 * 
 * @author Administrator
 * 
 */
public class OrderInfoItem {
	private Integer id;// 主键ID
	private Integer orderInfoId;// 订单ID
	private String partReference;// 零件号
	private String partName;// 零件描述(品名)
	private Integer packageQty;// 单位数
	private Integer qty;// 数量
	private String unit;// 单位
	private Integer length;// 外包装长（厘米）
	private Integer width;// 外包装宽（厘米）
	private Integer height;// 外包装高（厘米）
	private Integer amountWeight;// 总重量（千克）
	private String supplierCode;// 供应商代码
	private String supplierName;// 供应商名称
	private String remark;// 备注
	private String packageCode;
	private Integer realQty;
	private Integer solidRate;
	private Integer liquidRate;
	private Integer partCube;
	private Integer pallet;
	private Integer factPackpages;
	private Integer truckRate;
	private Character isConfirm;
	private Integer weightRate;
	private String asnCode;
	private String receiveDate;
	private String sylifeshenNum;
	private Integer versionNumber;// 版本号(上海通用项目)
	private Integer realTakeNumber;// 实取数量(上海通用项目)
	private Character disposedStatus;// 处理状态(上海通用项目)
	private String poItemNo;// PO_ITEM号(上海通用项目)
	private String docNum;// DOC_NUM(上海通用项目)
	private String poNo;

	public OrderInfoItem() {
		super();
	}

	public OrderInfoItem(Integer id, Integer orderInfoId, String partReference,
			String partName, Integer packageQty, Integer qty, String unit,
			Integer length, Integer width, Integer height,
			Integer amountWeight, String supplierCode, String supplierName,
			String remark, String packageCode, Integer realQty,
			Integer solidRate, Integer liquidRate, Integer partCube,
			Integer pallet, Integer factPackpages, Integer truckRate,
			Character isConfirm, Integer weightRate, String asnCode,
			String receiveDate, String sylifeshenNum, Integer versionNumber,
			Integer realTakeNumber, Character disposedStatus, String poItemNo,
			String docNum, String poNo) {
		super();
		this.id = id;
		this.orderInfoId = orderInfoId;
		this.partReference = partReference;
		this.partName = partName;
		this.packageQty = packageQty;
		this.qty = qty;
		this.unit = unit;
		this.length = length;
		this.width = width;
		this.height = height;
		this.amountWeight = amountWeight;
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.remark = remark;
		this.packageCode = packageCode;
		this.realQty = realQty;
		this.solidRate = solidRate;
		this.liquidRate = liquidRate;
		this.partCube = partCube;
		this.pallet = pallet;
		this.factPackpages = factPackpages;
		this.truckRate = truckRate;
		this.isConfirm = isConfirm;
		this.weightRate = weightRate;
		this.asnCode = asnCode;
		this.receiveDate = receiveDate;
		this.sylifeshenNum = sylifeshenNum;
		this.versionNumber = versionNumber;
		this.realTakeNumber = realTakeNumber;
		this.disposedStatus = disposedStatus;
		this.poItemNo = poItemNo;
		this.docNum = docNum;
		this.poNo = poNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderInfoId() {
		return orderInfoId;
	}

	public void setOrderInfoId(Integer orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public String getPartReference() {
		return partReference;
	}

	public void setPartReference(String partReference) {
		this.partReference = partReference;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public Integer getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Integer packageQty) {
		this.packageQty = packageQty;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public Integer getAmountWeight() {
		return amountWeight;
	}

	public void setAmountWeight(Integer amountWeight) {
		this.amountWeight = amountWeight;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public Integer getRealQty() {
		return realQty;
	}

	public void setRealQty(Integer realQty) {
		this.realQty = realQty;
	}

	public Integer getSolidRate() {
		return solidRate;
	}

	public void setSolidRate(Integer solidRate) {
		this.solidRate = solidRate;
	}

	public Integer getLiquidRate() {
		return liquidRate;
	}

	public void setLiquidRate(Integer liquidRate) {
		this.liquidRate = liquidRate;
	}

	public Integer getPartCube() {
		return partCube;
	}

	public void setPartCube(Integer partCube) {
		this.partCube = partCube;
	}

	public Integer getPallet() {
		return pallet;
	}

	public void setPallet(Integer pallet) {
		this.pallet = pallet;
	}

	public Integer getFactPackpages() {
		return factPackpages;
	}

	public void setFactPackpages(Integer factPackpages) {
		this.factPackpages = factPackpages;
	}

	public Integer getTruckRate() {
		return truckRate;
	}

	public void setTruckRate(Integer truckRate) {
		this.truckRate = truckRate;
	}

	public Character getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Character isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Integer getWeightRate() {
		return weightRate;
	}

	public void setWeightRate(Integer weightRate) {
		this.weightRate = weightRate;
	}

	public String getAsnCode() {
		return asnCode;
	}

	public void setAsnCode(String asnCode) {
		this.asnCode = asnCode;
	}

	public String getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(String receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getSylifeshenNum() {
		return sylifeshenNum;
	}

	public void setSylifeshenNum(String sylifeshenNum) {
		this.sylifeshenNum = sylifeshenNum;
	}

	public Integer getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Integer getRealTakeNumber() {
		return realTakeNumber;
	}

	public void setRealTakeNumber(Integer realTakeNumber) {
		this.realTakeNumber = realTakeNumber;
	}

	public Character getDisposedStatus() {
		return disposedStatus;
	}

	public void setDisposedStatus(Character disposedStatus) {
		this.disposedStatus = disposedStatus;
	}

	public String getPoItemNo() {
		return poItemNo;
	}

	public void setPoItemNo(String poItemNo) {
		this.poItemNo = poItemNo;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	@Override
	public String toString() {
		return "OrderInfoItem [id=" + id + ", orderInfoId=" + orderInfoId
				+ ", partReference=" + partReference + ", partName=" + partName
				+ ", packageQty=" + packageQty + ", qty=" + qty + ", unit="
				+ unit + ", length=" + length + ", width=" + width
				+ ", height=" + height + ", amountWeight=" + amountWeight
				+ ", supplierCode=" + supplierCode + ", supplierName="
				+ supplierName + ", remark=" + remark + ", packageCode="
				+ packageCode + ", realQty=" + realQty + ", solidRate="
				+ solidRate + ", liquidRate=" + liquidRate + ", partCube="
				+ partCube + ", pallet=" + pallet + ", factPackpages="
				+ factPackpages + ", truckRate=" + truckRate + ", isConfirm="
				+ isConfirm + ", weightRate=" + weightRate + ", asnCode="
				+ asnCode + ", receiveDate=" + receiveDate + ", sylifeshenNum="
				+ sylifeshenNum + ", versionNumber=" + versionNumber
				+ ", realTakeNumber=" + realTakeNumber + ", disposedStatus="
				+ disposedStatus + ", poItemNo=" + poItemNo + ", docNum="
				+ docNum + ", poNo=" + poNo + "]";
	}

}
