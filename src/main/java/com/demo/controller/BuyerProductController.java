package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.VO.ProductInfoVO;
import com.demo.VO.ProductVO;
import com.demo.VO.ResultVO;
import com.demo.dataobject.ProductCategory;
import com.demo.dataobject.ProductInfo;
import com.demo.service.impl.CategoryServiceImpl;
import com.demo.service.impl.ProductServiceImpl;

//卖家商品的controller
//处理与前端的交互
//返回给前端需要的json
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
	//引入商品的service
	@Autowired
	private ProductServiceImpl productService;
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@GetMapping("/list")
	public ResultVO list() {
		
		//查询数据中所有上架的商品
		List<ProductInfo>productInfoList=productService.findUpAll();
		
		//查询商品对应的类目
		List<Integer>categoryTypeList=new ArrayList<>();
		for(ProductInfo productInfo:productInfoList) {
			categoryTypeList.add(productInfo.getCategoryType());
		}
		//通过商品对应的类目的编号对类目进行查找 得到类目对象的列表
		List<ProductCategory>productCategoryList=categoryService.findByCategoryTypeIn(categoryTypeList);
		
		
		//数据拼装
		//先遍历类目表
		//再遍历商品列表
		List<ProductVO>productVOList=new ArrayList<>();
		for(ProductCategory productCategory:productCategoryList) {
			ProductVO productVO=new ProductVO();
			productVO.setCategoryType(productCategory.getCategoryType());
			productVO.setCategoryName(productCategory.getCategoryName());
			
			List<ProductInfoVO>productInfoVOList=new ArrayList<>();
			for(ProductInfo productInfo:productInfoList) {
				//两者的类目相同，则将其添加进去
				if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
					ProductInfoVO productInfoVO=new ProductInfoVO();
					BeanUtils.copyProperties(productInfo, productInfoVO);
					productInfoVOList.add(productInfoVO);
				}
			}
			
			productVO.setProductInfoVOList(productInfoVOList);
			productVOList.add(productVO);
		}
		
		ResultVO resultVO=new ResultVO();
		
		resultVO.setData(productVOList);
		resultVO.setCode(0);
		resultVO.setMsg("成功");
		
		
		return resultVO;
	}
}
