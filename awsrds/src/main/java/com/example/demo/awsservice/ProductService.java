package com.example.demo.awsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.awsrepository.ProductRepository;
import com.example.demo.awsresource.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public Product add(Product product) {
		
		Product productT=productRepository.save(product);
		return productT;
		}
	
	

}
