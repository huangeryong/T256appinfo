package cn.sq.appinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.Category;

public interface CategoryDao {
	
	//查询一级菜单
	public List<Category> getFindCategory(@Param("parentId") Integer parentId);
}
