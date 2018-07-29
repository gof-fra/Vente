package com.haggar.vente.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHanlder {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		
		mv.addObject("errorTitle", "This page is not accessible!!!");
		
		mv.addObject("errorDescription", "The page you are looking for is not available right now.... <br/><br/> Thaks for understanding...<br/><br/>Don't try again 😎.");
		
		mv.addObject("title", "404 Error Page");
		
		
		return mv;
		
	}
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		
		mv.addObject("errorTitle", "This product is not accessible!!!");
		
		mv.addObject("errorDescription", "The product you are looking for is not available right now.... <br/><br/> Until next time 😁...");
		
		mv.addObject("title", "Product Unavailable");
		
		
		return mv;
		
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception exp) {
		
		ModelAndView mv = new ModelAndView("error");
		
		
		mv.addObject("errorTitle", "Contact your Administrator👨🏽‍ 💻 👨🏽‍💻");
		
		/*
		 * only for debugging for application
		 * */
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exp.printStackTrace(pw);
		
		mv.addObject("errorDescription", sw.toString());
		
		mv.addObject("title", "Error");
		
		
		return mv;
		
	}

}
