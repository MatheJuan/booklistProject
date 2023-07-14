package com.devlpjruan.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlpjruan.booklist.entities.BookList;

public interface BooklistRepository extends JpaRepository<BookList, Long>{
	
}
