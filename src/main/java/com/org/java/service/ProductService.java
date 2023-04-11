package com.org.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.java.entity.Product;
import com.org.java.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProductDetails(Product product) {
		return productRepository.save(product);
	}
	public List<Product> findAllProducts(){
		List<Product> list=productRepository.findAll();
		return list;
	}

}
