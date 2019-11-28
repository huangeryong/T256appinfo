package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * 开发者用户表
 * @author Administrator
 *
 */
public class DevUser {
	
	private Integer id; //编号
	private String devCode; //开发者账号
	private String devName; //开发者名称
	private String devPassword; //开发者密码
	private String devEmail; //开发者电子邮箱
	private String devInfo; //开发者简介
	private Integer createdBy; //创建者（来源于backend_user用户表的用户id）
	private Date createtionDate; //创建时间
	private Integer modifyBy; //更新者（来源于backend_user用户表的用户id）
	private Date dateTime; //最新更新时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDevCode() {
		return devCode;
	}
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public String getDevInfo() {
		return devInfo;
	}
	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatetionDate() {
		return createtionDate;
	}
	public void setCreatetionDate(Date createtionDate) {
		this.createtionDate = createtionDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public DevUser(Integer id, String devCode, String devName, String devPassword, String devEmail, String devInfo,
			Integer createdBy, Date createtionDate, Integer modifyBy, Date dateTime) {
		super();
		this.id = id;
		this.devCode = devCode;
		this.devName = devName;
		this.devPassword = devPassword;
		this.devEmail = devEmail;
		this.devInfo = devInfo;
		this.createdBy = createdBy;
		this.createtionDate = createtionDate;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
	}
	public DevUser() {
		super();
	}
	
	
}
