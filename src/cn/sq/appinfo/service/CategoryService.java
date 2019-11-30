package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.Category;

public interface CategoryService {
	
	//查询所有
	public List<Category> getFindCategory(Integer parentId);
}
