package com.haggar.VenteBack.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.haggar.VenteBack.dao.CategoryDAO;
import com.haggar.VenteBack.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		//adding first category
		
		category.setId(1);
		category.setName("television");
		category.setDescription("Make some description for television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//adding second category
		category = new Category();
		
		category.setId(2);
		category.setName("mobile");
		category.setDescription("Make some description for mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
		//adding third category
		category = new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Make some description for laptop");
		category.setImageURL("CAT_3.png");
				
		categories.add(category);		
		
		// adding four category
		category = new Category();
		
		category.setId(4);
		category.setName("Tablet");
		category.setDescription("Make some description for tablet");
		category.setImageURL("CAT_4.png");
				
		categories.add(category);		
		
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
