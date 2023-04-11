package com.org.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.entity.Product;
import com.org.java.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product products=productService.saveProductDetails(product);
		return new ResponseEntity<>(products, HttpStatus.CREATED);
		
	}
	@GetMapping("/findAll")
	public ResponseEntity<Product> findAllProdcuts(){
		List<Product> products=productService.findAllProducts();
		return new ResponseEntity(products, HttpStatus.OK);
		
	}

}
