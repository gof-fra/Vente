package com.haggar.VenteBack.test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.haggar.VenteBack.dao.CategoryDAO;
import com.haggar.VenteBack.dto.Category;

public class CategoryTestCase { 
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	/*@Test
	public void testUnit() {
		fail("Not yet implemented");
	}*/
	
	@BeforeClass
	public static void unit() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.haggar.VenteBack");
		context.refresh();
		
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*@Test
	public void testAddcategory() {
		
		category = new Category();
		
		category.setName("Laptop12");
		category.setDescription("Make some description for laptop");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added  a category  inside the table!", true, categoryDAO.add(category));
		
		}*/
	
	/*@Test
	public void testGetCategory() {
		
    	category = categoryDAO.get(4);
    	
    	assertEquals("Successfully added", "Laptop", category.getName());
    	
    	
    }
	*/
	
	/*@Test
	public void testUpdateCategory() {
		
    	category = categoryDAO.get(3);
    	
    	category.setName("Laptop13");
    	category.setImageURL("cat_4.png");
    	
    	assertEquals("Successfully updating", true, categoryDAO.update(category));
    	
    	
    }
	*/
	
	/*@Test
	public void testDeleteCategory() {
		
    	category = categoryDAO.get(3);
    	
    	
    	
    	assertEquals("Successfully deleting", true, categoryDAO.delete(category));
    	
    	
    }*/
	
	/*@Test
	public void testListCategory() {
		
    	assertEquals("Successfully fetched", 3, categoryDAO.list().size());
    	
    	
    }
*/
	
	@Test
	public void testCRUDCategory() {
		//Adding
		//Laptop
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("Make some description for laptop");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added  a category  inside the table!", true, categoryDAO.add(category));
		
		//Television
		category = new Category();
		
		category.setName("Television");
		category.setDescription("Make some description for television");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Successfully added  a category  inside the table!", true, categoryDAO.add(category));
		
	
		
		//Updating
		category = categoryDAO.get(9);
    	
    	category.setName("Mobile");
    	category.setImageURL("CAT_3.pgn");
    	
    	
    	assertEquals("Successfully updating", true, categoryDAO.update(category));
    	
    	
    	//Deleting
    	
    	assertEquals("Successfully deleting", true, categoryDAO.delete(category));
    	
    	//fetch more than two: chercher
    	
    	assertEquals("Successfully fetched", 10, categoryDAO.list().size());
    	
    	
    	
 
	}
	

  
	

}
