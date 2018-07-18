package com.haggar.VenteBack.dao;

import java.util.List;

import com.haggar.VenteBack.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
