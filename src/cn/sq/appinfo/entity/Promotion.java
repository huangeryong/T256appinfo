package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * 广告表
 * @author Administrator
 *
 */
public class Promotion {
	
	private Integer id; //编号
	private Integer appId; //appId（来源于：app_info表的主键id）
	private String adPicPath; //广告图片存储路径
	private Integer adPv; //广告点击量
	private Integer carouselPosition; //轮播位（1-n）
	private Date startTime; //起效时间
	private Date endTime; //失效时间
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
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public String getAdPicPath() {
		return adPicPath;
	}
	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}
	public Integer getAdPv() {
		return adPv;
	}
	public void setAdPv(Integer adPv) {
		this.adPv = adPv;
	}
	public Integer getCarouselPosition() {
		return carouselPosition;
	}
	public void setCarouselPosition(Integer carouselPosition) {
		this.carouselPosition = carouselPosition;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
	public Promotion(Integer id, Integer appId, String adPicPath, Integer adPv, Integer carouselPosition,
			Date startTime, Date endTime, Integer createdBy, Date createtionDate, Integer modifyBy, Date dateTime) {
		super();
		this.id = id;
		this.appId = appId;
		this.adPicPath = adPicPath;
		this.adPv = adPv;
		this.carouselPosition = carouselPosition;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdBy = createdBy;
		this.createtionDate = createtionDate;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
	}
	public Promotion() {
		super();
	}
	
	
}
