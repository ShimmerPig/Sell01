package com.demo.dataobject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

//创建数据库中对应的实体类
//类目的实体类
//下面的@DynamicUpdate可以实现自动更新时间
@Entity
@DynamicUpdate
public class ProductCategory {
	public ProductCategory(String categoryName, Integer categoryType) {
		this.categoryName = categoryName;
		this.categoryType = categoryType;
	}
	public ProductCategory() {
	}
	//类目id
	@Id
	@GeneratedValue
	private Integer categoryId;
	//类目名字
	private String categoryName;
	//类目编号
	private Integer categoryType;
	//注意生成get和set方法
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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
	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
				+ categoryType + "]";
	}
}
