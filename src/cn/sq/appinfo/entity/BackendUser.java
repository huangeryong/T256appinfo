package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * ��̨�û���
 * @author Administrator
 *
 */
public class BackendUser {
	
	private Integer id; //���
	private String userCode; //�û�����
	private String userName; //�û�����
	private Integer userType; //�û���ɫ���ͣ���Դ�������ֵ����Ϊ�����ܡ������г�����Ӫ������
	private Integer createdBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date creationDate; //����ʱ��
	private Integer modifyBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date dateTime; //���¸���ʱ��
	private String userPassword; //�û�����
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public BackendUser(Integer id, String userCode, String userName, Integer userType, Integer createdBy,
			Date creationDate, Integer modifyBy, Date dateTime, String userPassword) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
		this.userType = userType;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
		this.userPassword = userPassword;
	}
	
	public BackendUser() {
		super();
	}
	
	
}
