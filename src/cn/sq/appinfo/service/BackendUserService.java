package cn.sq.appinfo.service;

import cn.sq.appinfo.entity.BackendUser;

public interface BackendUserService {
	
	//����Ա��¼����
	public BackendUser login(String userCode,String userPassword);
}
