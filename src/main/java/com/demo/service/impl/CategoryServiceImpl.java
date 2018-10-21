package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dataobject.ProductCategory;
import com.demo.repository.ProductCategoryRepository;
import com.demo.service.CategoryService;

//category的service接口的实现类
//实现将service与dao的交互
@Service
public class CategoryServiceImpl implements CategoryService{
	
	//引入dao
	@Autowired
	private ProductCategoryRepository repository;
	
	@Override
	public ProductCategory findOne(Integer categoryId) {
		return repository.findById(categoryId).get();
	}

	@Override
	public List<ProductCategory> findAll() {
		return repository.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		return repository.findByCategoryTypeIn(categoryTypeList);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		return repository.save(productCategory);
	}

}
