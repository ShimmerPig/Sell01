package com.demo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dataobject.ProductCategory;
import com.demo.dataobject.ProductInfo;
import com.demo.enums.ProductStatusEnum;
import com.demo.repository.ProductCategoryRepository;
import com.demo.repository.ProductInfoRepository;
//商品的service实现类的测试
import com.demo.service.impl.ProductServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@Test
	public void findOne()throws Exception{
		ProductInfo productInfo=productService.findOne("123456");
		assertEquals("123456", productInfo.getProductId());
	}
	@Test
	public void findUpAll()throws Exception{
//		List<ProductInfo>productInfoList=productService.findUpAll();
//		assertNotEquals(0, productInfoList.size());
		
		PageRequest request=new PageRequest(0,2);
		Page<ProductInfo>productInfoPage=productService.findAll((Pageable) request);
		assertNotEquals(0,productInfoPage.getTotalElements());
	}
	@Test
	public void save()throws Exception{
		ProductInfo productInfo=new ProductInfo();
		productInfo.setProductId("123458");
		productInfo.setProductName("pig pig");
		productInfo.setProductPrice(new BigDecimal(999.9));
		productInfo.setProductStock(11);
		productInfo.setProductDescription("very good");
		productInfo.setProductIcon("http://xxxxx.jpg");
		productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
		productInfo.setCategoryType(2);
		
		ProductInfo result=productService.save(productInfo);
		assertNotNull(result);
	}

}
