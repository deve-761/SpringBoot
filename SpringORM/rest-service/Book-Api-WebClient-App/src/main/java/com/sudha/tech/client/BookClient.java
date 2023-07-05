package com.sudha.tech.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sudha.tech.binding.Book;

@Service
public class BookClient {

	public void invokeSaveBook() {

		Book book = new Book();
		book.setBookName("SpringBoot");
		book.setBookPrice(600.00);

		String url = "http://localhost:5656/save/book";

		WebClient client = WebClient.create();

		String resp = client.post().uri(url).bodyValue(book).retrieve().bodyToMono(String.class).block();
		System.out.println(resp);
	}

	public void invokeGetBooks() {
		String url = "http://localhost:5656/getall/book";

		WebClient client = WebClient.create();

		/*
		 * String block = client.get() // GET request .uri(url) // Endpoint url
		 * .retrieve()// retrieve response body .bodyToMono(String.class) // bind
		 * response data .block(); // make it sync
		 */

		Book[] responseData = client.get().uri(url).retrieve().bodyToMono(Book[].class).block();
	
		for(Book book:responseData) {
			System.out.println(book);
		}
	}
	
	public void invokeGetBooksAsync() {
		String url = "http://localhost:5656/getall/book";

		WebClient client = WebClient.create();

	   client.get().uri(url).retrieve().bodyToMono(Book[].class).subscribe(BookClient::respHandler);
		
		System.out.println("******Request Sent*************");
		
	}
	
	public static void respHandler(Book[] books) {
		for(Book book:books){
			System.out.println(book);
		}
	}
}
