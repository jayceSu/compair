package com.adeng.compair.entity;

import java.util.Date;

/**
 * 订单主表和订单子表
 * 
 * @author Administrator
 * 
 */
public class OrderInfo2 {
	private Integer id;// 主键ID
	private String orderCode;// 原订单号
	private String transportCode;// 运输单号
	private Integer customerId;// 客户ID(FK)
	private Date pickup_time;// 提货时间
	private Date delivery_time;// 要货时间
	private Integer pickupLocationId;// 提货地点ID (FK)
	private Integer deliveryLocationId;// 卸货地点ID (FK)
	private Integer carrierId;// 承运商ID (FK)
	private Character orderType;// 订单状态(0未发布、1已发布、2已调度、3已发运、4已完成、U未生效5 CubeIQ已导出
								// 6 CubeIQ已上传 7已删除, 8已到港9已取货)
	private String version;// 版本号
	private String orderPublishedTime;// 订单发布时间
	private String orderSchedulingTime;// 订单调度时间
	private String orderShippingTime;// 订单发运时间
	private String orderCompleteTime;// 订单完成时间
	private Integer userTd;// 工程师(用户ID)
	private Character isLate;// 是否迟到(0为准时、1为迟到)
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID
	private Date actualPickupTime;// 实际提货时间
	private Date actualDeliveryTime;// 实际到货时间
	private Character pickupIsLate;// 是否迟到(0为准时、1为迟到)
	private Character isDamag;// 是否破损(0为否、1为是)
	private Integer locMatrixEngineerId;// 点到点参数设置(FK)
	private Character operateType;// 操作类型
	private String xmlVersion;
	private Date orderDate;
	private Date docCutOffDate;
	private Date etdDate;
	private String deliverPort;
	private String mtiNumber;
	private Integer projectId;
	private Character orderProjectGs;
	private String remark;
	private String fordFileName;
	private Integer itemId;
	private Character orderPartType;
	private String orderRowNum;
	private Character isConfirm;
	private Character isAddPart;
	private Character isSend;
	private Date pusPickupTime;// 路单提货时间（路线模板）
	private Date pusDeliveryTime;// 路单要货时间（路线模板）
	private String sylifeshenNum;
	private Integer ccLocationId;// 标记中转点 (上海汽车项目)
	private String dlvContactname;// 卸货点联系人 (上海汽车项目)
	private String dlvTel;// 联系人电话(上海汽车项目)
	private String dlvAddress;// 卸货地址 (上海汽车项目)
	private String picContactname;// 提货点联系人(上海汽车项目)
	private String picTel;
	private String picAddress;// 提货点地址(上海汽车项目)
	private Date ccArrivalTime;// CC到达时间(上海汽车订单接口)(上海汽车项目)
	private Date ccLeaveTime;// CC离开时间(上海汽车订单接口)(上海汽车项目)
	private String ccCode;// 仓库代码(CCWMS仓库代码)(上海汽车项目)
	private String transportMode;// 运输模式(上海通用项目)整车（ZC）、零担（LD）、空运（KY）
	private String orderInfoType;// 订单类型(上海通用项目)
									// VMI订单(VMI)、PUS订单(PUS)、空箱订单(KX)、其他订单(QT）
	private String newOrderId;// 仓库代码(CCWMS仓库代码)(上海汽车项目)
	private Character disposedStatus;
	private Character shippersConfirmStatus;// 承运商确认状态(上海通用项目)（0未确认，1已确认）
	private String poNo;// PO 号(常熟路虎项目)
	private Date claimGoodsTime;// 取货时间
	private Character pusStatus;// 通用反馈订单状态
	// 子表
	private Integer idItm;// 主键ID
	private Integer orderInfoId;// 订单ID
	private String partReference;// 零件号
	private String partName;// 零件描述(品名)
	private Integer packageQty;// 单位数
	private Integer qty;// 数量
	private String unitl;// 单位
	private Integer length;// 外包装长（厘米）
	private Integer width;// 外包装宽（厘米）
	private Integer height;// 外包装高（厘米）
	private Integer amountWeight;// 总重量（千克）
	private String supplierCode;// 供应商代码
	private String supplierName;// 供应商名称
	private String remarkItme;// 备注
	private String packageCode;
	private Integer realQty;
	private Integer solidRate;
	private Integer liquidRate;
	private Integer partCube;
	private Integer pallet;
	private Integer factPackpages;
	private Integer truckRate;
	private Character isConfirmitme;
	private Integer weightRate;
	private String asnCode;
	private String receiveDate;
	private String sylifeshenNumItme;
	private Integer versionNumber;// 版本号(上海通用项目)
	private Integer realTakeNumber;// 实取数量(上海通用项目)
	private Character disposedStatusItme;// 处理状态(上海通用项目)
	private String poItemNo;// PO_ITEM号(上海通用项目)
	private String docNum;// DOC_NUM(上海通用项目)
	private String poNoItme;

