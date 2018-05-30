package com.adeng.compair.entity;

import java.util.Date;

/**
 * 零件
 * 
 * @author Administrator
 * 
 */
public class Part {
	private Integer id;// 零件ID（主键）
	private String partReference;// 零件号
	private String partName;// 零件描述（品名）
	private Integer supplierId;// 供应商ID(FK)
	private Character isValid;// 是否有效（默认1有效，0无效）
	private String unit;// 单位
	private Integer piecespeRouterPack;// 单位包装数
	private Integer length;// 外包装长（厘米）
	private Integer width;// 外包装宽（厘米）
	private Integer height;// 外包装高（厘米）
	private Integer weight;// 单位重量（千克）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID (FK)
	private Integer layersQty;
	private Integer packageId;
	private String remark;// 备注（上海通用项目）
	private Integer pickupLocationId;// 提货点（常熟安吉项目增加）
	private Integer deliveryLocationId;// 卸货点 (无锡大通项目增加)
	private String plant;// 工厂
	private String defaultPickupPoint;// 提货点编号
	private String pickup_pointName;// 提货点名称
	private String pickupPointNameShort;// 提货点简称
	private String pickupPointAddress;// 提货点简称
	private Integer arlongitude;// 提货点经度
	private Integer arlatitude;// 提货点纬度
	private String areacode;// 提货点所属区域
	private String routeCode;// 所属路线
	private String carriername;// 车队
	private Integer distance;// 公里数
	private String arboxPickupPoint;// 取空箱点
	private Character isSend;// 是否发送（1已修改要发送，0未修改，通用二期接口同步基础数据）

	public Part() {
		super();
	}

	public Part(Integer id, String partReference, String partName,
			Integer supplierId, Character isValid, String unit,
			Integer piecespeRouterPack, Integer length, Integer width,
			Integer height, Integer weight, Date createDate,
			Integer createUserId, Date lastUpdateDate,
			Integer lastUpdateUserId, Integer layersQty, Integer packageId,
			String remark, Integer pickupLocationId,
			Integer deliveryLocationId, String plant,
			String defaultPickupPoint, String pickup_pointName,
			String pickupPointNameShort, String pickupPointAddress,
			Integer arlongitude, Integer arlatitude, String areacode,
			String routeCode, String carriername, Integer distance,
			String arboxPickupPoint, Character isSend) {
		super();
		this.id = id;
		this.partReference = partReference;
		this.partName = partName;
		this.supplierId = supplierId;
		this.isValid = isValid;
		this.unit = unit;
		this.piecespeRouterPack = piecespeRouterPack;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.layersQty = layersQty;
		this.packageId = packageId;
		this.remark = remark;
		this.pickupLocationId = pickupLocationId;
		this.deliveryLocationId = deliveryLocationId;
		this.plant = plant;
		this.defaultPickupPoint = defaultPickupPoint;
		this.pickup_pointName = pickup_pointName;
		this.pickupPointNameShort = pickupPointNameShort;
		this.pickupPointAddress = pickupPointAddress;
		this.arlongitude = arlongitude;
		this.arlatitude = arlatitude;
		this.areacode = areacode;
		this.routeCode = routeCode;
		this.carriername = carriername;
		this.distance = distance;
		this.arboxPickupPoint = arboxPickupPoint;
		this.isSend = isSend;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Character getIsValid() {
		return isValid;
	}

	public void setIsValid(Character isValid) {
		this.isValid = isValid;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getPiecespeRouterPack() {
		return piecespeRouterPack;
	}

	public void setPiecespeRouterPack(Integer piecespeRouterPack) {
		this.piecespeRouterPack = piecespeRouterPack;
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

	public Integer getLayersQty() {
		return layersQty;
	}

	public void setLayersQty(Integer layersQty) {
		this.layersQty = layersQty;
	}

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getDefaultPickupPoint() {
		return defaultPickupPoint;
	}

	public void setDefaultPickupPoint(String defaultPickupPoint) {
		this.defaultPickupPoint = defaultPickupPoint;
	}

	public String getPickup_pointName() {
		return pickup_pointName;
	}

	public void setPickup_pointName(String pickup_pointName) {
		this.pickup_pointName = pickup_pointName;
	}

	public String getPickupPointNameShort() {
		return pickupPointNameShort;
	}

	public void setPickupPointNameShort(String pickupPointNameShort) {
		this.pickupPointNameShort = pickupPointNameShort;
	}

	public String getPickupPointAddress() {
		return pickupPointAddress;
	}

	public void setPickupPointAddress(String pickupPointAddress) {
		this.pickupPointAddress = pickupPointAddress;
	}

	public Integer getArlongitude() {
		return arlongitude;
	}

	public void setArlongitude(Integer arlongitude) {
		this.arlongitude = arlongitude;
	}

	public Integer getArlatitude() {
		return arlatitude;
	}

	public void setArlatitude(Integer arlatitude) {
		this.arlatitude = arlatitude;
	}

	public String getAreacode() {
		return areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public String getArboxPickupPoint() {
		return arboxPickupPoint;
	}

	public void setArboxPickupPoint(String arboxPickupPoint) {
		this.arboxPickupPoint = arboxPickupPoint;
	}

	public Character getIsSend() {
		return isSend;
	}

	public void setIsSend(Character isSend) {
		this.isSend = isSend;
	}

	@Override
	public String toString() {
		return "part [id=" + id + ", partReference=" + partReference
				+ ", partName=" + partName + ", supplierId=" + supplierId
				+ ", isValid=" + isValid + ", unit=" + unit
				+ ", piecespeRouterPack=" + piecespeRouterPack + ", length="
				+ length + ", width=" + width + ", height=" + height
				+ ", weight=" + weight + ", createDate=" + createDate
				+ ", createUserId=" + createUserId + ", lastUpdateDate="
				+ lastUpdateDate + ", lastUpdateUserId=" + lastUpdateUserId
				+ ", layersQty=" + layersQty + ", packageId=" + packageId
				+ ", remark=" + remark + ", pickupLocationId="
				+ pickupLocationId + ", deliveryLocationId="
				+ deliveryLocationId + ", plant=" + plant
				+ ", defaultPickupPoint=" + defaultPickupPoint
				+ ", pickup_pointName=" + pickup_pointName
				+ ", pickupPointNameShort=" + pickupPointNameShort
				+ ", pickupPointAddress=" + pickupPointAddress
				+ ", arlongitude=" + arlongitude + ", arlatitude=" + arlatitude
				+ ", areacode=" + areacode + ", routeCode=" + routeCode
				+ ", carriername=" + carriername + ", distance=" + distance
				+ ", arboxPickupPoint=" + arboxPickupPoint + ", isSend="
				+ isSend + "]";
	}

}
