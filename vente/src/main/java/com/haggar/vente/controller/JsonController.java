package com.haggar.vente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haggar.VenteBack.dao.ProductDAO;
import com.haggar.VenteBack.dto.Product;


@Controller
@RequestMapping("/json/data")
public class JsonController {
	

	@Autowired
	private ProductDAO productDAO;
	
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		
		return productDAO.listActiveProducts();
		
	}
	
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		
		return productDAO.listActiveProductsByCategory(id);
		
	}


}
