package com.sudha.tech.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudha.tech.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
