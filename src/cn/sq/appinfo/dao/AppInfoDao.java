package cn.sq.appinfo.dao;

import java.util.List;

import cn.sq.appinfo.entity.AppInfo;


public interface AppInfoDao {
	
	//查询所有基础信息
	public List<AppInfo> getFindIfInfo();
}
