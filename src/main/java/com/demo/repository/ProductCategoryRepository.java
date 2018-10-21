package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dataobject.ProductCategory;

//这里的repository就相当于一个dao层
//资源仓库类
//一个接口类 处理对数据库的相关操作
public interface ProductCategoryRepository extends 
	JpaRepository<ProductCategory, Integer>{

	//添加方法--通过传入的商品类目编号 查询出对应的商品类目
	List<ProductCategory>findByCategoryTypeIn(List<Integer>categoryTypeList);
}
