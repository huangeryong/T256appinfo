package cn.sq.appinfo.dao;

import java.util.List;

import cn.sq.appinfo.entity.Info;

public interface InfoDao {
	
	//查询所有基础信息
	public List<Info> getFindIfInfo();
}
