package com.vinimo.product.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/products/{id}")
	public String getProduct(@PathVariable("id") String id){
		return "test";
		
	}
	
	@PostMapping("/products")
	public String createProduct(){
		return "test";
	}
	
}
