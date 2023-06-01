package com.example.demo.awsresources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.awsresource.Product;
import com.example.demo.awsservice.ProductService;

@RestController
@RequestMapping("/awsproduct/api.2.0")

public class ProductResource {
	@Autowired
	
	ProductService service;
	@PostMapping
	@RequestMapping(value="/create", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE )

	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		
			return new ResponseEntity<Product>(service.add(product),HttpStatus.ACCEPTED);
		

	
}}
