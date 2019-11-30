package cn.sq.appinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.CategoryDao;
import cn.sq.appinfo.entity.Category;
import cn.sq.appinfo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Resource
	private CategoryDao cd;
	@Override
	public List<Category> getFindCategory(Integer parentId) {

		return cd.getFindCategory(parentId);
	}

}
