package cn.sq.appinfo.dao;

import java.util.List;

import cn.sq.appinfo.entity.Dictionary;

public interface DictionaryDao {
	
	//根据类型查询所有分类信息
	public List<Dictionary> getFainAllDictionary(String typeCode);
	
	//查询所有类型信息
}
