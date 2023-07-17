package com.devlpjruan.booklist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlpjruan.booklist.dto.DataTransferBook;
import com.devlpjruan.booklist.dto.DtoBook;
import com.devlpjruan.booklist.services.BookService;

@RestController
@RequestMapping(value = "/livros")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping(value = "/{id}")
	public DataTransferBook findById(@PathVariable Long id){
		DataTransferBook result = bookService.findById(id);
		return result;	
	}
	
	@GetMapping
	public List<DtoBook> findAll(){
		List<DtoBook> result = bookService.findAll();
		return result;
		
	}
	
}