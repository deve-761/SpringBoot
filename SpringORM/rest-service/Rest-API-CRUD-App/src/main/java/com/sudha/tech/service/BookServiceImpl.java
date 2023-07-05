package com.sudha.tech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sudha.tech.entity.Book;
import com.sudha.tech.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public String upsertBook(Book book) {

		Integer bookId = book.getBookId();
		System.out.println(book);

		Book savedBook = bookRepository.save(book);
		System.out.println(book);

		if (bookId == null) {
			return "Book Inserted";
		} else {
			return "Book Updated";
		}
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
		return "Book Deleted";
	}

}
