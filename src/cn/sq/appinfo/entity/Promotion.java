package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * ����
 * @author Administrator
 *
 */
public class Promotion {
	
	private Integer id; //���
	private Integer appId; //appId����Դ�ڣ�app_info�������id��
	private String adPicPath; //���ͼƬ�洢·��
	private Integer adPv; //�������
	private Integer carouselPosition; //�ֲ�λ��1-n��
	private Date startTime; //��Чʱ��
	private Date endTime; //ʧЧʱ��
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
