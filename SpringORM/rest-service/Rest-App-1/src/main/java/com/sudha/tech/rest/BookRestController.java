package com.sudha.tech.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name){
		String response = name + " Book Price is 500 $ ";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/book/{bname}/{aname}")
	public ResponseEntity<String> getBookPrice(@PathVariable("bname") String bname,@PathVariable("aname") String aname){
		String response = bname + " By " + aname+  " is out of stock ";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
