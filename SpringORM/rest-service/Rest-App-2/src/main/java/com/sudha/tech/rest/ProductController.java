package com.sudha.tech.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProduct() {
		Product product = new Product();
		product.setPid(201);
		product.setPname("Laptop");
		product.setPrice(600.00);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
	     Product product1 = new Product(200, "Mobile", 700.00);
	     Product product2 = new Product(300, "IPad", 17000.00);
	     List<Product> list = new ArrayList<>();
	     list.add(product1);
	     list.add(product2);
	     return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
