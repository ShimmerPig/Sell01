package com.demo;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dataobject.ProductCategory;
import com.demo.dataobject.ProductInfo;
import com.demo.repository.ProductCategoryRepository;
import com.demo.repository.ProductInfoRepository;

//商品dao层的测试方法
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
	//引入商品的dao
	@Autowired
	private ProductInfoRepository repository;
	
	//测试新增商品的方法
	//注 这里的id需要自己set
	@Test
	public void saveTest() {
		ProductInfo productInfo=new ProductInfo();
		productInfo.setProductId("123456");
		productInfo.setProductName("candy");
		productInfo.setProductPrice(new BigDecimal(3.2));
		productInfo.setProductStock(100);
		productInfo.setProductDescription("very sweet");
		productInfo.setProductIcon("http://xxx.jpg");
		productInfo.setProductStatus(0);
		productInfo.setCategoryType(5);
		
		ProductInfo result=repository.save(productInfo);
		assertNotNull(result);
	}
	//查询上架商品
	@Test
	public void findByProductStatus()throws Exception{
		List< ProductInfo>productInfoList=repository.findByProductStatus(0);
		assertNotEquals(0,productInfoList.size());
	}
	
}
