package cn.sq.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.BackendUser;

public interface BackendUserDao {
	
	//��ѯϵͳ����Ա����
	public BackendUser getBackUserByUserCodeAndUserPassword(@Param("userCode")String userCode,@Param("userPassword")String userPassword);
}
