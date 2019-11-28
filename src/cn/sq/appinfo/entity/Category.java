package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * APP所属分类表
 * @author Administrator
 *
 */
public class Category {
	
	private Integer id; //编号
	private String categoryCode; //分类编码
	private String categoryName; //分类名称
	private Integer parentId; //父级节点id
	private Integer createdBy; //创建者（来源于backend_user用户表的用户id）
	private Date creationTime; //创建时间
	private Integer modifyBy; //更新者（来源于backend_user用户表的用户id）
	private Date dateTime; //最新更新时间
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
