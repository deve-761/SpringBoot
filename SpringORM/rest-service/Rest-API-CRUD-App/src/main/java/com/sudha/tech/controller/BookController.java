package com.sudha.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudha.tech.entity.Book;
import com.sudha.tech.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/save/book")
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		String msg = bookService.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/getall/book")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = bookService.getAllBook();
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}

	@PutMapping("/update/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book) {
		String msg = bookService.upsertBook(book);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		String msg = bookService.deleteBook(bookId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
