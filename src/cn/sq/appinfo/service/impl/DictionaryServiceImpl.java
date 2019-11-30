package cn.sq.appinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.DictionaryDao;
import cn.sq.appinfo.entity.Dictionary;
import cn.sq.appinfo.service.DictionaryService;

@Service
public class DictionaryServiceImpl implements DictionaryService{
	
	@Resource
	private DictionaryDao dd;
	@Override
	public List<Dictionary> getFainAllDictionary(String typeCode) {

		return dd.getFainAllDictionary(typeCode);
	}

}
