package com.devlpjruan.booklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlpjruan.booklist.dto.DtoBook;
import com.devlpjruan.booklist.entities.Book;
import com.devlpjruan.booklist.repository.Bookrepository;

@Service
public class BookService {
	
	@Autowired
	private Bookrepository repositoryBook;
	
	public List<DtoBook> findAll(){
		List<Book> result=  repositoryBook.findAll();
		List<DtoBook> dto = result.stream().map(x -> new DtoBook(x)).toList();
		return dto;	}
}
