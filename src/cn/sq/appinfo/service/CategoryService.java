package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.Category;

public interface CategoryService {
	
	//���ݸ���id��ѯApp��Ϣ
	public List<Category> getFindCategory(Integer parentId);
}
