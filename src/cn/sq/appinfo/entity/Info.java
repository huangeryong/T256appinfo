package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * ������Ϣ��
 * @author Administrator
 *
 */
public class Info {
	private Integer id; //����id
	private String softwareName; //�������
	private String APKName; //APK���ƣ�Ψһ��
	private String supportROM; //֧��ROM
	private String interfaceLanguage; //��������
	private Integer softwareSize; //�����С����λ��M��
	private Date updateDate; //��������
	private Integer devId; //������id����Դ�ڣ�dev_user��Ŀ�����id��
	private String appInfo; //Ӧ�ü��
	private Integer status; //״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
	private Date onSaleDate; //�ϼ�ʱ��
	private Date offSaleDate; //�¼�ʱ��
	private Integer flatformId; //����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
	private Integer categoryLevel3; //�����������ࣨ��Դ�ڣ�data_dictionary��
	private Integer downloads; //����������λ���Σ�
	private Integer categoryLevel1; //����һ�����ࣨ��Դ�ڣ�data_dictionary��
	private Integer categoryLevel2; //�����������ࣨ��Դ�ڣ�data_dictionary��
	private String logoPicPath; //LOGOͼƬurl·��
	private String logoLocPath; //LOGOͼƬ�ķ������洢·��
	private Integer versionId; //���µİ汾id
	
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
