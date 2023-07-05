package com.sudha.tech.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudha.tech.binding.Product;

@RestController
public class ProductController {

	@GetMapping(value = "/product", produces = { "application/xml", "aplication/json" })
	public ResponseEntity<Product> getProduct() {
		com.sudha.tech.binding.Product product = new Product();
		product.setPid(201);
		product.setPname("Laptop");
		product.setPrice(600.00);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
}
