package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * �������û���
 * @author Administrator
 *
 */
public class DevUser {
	
	private Integer id; //���
	private String devCode; //�������˺�
	private String devName; //����������
	private String devPassword; //����������
	private String devEmail; //�����ߵ�������
	private String devInfo; //�����߼��
	private Integer createdBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date createtionDate; //����ʱ��
	private Integer modifyBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date dateTime; //���¸���ʱ��
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
