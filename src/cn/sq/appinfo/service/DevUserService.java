package cn.sq.appinfo.service;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserService {
		
	//��¼����
	public DevUser login(String devCode,String devPassword);
}
