package cn.sq.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.BackendUser;

public interface BackendUserDao {
	
	//登录方法
	public BackendUser getBackUserByUserCodeAndUserPassword(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
