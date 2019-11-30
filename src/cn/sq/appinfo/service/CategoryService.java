package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.Category;

public interface CategoryService {
	
	//根据父级id查询App信息
	public List<Category> getFindCategory(Integer parentId);
}
