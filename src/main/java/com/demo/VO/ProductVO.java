package com.demo.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//返回给前端的商品视图对象

public class ProductVO {
	@JsonProperty("name")
	private String categoryName;
	
	@JsonProperty("type")
	private Integer categoryType;
	
	@JsonProperty("foods")
	private List<ProductInfoVO>productInfoVOList;

	public ProductVO() {
		super();
	}

	public ProductVO(String categoryName, Integer categoryType, List<ProductInfoVO> productInfoVOList) {
		super();
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.productInfoVOList = productInfoVOList;
	}

	@Override
	public String toString() {
		return "ProductVO [categoryName=" + categoryName + ", categoryType=" + categoryType + ", productInfoVOList="
				+ productInfoVOList + "]";
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	public List<ProductInfoVO> getProductInfoVOList() {
		return productInfoVOList;
	}

	public void setProductInfoVOList(List<ProductInfoVO> productInfoVOList) {
		this.productInfoVOList = productInfoVOList;
	}
}
