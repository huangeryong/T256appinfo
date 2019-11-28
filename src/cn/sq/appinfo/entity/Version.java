package cn.sq.appinfo.entity;

import java.sql.Date;

/**
 * APP�汾��Ϣ��
 * @author Administrator
 *
 */
public class Version {
	
	private Integer id; //����id
	private Integer appId; //appId����Դ�ڣ�app_info�������id��
	private String versionNo; //�汾��
	private String versionInfo; //�汾����
	private Integer publishStatus; //����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
	private String downloadLink; //��������
	private Integer versionSize; //�汾��С����λ��M��
	private String apkLocPath; //apk�ļ��ķ������洢·��
	private String apkFileName; //�ϴ���apk�ļ�����
	
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
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionInfo() {
		return versionInfo;
	}
	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
	public Integer getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public Integer getVersionSize() {
		return versionSize;
	}
	public void setVersionSize(Integer versionSize) {
		this.versionSize = versionSize;
	}
	public String getApkLocPath() {
		return apkLocPath;
	}
	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}
	public String getApkFileName() {
		return apkFileName;
	}
	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
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
	public Version(Integer id, Integer appId, String versionNo, String versionInfo, Integer publishStatus,
			String downloadLink, Integer versionSize, String apkLocPath, String apkFileName, Integer createdBy,
			Date createtionDate, Integer modifyBy, Date dateTime) {
		super();
		this.id = id;
		this.appId = appId;
		this.versionNo = versionNo;
		this.versionInfo = versionInfo;
		this.publishStatus = publishStatus;
		this.downloadLink = downloadLink;
		this.versionSize = versionSize;
		this.apkLocPath = apkLocPath;
		this.apkFileName = apkFileName;
		this.createdBy = createdBy;
		this.createtionDate = createtionDate;
		this.modifyBy = modifyBy;
		this.dateTime = dateTime;
	}
	public Version() {
		super();
	}
	
	
}
