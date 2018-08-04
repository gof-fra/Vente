package com.haggar.vente.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.haggar.VenteBack.dao.CategoryDAO;
import com.haggar.VenteBack.dao.ProductDAO;
import com.haggar.VenteBack.dto.Category;
import com.haggar.VenteBack.dto.Product;
import com.haggar.vente.file.FileUploadUtility;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDAO categoryDAO; 
	
	@Autowired
	private ProductDAO productDAO;

	
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);
	
	public void uploadFile () {
		
	}
	
	@RequestMapping(value = "/products", method=RequestMethod.GET)
	public ModelAndView ShowManageProducts (@RequestParam(name="operation", required=false) String operation, HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageProducts", true);
		mv.addObject("title", "Manage product");
		
		Product nProduct = new Product();
		
		
		//--Adding---new---product
		
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		
		mv.addObject("product", nProduct);
		
		if(operation!=null) {
			
			if(operation.equals("product")) {
				
				mv.addObject("message", "Product Submitted Successfully");
				
			}
			
		}
		
		return mv;
	}
	
	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		
		
		
	}
	
	
	//handling
	@RequestMapping(value = "/products", method=RequestMethod.POST)
	public String handleProductSubmission(@Valid @ModelAttribute("product") Product mProduct, BindingResult results, 
			Model model,
			HttpServletRequest request) {
		
		
		
		
		
		
		
		// check if error
			
		
		if(results.hasErrors()) {
			
			model.addAttribute("userClickManageProducts", true);
			model.addAttribute("title", "Manage product");
			model.addAttribute("messgae", "validation failed");
			
			
			return "page";
		}

		
		logger.info(mProduct.toString());
		
		// create a new product record
		productDAO.add(mProduct);
		
		if(!mProduct.getFile().getOriginalFilename().equals("")) {
			
			FileUploadUtility.uploadFile(request, mProduct.getFile(), mProduct.getCode());
			
		}
		
		
		
		return "redirect:/manage/products?operation=product";
		
	}
	
	
	//returning category for all the request mapping
	@ModelAttribute("categories")
	public List<Category> getCategories() {
		
		
		return categoryDAO.list();
		
	}

}
