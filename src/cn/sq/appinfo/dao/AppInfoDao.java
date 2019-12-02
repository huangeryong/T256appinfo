package cn.sq.appinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.AppInfo;


public interface AppInfoDao {
	
	//查询所有基础信息
	public List<AppInfo> getFindIfInfo(@Param("softwareName")String softwareName,@Param("status")Integer status,@Param("categoryLevel1")Integer categoryLevel1,@Param("categoryLevel2")Integer categoryLevel2,@Param("categoryLevel3")Integer categoryLevel3,@Param("flatformId")Integer flatformId,@Param("devId")Integer devId);
	
	//添加基础信息
	public Integer getAddInfo(AppInfo appInfo);
	
	//验证APKName
	public AppInfo checkName(String apkName);
}
