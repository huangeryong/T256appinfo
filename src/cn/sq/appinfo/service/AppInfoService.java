package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.AppInfo;

public interface AppInfoService {
	
	//查询所有
	public List<AppInfo> getFindIfInfo(String softwareName,Integer status,Integer categoryLevel1,Integer categoryLevel2,Integer categoryLevel3,Integer flatformId,Integer devId);

	//添加基础信息
	public Integer getAddInfo(AppInfo appInfo);
	
	//验证APKName
	public AppInfo checkName(String apkName);
}
