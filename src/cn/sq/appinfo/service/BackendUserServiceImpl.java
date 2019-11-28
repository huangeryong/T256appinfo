package cn.sq.appinfo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.BackendUserDao;
import cn.sq.appinfo.entity.BackendUser;

@Service
public class BackendUserServiceImpl implements BackendUserService{
	
	@Resource
	private BackendUserDao bu;
	@Override
	public BackendUser login(String userCode, String userPassword) {
		
		return bu.getBackUserByUserCodeAndUserPassword(userCode, userPassword);
	}

}
