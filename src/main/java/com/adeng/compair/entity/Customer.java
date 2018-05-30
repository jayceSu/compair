package com.adeng.compair.entity;

import java.util.Date;

/**
 * 客户
 * 
 * @author Administrator
 * 
 */
public class Customer {
	private Integer id;// 客户ID（主键）
	private String customerCode;// 客户代码( 唯一)
	private String customerName;// 客户名称
	private String address;// 地址
	private String contactname;// 地址
	private String tel;// 联系人电话
	private String mobile;// 联系人手机
	private Character isValid;// 是否有效（默认1有效，0无效）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID(FK)
	private Integer projectId;//项目ID
	private String customerType;//客户类型
	private String pdfLogoPath;
	private String customerPdf;
	private Integer customerLocId;

	public Customer() {
		super();
	}

	public Customer(Integer id, String customerCode, String customerName,
			String address, String contactname, String tel, String mobile,
			Character isValid, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId, Integer projectId,
			String customerType, String pdfLogoPath, String customerPdf,
			Integer customerLocId) {
		super();
		this.id = id;
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.address = address;
		this.contactname = contactname;
		this.tel = tel;
		this.mobile = mobile;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.projectId = projectId;
		this.customerType = customerType;
		this.pdfLogoPath = pdfLogoPath;
		this.customerPdf = customerPdf;
		this.customerLocId = customerLocId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getPdfLogoPath() {
		return pdfLogoPath;
	}

	public void setPdfLogoPath(String pdfLogoPath) {
		this.pdfLogoPath = pdfLogoPath;
	}

	public String getCustomerPdf() {
		return customerPdf;
	}

	public void setCustomerPdf(String customerPdf) {
		this.customerPdf = customerPdf;
	}

	public Integer getCustomerLocId() {
		return customerLocId;
	}

	public void setCustomerLocId(Integer customerLocId) {
		this.customerLocId = customerLocId;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", customerCode=" + customerCode
				+ ", customerName=" + customerName + ", address=" + address
				+ ", contactname=" + contactname + ", tel=" + tel + ", mobile="
				+ mobile + ", isValid=" + isValid + ", createDate="
				+ createDate + ", createUserId=" + createUserId
				+ ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUserId="
				+ lastUpdateUserId + ", projectId=" + projectId
				+ ", customerType=" + customerType + ", pdfLogoPath="
				+ pdfLogoPath + ", customerPdf=" + customerPdf
				+ ", customerLocId=" + customerLocId + "]";
	}

}
