package com.adeng.compair.entity;

import java.util.Date;

/**
 * 项目
 * 
 * @author Administrator
 * 
 */
public class Project {
	private Integer id;// id
	private String projectCode;// 项目密码
	private String projectName;// 项目名字
	private Integer customerId;// 客户编号
	private Character isValid;// 有效()
	private String remark;
	private Integer createUserId;// 创建用户标识
	private Date createDate;// 创建日期
	private Integer lastUpdateUserId;// 最后更新用户标识
	private Date lastUpdateDate;// 最新更新日期

	public Project() {
		super();
	}

	public Project(Integer id, String projectCode, String projectName,
			Integer customerId, Character isValid, String remark,
			Integer createUserId, Date createDate, Integer lastUpdateUserId,
			Date lastUpdateDate) {
		super();
		this.id = id;
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.customerId = customerId;
		this.isValid = isValid;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.lastUpdateUserId = lastUpdateUserId;
		this.lastUpdateDate = lastUpdateDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Character getIsValid() {
		return isValid;
	}

	public void setIsValid(Character isValid) {
		this.isValid = isValid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(Integer lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "project [id=" + id + ", projectCode=" + projectCode
				+ ", projectName=" + projectName + ", customerId=" + customerId
				+ ", isValid=" + isValid + ", remark=" + remark
				+ ", createUserId=" + createUserId + ", createDate="
				+ createDate + ", lastUpdateUserId=" + lastUpdateUserId
				+ ", lastUpdateDate=" + lastUpdateDate + "]";
	}

}
