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
	public List<AppInfo> getFindIfInfo() {

		return infoDao.getFindIfInfo();
	}
	
}
