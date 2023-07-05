package com.sudha.tech.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sudha.tech.binding.Book;

@Service
public class BookClient {

	public void invokeBookTicket() {

		Book book = new Book();
		book.setBookName("Java");
		book.setBookPrice(345.00);

		String url = "http://localhost:5656/save/book";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(url, book, String.class);
		System.out.println(postForEntity.getBody());
	}

	public void invokeGetBooksOld() {
		String url = "http://localhost:5656/getall/book";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> getEntity = rt.getForEntity(url, String.class);
		String body = getEntity.getBody();
		System.out.println(body);
	}

	public void invokeGetBooksNew() {
		String url = "http://localhost:5656/getall/book";

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book[]> getEntity = rt.getForEntity(url, Book[].class);
		Book[] books = getEntity.getBody();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
