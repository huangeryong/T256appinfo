package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.Dictionary;

public interface DictionaryService {
	//查询所有分类信息
	public List<Dictionary> getFainAllDictionary(String typeCode);
}
