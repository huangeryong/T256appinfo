package cn.sq.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserDao {
		
	//登录方法
	public DevUser getByDevCodeAndDevPassword(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
