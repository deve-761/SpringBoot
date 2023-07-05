package com.sudha.tech;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		
		Author author = new Author();
		author.setAuthorName("Robert");
		author.setAuthorEmail("robert@gmail.com");
		author.setAuthorPhn(9844373773l);
		
		Book book = new Book();
		book.setId(6000);
		book.setName("SpringBoot");
		book.setPrice(600.00);
		book.setAuthor(author);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion completed........");
	}
}