	public OrderInfo2() {
		super();
	}

	public OrderInfo2(Integer id, String orderCode, String transportCode,
			Integer customerId, Date pickup_time, Date delivery_time,
			Integer pickupLocationId, Integer deliveryLocationId,
			Integer carrierId, Character orderType, String version,
			String orderPublishedTime, String orderSchedulingTime,
			String orderShippingTime, String orderCompleteTime, Integer userTd,
			Character isLate, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId,
			Date actualPickupTime, Date actualDeliveryTime,
			Character pickupIsLate, Character isDamag,
			Integer locMatrixEngineerId, Character operateType,
			String xmlVersion, Date orderDate, Date docCutOffDate,
			Date etdDate, String deliverPort, String mtiNumber,
			Integer projectId, Character orderProjectGs, String remark,
			String fordFileName, Integer itemId, Character orderPartType,
			String orderRowNum, Character isConfirm, Character isAddPart,
			Character isSend, Date pusPickupTime, Date pusDeliveryTime,
			String sylifeshenNum, Integer ccLocationId, String dlvContactname,
			String dlvTel, String dlvAddress, String picContactname,
			String picTel, String picAddress, Date ccArrivalTime,
			Date ccLeaveTime, String ccCode, String transportMode,
			String orderInfoType, String newOrderId, Character disposedStatus,
			Character shippersConfirmStatus, String poNo, Date claimGoodsTime,
			Character pusStatus, Integer idItm, Integer orderInfoId,
			String partReference, String partName, Integer packageQty,
			Integer qty, String unitl, Integer length, Integer width,
			Integer height, Integer amountWeight, String supplierCode,
			String supplierName, String remarkItme, String packageCode,
			Integer realQty, Integer solidRate, Integer liquidRate,
			Integer partCube, Integer pallet, Integer factPackpages,
			Integer truckRate, Character isConfirmitme, Integer weightRate,
			String asnCode, String receiveDate, String sylifeshenNumItme,
			Integer versionNumber, Integer realTakeNumber,
			Character disposedStatusItme, String poItemNo, String docNum,
			String poNoItme) {
		super();
		this.id = id;
		this.orderCode = orderCode;
		this.transportCode = transportCode;
		this.customerId = customerId;
		this.pickup_time = pickup_time;
		this.delivery_time = delivery_time;
		this.pickupLocationId = pickupLocationId;
		this.deliveryLocationId = deliveryLocationId;
		this.carrierId = carrierId;
		this.orderType = orderType;
		this.version = version;
		this.orderPublishedTime = orderPublishedTime;
		this.orderSchedulingTime = orderSchedulingTime;
		this.orderShippingTime = orderShippingTime;
		this.orderCompleteTime = orderCompleteTime;
		this.userTd = userTd;
		this.isLate = isLate;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.actualPickupTime = actualPickupTime;
		this.actualDeliveryTime = actualDeliveryTime;
		this.pickupIsLate = pickupIsLate;
		this.isDamag = isDamag;
		this.locMatrixEngineerId = locMatrixEngineerId;
		this.operateType = operateType;
		this.xmlVersion = xmlVersion;
		this.orderDate = orderDate;
		this.docCutOffDate = docCutOffDate;
		this.etdDate = etdDate;
		this.deliverPort = deliverPort;
		this.mtiNumber = mtiNumber;
		this.projectId = projectId;
		this.orderProjectGs = orderProjectGs;
		this.remark = remark;
		this.fordFileName = fordFileName;
		this.itemId = itemId;
		this.orderPartType = orderPartType;
		this.orderRowNum = orderRowNum;
		this.isConfirm = isConfirm;
		this.isAddPart = isAddPart;
		this.isSend = isSend;
		this.pusPickupTime = pusPickupTime;
		this.pusDeliveryTime = pusDeliveryTime;
		this.sylifeshenNum = sylifeshenNum;
		this.ccLocationId = ccLocationId;
		this.dlvContactname = dlvContactname;
		this.dlvTel = dlvTel;
		this.dlvAddress = dlvAddress;
		this.picContactname = picContactname;
		this.picTel = picTel;
		this.picAddress = picAddress;
		this.ccArrivalTime = ccArrivalTime;
		this.ccLeaveTime = ccLeaveTime;
		this.ccCode = ccCode;
		this.transportMode = transportMode;
		this.orderInfoType = orderInfoType;
		this.newOrderId = newOrderId;
		this.disposedStatus = disposedStatus;
		this.shippersConfirmStatus = shippersConfirmStatus;
		this.poNo = poNo;
		this.claimGoodsTime = claimGoodsTime;
		this.pusStatus = pusStatus;
		this.idItm = idItm;
		this.orderInfoId = orderInfoId;
		this.partReference = partReference;
		this.partName = partName;
		this.packageQty = packageQty;
		this.qty = qty;
		this.unitl = unitl;
		this.length = length;
		this.width = width;
		this.height = height;
		this.amountWeight = amountWeight;
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.remarkItme = remarkItme;
		this.packageCode = packageCode;
		this.realQty = realQty;
		this.solidRate = solidRate;
		this.liquidRate = liquidRate;
		this.partCube = partCube;
		this.pallet = pallet;
		this.factPackpages = factPackpages;
		this.truckRate = truckRate;
		this.isConfirmitme = isConfirmitme;
		this.weightRate = weightRate;
		this.asnCode = asnCode;
		this.receiveDate = receiveDate;
		this.sylifeshenNumItme = sylifeshenNumItme;
		this.versionNumber = versionNumber;
		this.realTakeNumber = realTakeNumber;
		this.disposedStatusItme = disposedStatusItme;
		this.poItemNo = poItemNo;
		this.docNum = docNum;
		this.poNoItme = poNoItme;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getTransportCode() {
		return transportCode;
	}

	public void setTransportCode(String transportCode) {
		this.transportCode = transportCode;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getPickup_time() {
		return pickup_time;
	}

	public void setPickup_time(Date pickup_time) {
		this.pickup_time = pickup_time;
	}

	public Date getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(Date delivery_time) {
		this.delivery_time = delivery_time;
	}

	public Integer getPickupLocationId() {
		return pickupLocationId;
	}

	public void setPickupLocationId(Integer pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}

	public Integer getDeliveryLocationId() {
		return deliveryLocationId;
	}

	public void setDeliveryLocationId(Integer deliveryLocationId) {
		this.deliveryLocationId = deliveryLocationId;
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public Character getOrderType() {
		return orderType;
	}

	public void setOrderType(Character orderType) {
		this.orderType = orderType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOrderPublishedTime() {
		return orderPublishedTime;
	}

	public void setOrderPublishedTime(String orderPublishedTime) {
		this.orderPublishedTime = orderPublishedTime;
	}

	public String getOrderSchedulingTime() {
		return orderSchedulingTime;
	}

	public void setOrderSchedulingTime(String orderSchedulingTime) {
		this.orderSchedulingTime = orderSchedulingTime;
	}

	public String getOrderShippingTime() {
		return orderShippingTime;
	}

	public void setOrderShippingTime(String orderShippingTime) {
		this.orderShippingTime = orderShippingTime;
	}

	public String getOrderCompleteTime() {
		return orderCompleteTime;
	}

	public void setOrderCompleteTime(String orderCompleteTime) {
		this.orderCompleteTime = orderCompleteTime;
	}

	public Integer getUserTd() {
		return userTd;
	}

	public void setUserTd(Integer userTd) {
		this.userTd = userTd;
	}

	public Character getIsLate() {
		return isLate;
	}

	public void setIsLate(Character isLate) {
		this.isLate = isLate;
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

	public Date getActualPickupTime() {
		return actualPickupTime;
	}

	public void setActualPickupTime(Date actualPickupTime) {
		this.actualPickupTime = actualPickupTime;
	}

	public Date getActualDeliveryTime() {
		return actualDeliveryTime;
	}

	public void setActualDeliveryTime(Date actualDeliveryTime) {
		this.actualDeliveryTime = actualDeliveryTime;
	}

	public Character getPickupIsLate() {
		return pickupIsLate;
	}

	public void setPickupIsLate(Character pickupIsLate) {
		this.pickupIsLate = pickupIsLate;
	}

	public Character getIsDamag() {
		return isDamag;
	}

	public void setIsDamag(Character isDamag) {
		this.isDamag = isDamag;
	}

	public Integer getLocMatrixEngineerId() {
		return locMatrixEngineerId;
	}

	public void setLocMatrixEngineerId(Integer locMatrixEngineerId) {
		this.locMatrixEngineerId = locMatrixEngineerId;
	}

	public Character getOperateType() {
		return operateType;
	}

	public void setOperateType(Character operateType) {
		this.operateType = operateType;
	}

	public String getXmlVersion() {
		return xmlVersion;
	}

	public void setXmlVersion(String xmlVersion) {
		this.xmlVersion = xmlVersion;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDocCutOffDate() {
		return docCutOffDate;
	}

	public void setDocCutOffDate(Date docCutOffDate) {
		this.docCutOffDate = docCutOffDate;
	}

	public Date getEtdDate() {
		return etdDate;
	}

	public void setEtdDate(Date etdDate) {
		this.etdDate = etdDate;
	}

	public String getDeliverPort() {
		return deliverPort;
	}

	public void setDeliverPort(String deliverPort) {
		this.deliverPort = deliverPort;
	}

	public String getMtiNumber() {
		return mtiNumber;
	}

	public void setMtiNumber(String mtiNumber) {
		this.mtiNumber = mtiNumber;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Character getOrderProjectGs() {
		return orderProjectGs;
	}

	public void setOrderProjectGs(Character orderProjectGs) {
		this.orderProjectGs = orderProjectGs;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFordFileName() {
		return fordFileName;
	}

	public void setFordFileName(String fordFileName) {
		this.fordFileName = fordFileName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Character getOrderPartType() {
		return orderPartType;
	}

	public void setOrderPartType(Character orderPartType) {
		this.orderPartType = orderPartType;
	}

	public String getOrderRowNum() {
		return orderRowNum;
	}

	public void setOrderRowNum(String orderRowNum) {
		this.orderRowNum = orderRowNum;
	}

	public Character getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(Character isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Character getIsAddPart() {
		return isAddPart;
	}

	public void setIsAddPart(Character isAddPart) {
		this.isAddPart = isAddPart;
	}

	public Character getIsSend() {
		return isSend;
	}

	public void setIsSend(Character isSend) {
		this.isSend = isSend;
	}

	public Date getPusPickupTime() {
		return pusPickupTime;
	}

	public void setPusPickupTime(Date pusPickupTime) {
		this.pusPickupTime = pusPickupTime;
	}

	public Date getPusDeliveryTime() {
		return pusDeliveryTime;
	}

	public void setPusDeliveryTime(Date pusDeliveryTime) {
		this.pusDeliveryTime = pusDeliveryTime;
	}

	public String getSylifeshenNum() {
		return sylifeshenNum;
	}

	public void setSylifeshenNum(String sylifeshenNum) {
		this.sylifeshenNum = sylifeshenNum;
	}

	public Integer getCcLocationId() {
		return ccLocationId;
	}

	public void setCcLocationId(Integer ccLocationId) {
		this.ccLocationId = ccLocationId;
	}

	public String getDlvContactname() {
		return dlvContactname;
	}

	public void setDlvContactname(String dlvContactname) {
		this.dlvContactname = dlvContactname;
	}

	public String getDlvTel() {
		return dlvTel;
	}

	public void setDlvTel(String dlvTel) {
		this.dlvTel = dlvTel;
	}

	public String getDlvAddress() {
		return dlvAddress;
	}

	public void setDlvAddress(String dlvAddress) {
		this.dlvAddress = dlvAddress;
	}

	public String getPicContactname() {
		return picContactname;
	}

	public void setPicContactname(String picContactname) {
		this.picContactname = picContactname;
	}

	public String getPicTel() {
		return picTel;
	}

	public void setPicTel(String picTel) {
		this.picTel = picTel;
	}

	public String getPicAddress() {
		return picAddress;
	}

	public void setPicAddress(String picAddress) {
		this.picAddress = picAddress;
	}

	public Date getCcArrivalTime() {
		return ccArrivalTime;
	}

	public void setCcArrivalTime(Date ccArrivalTime) {
		this.ccArrivalTime = ccArrivalTime;
	}

	public Date getCcLeaveTime() {
		return ccLeaveTime;
	}

	public void setCcLeaveTime(Date ccLeaveTime) {
		this.ccLeaveTime = ccLeaveTime;
	}

	public String getCcCode() {
		return ccCode;
	}

	public void setCcCode(String ccCode) {
		this.ccCode = ccCode;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getOrderInfoType() {
		return orderInfoType;
	}

	public void setOrderInfoType(String orderInfoType) {
		this.orderInfoType = orderInfoType;
	}

	public String getNewOrderId() {
		return newOrderId;
	}

	public void setNewOrderId(String newOrderId) {
		this.newOrderId = newOrderId;
	}

	public Character getDisposedStatus() {
		return disposedStatus;
	}

	public void setDisposedStatus(Character disposedStatus) {
		this.disposedStatus = disposedStatus;
	}

	public Character getShippersConfirmStatus() {
		return shippersConfirmStatus;
	}

	public void setShippersConfirmStatus(Character shippersConfirmStatus) {
		this.shippersConfirmStatus = shippersConfirmStatus;
	}

	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public Date getClaimGoodsTime() {
		return claimGoodsTime;
	}

	public void setClaimGoodsTime(Date claimGoodsTime) {
		this.claimGoodsTime = claimGoodsTime;
	}

	public Character getPusStatus() {
		return pusStatus;
	}

	public void setPusStatus(Character pusStatus) {
		this.pusStatus = pusStatus;
	}

	public Integer getIdItm() {
		return idItm;
	}

	public void setIdItm(Integer idItm) {
		this.idItm = idItm;
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

	public String getUnitl() {
		return unitl;
	}

	public void setUnitl(String unitl) {
		this.unitl = unitl;
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

	public String getRemarkItme() {
		return remarkItme;
	}

	public void setRemarkItme(String remarkItme) {
		this.remarkItme = remarkItme;
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

	public Character getIsConfirmitme() {
		return isConfirmitme;
	}

	public void setIsConfirmitme(Character isConfirmitme) {
		this.isConfirmitme = isConfirmitme;
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

	public String getSylifeshenNumItme() {
		return sylifeshenNumItme;
	}

	public void setSylifeshenNumItme(String sylifeshenNumItme) {
		this.sylifeshenNumItme = sylifeshenNumItme;
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

	public Character getDisposedStatusItme() {
		return disposedStatusItme;
	}

	public void setDisposedStatusItme(Character disposedStatusItme) {
		this.disposedStatusItme = disposedStatusItme;
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

	public String getPoNoItme() {
		return poNoItme;
	}

	public void setPoNoItme(String poNoItme) {
		this.poNoItme = poNoItme;
	}

}
