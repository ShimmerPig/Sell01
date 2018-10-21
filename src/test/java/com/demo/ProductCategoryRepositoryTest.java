package com.demo;

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

//对类目的dao进行测试
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

	@Autowired
	private ProductCategoryRepository repository;
	
	//通过id查询一个类目对象
	@Test
	public void findOneTest() {
		Optional<ProductCategory> productCategory=repository.findById(1);
		System.out.println(productCategory.get().toString());
	}
	
	//添加类目对象
	//修改类目对象--与添加不同，需要set id这个属性
	@Test
	public void saveTest() {
//		ProductCategory productCategory=new ProductCategory();
//		productCategory.setCategoryName("boys love best");
//		productCategory.setCategoryId(2);
//		productCategory.setCategoryType(3);
//		repository.save(productCategory);
//		Optional<ProductCategory> productCategory=repository.findById(2);
//		productCategory.get().setCategoryType(10);
//		repository.save(productCategory.get());
		ProductCategory productCategory=new ProductCategory("pig love best", 5);
		ProductCategory result=repository.save(productCategory);
		assertNotNull(result);
	}
	
	//测试通过类目编号查询类目的方法
	@Test
	public void findByCategoryTypeInTest() {
		List<Integer>list=Arrays.asList(1,2,3);
		List<ProductCategory>result=repository.findByCategoryTypeIn(list);
		assertNotEquals(0, result.size());
	}
	
}
