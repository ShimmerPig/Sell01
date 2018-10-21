package com.demo.dataobject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class ProductInfo {
	
	@Id
	private String productId;
	
	private String productName;
	
	//商品单价
	private BigDecimal productPrice;
	
	//商品库存
	private Integer productStock;
	
	//商品描述
	private String productDescription;
	
	//商品小图
	private String productIcon;
	
	//商品状态
	//0正常 1下架
	private Integer productStatus;
	
	//商品对应的类目编号
	private Integer categoryType;

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

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
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

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public Integer getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", productDescription=" + productDescription + ", productIcon="
				+ productIcon + ", productStatus=" + productStatus + ", categoryType=" + categoryType + "]";
	}

	public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock,
			String productDescription, String productIcon, Integer productStatus, Integer categoryType) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productDescription = productDescription;
		this.productIcon = productIcon;
		this.productStatus = productStatus;
		this.categoryType = categoryType;
	}

	public ProductInfo() {
	}
}
