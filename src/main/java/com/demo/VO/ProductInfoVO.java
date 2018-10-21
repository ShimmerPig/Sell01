package com.demo.VO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

//这里不使用数据库中的实体类
//而是重新定义专门返回给前端的商品对象
//安全 隐私
public class ProductInfoVO {
	@JsonProperty("id")
	private String productId;
	
	@JsonProperty("name")
	private String productName;
	
	@JsonProperty("price")
	private BigDecimal productPrice;
	
	@JsonProperty("description")
	private String productDescription;
	
	@JsonProperty("icon")
	private String productIcon;

	public ProductInfoVO(String productId, String productName, BigDecimal productPrice, String productDescription,
			String productIcon) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productIcon = productIcon;
	}


	@Override
	public String toString() {
		return "ProductInfoVO [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDescription=" + productDescription + ", productIcon=" + productIcon + "]";
	}


	public ProductInfoVO() {
		super();
	}


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
	}
}
