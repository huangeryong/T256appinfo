package cn.sq.appinfo.service;

import cn.sq.appinfo.entity.BackendUser;

public interface BackendUserService {
	
	//登录方法
	public BackendUser login(String userCode,String userPassword);
}
