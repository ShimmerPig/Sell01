package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dataobject.ProductInfo;

//商品的dao层接口
public interface ProductInfoRepository extends 
	JpaRepository<ProductInfo, String>{
	//新建查询上架商品的方法
	//通过商品的状态进行查询
	//返回一个商品列表
	List<ProductInfo>findByProductStatus(Integer productStatus);
}
