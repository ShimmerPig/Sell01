package com.demo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dataobject.ProductCategory;
import com.demo.repository.ProductCategoryRepository;
import com.demo.service.impl.CategoryServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Test
	public void findOne()throws Exception{
		ProductCategory productCategory=categoryService.findOne(1);
		assertEquals(new Integer(1),productCategory.getCategoryId());
	}
	@Test
	public void findAll()throws Exception{
		List<ProductCategory>productCategoryList=categoryService.findAll();
		assertNotEquals(0,productCategoryList.size());
	}
	@Test
	public void findByCategoryTypeIn()throws Exception{
		List<ProductCategory>productCategoryList=categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3));
		assertNotEquals(0, productCategoryList.size());
	}
	@Test
	public void save()throws Exception{
		ProductCategory productCategory=new ProductCategory("boys use",10);
		ProductCategory result=categoryService.save(productCategory);
		assertNotNull(result);
	}
	
	
}
