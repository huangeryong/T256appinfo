package cn.sq.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserDao {
		
	//��ѯ�û�����
	public DevUser getByDevCodeAndDevPassword(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
