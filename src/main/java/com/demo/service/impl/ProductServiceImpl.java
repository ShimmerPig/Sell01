package com.demo.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.demo.dataobject.ProductInfo;
import com.demo.enums.ProductStatusEnum;
import com.demo.repository.ProductInfoRepository;
import com.demo.service.ProductService;

//商品service接口的实现类
//实现dao与service的交互
@Service
public class ProductServiceImpl implements ProductService{

	//引入dao层
	@Autowired
	private ProductInfoRepository repository;
	
	@Override
	public ProductInfo findOne(String productId) {
		return repository.findById(productId).get();
	}

	@Override
	public List<ProductInfo> findUpAll() {
		return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return (Page<ProductInfo>) repository.findAll();
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return repository.save(productInfo);
	}

}
