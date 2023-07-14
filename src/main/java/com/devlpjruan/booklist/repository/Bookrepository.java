package com.devlpjruan.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlpjruan.booklist.entities.Book;


public interface Bookrepository extends JpaRepository<Book, Long>{

}
