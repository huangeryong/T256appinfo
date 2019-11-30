package cn.sq.appinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.CategoryDao;
import cn.sq.appinfo.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Resource
	private CategoryDao cd;
	@Override
	public List<Category> getFindCategory(Integer parentId) {

		return cd.getFindCategory(parentId);
	}

}
