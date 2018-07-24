package com.haggar.VenteBack.dao;

import java.util.List;

import com.haggar.VenteBack.dto.Category;

public interface CategoryDAO {
	
	
	
	Category get(int id);
	
	List<Category> list();
	
	Boolean add(Category category);
	Boolean update(Category category);
	Boolean delete(Category category);
	

}
