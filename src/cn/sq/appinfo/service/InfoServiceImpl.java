package cn.sq.appinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.InfoDao;
import cn.sq.appinfo.entity.Info;

@Service
public class InfoServiceImpl implements InfoService{
	
	@Resource
	private InfoDao infoDao;

	@Override
	public List<Info> getFindIfInfo() {

		return infoDao.getFindIfInfo();
	}
	
}
