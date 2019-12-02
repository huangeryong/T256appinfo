package cn.sq.appinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.AppInfoDao;
import cn.sq.appinfo.entity.AppInfo;
import cn.sq.appinfo.service.AppInfoService;

@Service
public class AppInfoServiceImpl implements AppInfoService{
	
	@Resource
	private AppInfoDao infoDao;

	@Override
	public List<AppInfo> getFindIfInfo(String softwareName,Integer status,Integer categoryLevel1,Integer categoryLevel2,Integer categoryLevel3,Integer flatformId,Integer devId) {

		return infoDao.getFindIfInfo(softwareName, status, categoryLevel1, categoryLevel2, categoryLevel3, flatformId, devId);
	}

	@Override
	public Integer getAddInfo(AppInfo appInfo) {
		
		return infoDao.getAddInfo(appInfo);
	}

	@Override
	public AppInfo checkName(String apkName) {

		return infoDao.checkName(apkName);
	}
	
}
