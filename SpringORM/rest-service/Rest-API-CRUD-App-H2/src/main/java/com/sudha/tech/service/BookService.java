package com.sudha.tech.service;

import java.util.List;

import com.sudha.tech.entity.Book;

public interface BookService {

	public String upsertBook(Book book);

	public List<Book> getAllBook();

	//public String updateBook(Book book);

	public String deleteBook(Integer bookId);
}
