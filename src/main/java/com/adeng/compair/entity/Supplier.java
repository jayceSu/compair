package com.adeng.compair.entity;

import java.util.Date;

/**
 * 供应商
 * 
 * @author Administrator
 * 
 */
public class Supplier {
	private Integer id;// 供应商ID（主键）
	private String supplierCode;// 供应商代码( 唯一)
	private String supplierName;// 供应商名称
	private String address;// 地址
	private String contactname;// 联系人名字
	private String tel;// 联系人电话
	private String mobile;// 联系人手机
	private Character isValid;// 是否有效（默认1有效，0无效）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID(FK)
	private Integer wmsdate;// 供应商库存天数配置
	private String supplierHr;// 供应商链专员
	private String email;// 供应商链专员邮箱

	public Supplier() {
		super();
	}

	public Supplier(Integer id, String supplierCode, String supplierName,
			String address, String contactname, String tel, String mobile,
			Character isValid, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId, Integer wmsdate,
			String supplierHr, String email) {
		super();
		this.id = id;
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.address = address;
		this.contactname = contactname;
		this.tel = tel;
		this.mobile = mobile;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.wmsdate = wmsdate;
		this.supplierHr = supplierHr;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getWmsdate() {
		return wmsdate;
	}

	public void setWmsdate(Integer wmsdate) {
		this.wmsdate = wmsdate;
	}

	public String getSupplierHr() {
		return supplierHr;
	}

	public void setSupplierHr(String supplierHr) {
		this.supplierHr = supplierHr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "supplier [id=" + id + ", supplierCode=" + supplierCode
				+ ", supplierName=" + supplierName + ", address=" + address
				+ ", contactname=" + contactname + ", tel=" + tel + ", mobile="
				+ mobile + ", isValid=" + isValid + ", createDate="
				+ createDate + ", createUserId=" + createUserId
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUserId="
				+ lastUpdateUserId + ", wmsdate=" + wmsdate + ", supplierHr="
				+ supplierHr + ", email=" + email + "]";
	}

}
