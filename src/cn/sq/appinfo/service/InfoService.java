package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.Info;

public interface InfoService {
	
	//多表连接查询
	public List<Info> getFindIfInfo();
}
