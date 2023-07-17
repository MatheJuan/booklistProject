package com.devlpjruan.booklist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlpjruan.booklist.dto.DtoBook;
import com.devlpjruan.booklist.dto.DtoBookList;
import com.devlpjruan.booklist.dto.ReplaceBookDto;
import com.devlpjruan.booklist.services.BookListService;
import com.devlpjruan.booklist.services.BookService;

@RequestMapping
@RestController
public class BookListController {
	@Autowired
	private BookListService booklistservice;
	@Autowired
	private BookService bookService;
	@GetMapping
	public List<DtoBookList> findAllList(){
		List<DtoBookList> result = booklistservice.findAllBookList();
		return result;
}
	@GetMapping(value="/{idlist}/book")
	public List<DtoBook> findAll(@PathVariable Long idlist){
		List<DtoBook> result = bookService.findByList(idlist);
		return result;
		
	}
	@PostMapping(value="/{idlist}/replacement")
	public void updateBookList(@PathVariable Long idlist, @RequestBody ReplaceBookDto body){
		booklistservice.updateList(idlist, body.getOriginIndex() , body.getFinalIndex());
		
		
	}
}
