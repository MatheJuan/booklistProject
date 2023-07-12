package com.devlpjruan.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlpjruan.booklist.entities.Book;

@Repository

public interface Bookrepository extends JpaRepository<Book, Long>{

}
