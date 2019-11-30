package cn.sq.appinfo.dao;

import java.util.List;

import cn.sq.appinfo.entity.Dictionary;

public interface DictionaryDao {
	
	//查询所有分类信息
	public List<Dictionary> getFainAllDictionary();
}
