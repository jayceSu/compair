package com.adeng.compair.entity;

import java.util.Date;

/**
 * 承运商
 * 
 * @author Administrator
 * 
 */
public class Carrier {
	private Integer id;// 承运商ID（主键）
	private String carrierCode;// 承运商代码( 唯一)
	private String carrierName;// 承运商名称
	private String address;// 地址
	private String contactname1;// 联系人1名字
	private String tel1;// 联系人1电话
	private String contactname2;// 联系人2名字
	private String tel2;// 联系人2电话
	private String contactname3;// 联系人3名字
	private String tel3;// 联系人3电话
	private Character isValid;// 是否有效（默认1有效，0无效）
	private Date createDate;// 创建日期
	private Integer createUserId;// 创建用户ID(FK)
	private Date lastUpdateDate;// 最近更新日期
	private Integer lastUpdateUserId;// 最近更新用户ID(FK)

	public Carrier() {
		super();
	}

	public Carrier(Integer id, String carrierCode, String carrierName,
			String address, String contactname1, String tel1,
			String contactname2, String tel2, String contactname3, String tel3,
			Character isValid, Date createDate, Integer createUserId,
			Date lastUpdateDate, Integer lastUpdateUserId) {
		super();
		this.id = id;
		this.carrierCode = carrierCode;
		this.carrierName = carrierName;
		this.address = address;
		this.contactname1 = contactname1;
		this.tel1 = tel1;
		this.contactname2 = contactname2;
		this.tel2 = tel2;
		this.contactname3 = contactname3;
		this.tel3 = tel3;
		this.isValid = isValid;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactname1() {
		return contactname1;
	}

	public void setContactname1(String contactname1) {
		this.contactname1 = contactname1;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getContactname2() {
		return contactname2;
	}

	public void setContactname2(String contactname2) {
		this.contactname2 = contactname2;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getContactname3() {
		return contactname3;
	}

	public void setContactname3(String contactname3) {
		this.contactname3 = contactname3;
	}

	public String getTel3() {
		return tel3;
	}

	public void setTel3(String tel3) {
		this.tel3 = tel3;
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

	@Override
	public String toString() {
		return "carrier [id=" + id + ", carrierCode=" + carrierCode
				+ ", carrierName=" + carrierName + ", address=" + address
				+ ", contactname1=" + contactname1 + ", tel1=" + tel1
				+ ", contactname2=" + contactname2 + ", tel2=" + tel2
				+ ", contactname3=" + contactname3 + ", tel3=" + tel3
				+ ", isValid=" + isValid + ", createDate=" + createDate
				+ ", createUserId=" + createUserId + ", lastUpdateDate="
				+ lastUpdateDate + ", lastUpdateUserId=" + lastUpdateUserId
				+ "]";
	}

}
