package cn.sq.appinfo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.DevUserDao;
import cn.sq.appinfo.entity.DevUser;

@Service
public class DevUserServiceImpl implements DevUserService{
	
	@Resource
	private DevUserDao dd;
	@Override
	public DevUser login(String devCode, String devPassword) {
		
		return dd.getByDevCodeAndDevPassword(devCode, devPassword);
	}

}
