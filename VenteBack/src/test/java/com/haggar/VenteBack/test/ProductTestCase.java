package com.haggar.VenteBack.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.haggar.VenteBack.dao.ProductDAO;
import com.haggar.VenteBack.dto.Product;

public class ProductTestCase {
	
private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	
	@BeforeClass
	public static void unit() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.haggar.VenteBack");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
	}
	
	/*@Test
	public void testCRUDProduct() {
		
		// create operation
		product = new Product();
		
		product.setName("Oppo selfie s53");
		product.setBrand("Oppo");
		product.setDescription("This is some description for oppo mobile phone");
		product.setUnitPrice(1200);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		assertEquals("Something went wrong while insering a new product", true, productDAO.add(product));
		
		
		// reading, updating and deleting the product
		
		product = productDAO.get(2);
		product.setName("Samsung galaxy s9");
	
		
		assertEquals("Something went wrong while updating a new product", true, productDAO.update(product));
		
		
		assertEquals("Something went wrong while deleting a new product", true, productDAO.delete(product));
		
	
		
		// List
		
    	assertEquals("Something went wrong while deleting a new product", 13, productDAO.list().size()); //6 nombre de produit
    	
    	
    	
 
	}
	*/
	
	@Test
	public void  testListActiveProducts () {
		product.setName("usb");
		
		assertEquals("Something went wrong while fetching list of product of product", 12, productDAO.listActiveProducts().size());
    	
		
	}
	
	@Test
	public void  testListActiveProductsByCategory () {
		
		assertEquals("Something went wrong while fetching list of product of product", 10, productDAO.listActiveProductsByCategory(3).size());
    	
		assertEquals("Something went wrong while fetching list of product of product", 2, productDAO.listActiveProductsByCategory(1).size());
    	
		
	}
	
	@Test
	public void  testGetLatestActiveProducts () {
		
		assertEquals("Something went wrong while fetching list of product of product", 3, productDAO.listLatestActiveProducts(3).size());
    	
		
	}
	

  

}
