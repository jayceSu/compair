package com.adeng.compair.entity;

import java.util.Date;

/**
 * 站点
 * 
 * @author Administrator
 * 
 */
public class Ioc {
	private Integer id;// 站点ID（主键）
	private String locationCode;// 站点代码( 唯一)
	private String locationName;// 站点名称
	private String address;// 地址
	private String contactname;// 联系人1名字
	private String tel;// 联系人电话
	private String mobile;// 联系人手机
	private Character isValid;// 是否有效（默认1有效，0无效）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID(FK)
	private String locationtype;// 站点类型P(提货点)，D(卸货点)，C(中转站)
	private String city;// 所属城市
	private String remark;
	private String province;
	private String district;
	private String locType;
	private String source;
	private String picTime;// 提货点时间 (常熟路虎项目)
	private String dlvTime;// 卸货点时间(常熟路虎项目)
	private Integer earlyDate;// 提前天数(常熟路虎项目)

	public Ioc() {
		super();
	}

	public Ioc(Integer id, String locationCode, String locationName,
			String address, String contactname, String tel, String mobile,
			Character isValid, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId, String locationtype,
			String city, String remark, String province, String district,
			String locType, String source, String picTime, String dlvTime,
			Integer earlyDate) {
		super();
		this.id = id;
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.address = address;
		this.contactname = contactname;
		this.tel = tel;
		this.mobile = mobile;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.locationtype = locationtype;
		this.city = city;
		this.remark = remark;
		this.province = province;
		this.district = district;
		this.locType = locType;
		this.source = source;
		this.picTime = picTime;
		this.dlvTime = dlvTime;
		this.earlyDate = earlyDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getLocationtype() {
		return locationtype;
	}

	public void setLocationtype(String locationtype) {
		this.locationtype = locationtype;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLocType() {
		return locType;
	}

	public void setLocType(String locType) {
		this.locType = locType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPicTime() {
		return picTime;
	}

	public void setPicTime(String picTime) {
		this.picTime = picTime;
	}

	public String getDlvTime() {
		return dlvTime;
	}

	public void setDlvTime(String dlvTime) {
		this.dlvTime = dlvTime;
	}

	public Integer getEarlyDate() {
		return earlyDate;
	}

	public void setEarlyDate(Integer earlyDate) {
		this.earlyDate = earlyDate;
	}

	@Override
	public String toString() {
		return "loc [id=" + id + ", locationCode=" + locationCode
				+ ", locationName=" + locationName + ", address=" + address
				+ ", contactname=" + contactname + ", tel=" + tel + ", mobile="
				+ mobile + ", isValid=" + isValid + ", createDate="
				+ createDate + ", createUserId=" + createUserId
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUserId="
				+ lastUpdateUserId + ", locationtype=" + locationtype
				+ ", city=" + city + ", remark=" + remark + ", province="
				+ province + ", district=" + district + ", locType=" + locType
				+ ", source=" + source + ", picTime=" + picTime + ", dlvTime="
				+ dlvTime + ", earlyDate=" + earlyDate + "]";
	}

}
