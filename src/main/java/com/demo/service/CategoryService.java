package com.demo.service;

import java.util.List;

import com.demo.dataobject.ProductCategory;

//商品类目的service层的实现
//接口--提供前后端必要的操作方法
public interface CategoryService {
	//后
	ProductCategory findOne(Integer categoryId);
	List<ProductCategory>findAll();
	//前
	List<ProductCategory>findByCategoryTypeIn(List<Integer>categoryTypeList);
	ProductCategory save(ProductCategory productCategory);
}
