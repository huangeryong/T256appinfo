package cn.sq.appinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.BackendUserDao;
import cn.sq.appinfo.entity.BackendUser;
import cn.sq.appinfo.service.BackendUserService;

@Service
public class BackendUserServiceImpl implements BackendUserService{
	
	@Resource
	private BackendUserDao bu;
	@Override
	public BackendUser login(String userCode, String userPassword) {
		
		return bu.getBackUserByUserCodeAndUserPassword(userCode, userPassword);
	}

}
