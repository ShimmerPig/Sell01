package com.demo.service;
//商品service层的接口

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.dataobject.ProductInfo;

public interface ProductService {
	
	ProductInfo findOne(String productId);

	//客户端 查询所有上架商品
	List<ProductInfo>findUpAll();
	
	//管理端 直接查询所有（pageable--进行分页）
	Page<ProductInfo>findAll(Pageable pageable);
	
	//添加商品的方法
	ProductInfo save(ProductInfo productInfo);
	
	//在下订单还有取消订单的时候 还需要有加减库存的方法
	//这里先保留
	
	//加库存
	
	//减库存
}

