package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * APP���������
 * @author Administrator
 *
 */
public class Category {
	
	private Integer id; //���
	private String categoryCode; //�������
	private String categoryName; //��������
	private Integer parentId; //�����ڵ�id
	private Integer createdBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date creationTime; //����ʱ��
	private Integer modifyBy; //�����ߣ���Դ��backend_user�û�����û�id��
	private Date dateTime; //���¸���ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
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
	public Category(Integer id, String categoryCode, String categoryName, Integer parentId, Integer createdBy,
			Date creationTime, Integer modifyBy, Date dateTime) {
		super();
		this.id = id;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.parentId = parentId;
		this.createdBy = createdBy;
		this.creationTime = creationTime;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
	}
	public Category() {
		super();
	}
	
	
}
