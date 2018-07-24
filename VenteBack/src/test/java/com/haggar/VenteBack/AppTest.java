/*package com.haggar.VenteBack;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.haggar.VenteBack.dao.CategoryDAO;
import com.haggar.VenteBack.dto.Category;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


*//**
 * Unit test for simple App.
 *//*
public class AppTest  extends TestCase {
	    *//**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     *//*
	    public AppTest( String testName )
	    {
	        super( testName );
	    }
	
	    *//**
	     * @return the suite of tests being tested
	     *//*
	    public static Test suite()
	    {
	        return new TestSuite( AppTest.class );
	    }
	
	    *//**
	     * Rigourous Test :-)
	     *//*
	    public void testApp()
	    {
	    	category = new Category();
			
			category.setName("laptop");
			category.setDescription("Make some description for laptop");
			category.setImageURL("CAT_1.png");
			
	//	assertEquals("Successfully added", true, categoryDAO.add(category));
	        assertTrue( true );
	    }
	    
	    
	    //runner
	    @org.junit.Test
	    public void testGetCategory() {
	    	category = categoryDAO.get(0);
	    	
	    	assertEquals("Successfully added", "television", category.getName());
	    	
	    	
	    }
	    
	    
	   


		private static AnnotationConfigApplicationContext context;
		
		private static CategoryDAO categoryDAO;
		
		private Category category;
		
		
		@BeforeClass
		public static void unit() {
			
			context = new AnnotationConfigApplicationContext();
			context.scan("com.haggar.VenteBack");
			context.refresh();
			
			
			categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
			
		}
		
		
		public void testAddcategory() {
			
			category = new Category();
			
			category.setName("television");
			category.setDescription("Make some description for television");
			category.setImageURL("CAT_1.png");
			
		assertEquals("Successfully added", true, categoryDAO.add(category));
			
		}
}
*/