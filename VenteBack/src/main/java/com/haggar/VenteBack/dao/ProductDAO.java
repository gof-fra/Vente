package com.haggar.VenteBack.dao;

import java.util.List;

import com.haggar.VenteBack.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	
	//Business methods
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> listLatestActiveProducts(int count);

}
