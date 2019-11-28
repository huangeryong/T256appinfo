package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * 基础信息表
 * @author Administrator
 *
 */
public class Info {
	private Integer id; //主键id
	private String softwareName; //软件名称
	private String APKName; //APK名称（唯一）
	private String supportROM; //支持ROM
	private String interfaceLanguage; //界面语言
	private Integer softwareSize; //软件大小（单位：M）
	private Date updateDate; //更新日期
	private Integer devId; //开发者id（来源于：dev_user表的开发者id）
	private String appInfo; //应用简介
	private Integer status; //状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
	private Date onSaleDate; //上架时间
	private Date offSaleDate; //下架时间
	private Integer flatformId; //所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
	private Integer categoryLevel3; //所属三级分类（来源于：data_dictionary）
	private Integer downloads; //下载量（单位：次）
	private Integer categoryLevel1; //所属一级分类（来源于：data_dictionary）
	private Integer categoryLevel2; //所属二级分类（来源于：data_dictionary）
	private String logoPicPath; //LOGO图片url路径
	private String logoLocPath; //LOGO图片的服务器存储路径
	private Integer versionId; //最新的版本id
	
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
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public Integer getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(Integer softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public Integer getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
	}
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public Integer getDownloads() {
		return downloads;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}
	public Integer getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(Integer categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public Integer getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(Integer categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
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
	public Info(Integer id, String softwareName, String aPKName, String supportROM, String interfaceLanguage,
			Integer softwareSize, Date updateDate, Integer devId, String appInfo, Integer status, Date onSaleDate,
			Date offSaleDate, Integer flatformId, Integer categoryLevel3, Integer downloads, Integer categoryLevel1,
			Integer categoryLevel2, String logoPicPath, String logoLocPath, Integer versionId, Integer createdBy,
			Date createtionDate, Integer modifyBy, Date dateTime) {
		super();
		this.id = id;
		this.softwareName = softwareName;
		APKName = aPKName;
		this.supportROM = supportROM;
		this.interfaceLanguage = interfaceLanguage;
		this.softwareSize = softwareSize;
		this.updateDate = updateDate;
		this.devId = devId;
		this.appInfo = appInfo;
		this.status = status;
		this.onSaleDate = onSaleDate;
		this.offSaleDate = offSaleDate;
		this.flatformId = flatformId;
		this.categoryLevel3 = categoryLevel3;
		this.downloads = downloads;
		this.categoryLevel1 = categoryLevel1;
		this.categoryLevel2 = categoryLevel2;
		this.logoPicPath = logoPicPath;
		this.logoLocPath = logoLocPath;
		this.versionId = versionId;
		this.createdBy = createdBy;
		this.createtionDate = createtionDate;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
	}
	public Info() {
		super();
	}
	
	
}
