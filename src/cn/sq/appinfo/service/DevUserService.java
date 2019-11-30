package cn.sq.appinfo.service;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserService {
		
	//登录方法
	public DevUser login(String devCode,String devPassword);
}
