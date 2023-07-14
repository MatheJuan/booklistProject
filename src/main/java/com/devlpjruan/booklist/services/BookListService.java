package com.devlpjruan.booklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlpjruan.booklist.dto.DtoBookList;
import com.devlpjruan.booklist.entities.BookList;
import com.devlpjruan.booklist.repository.BooklistRepository;

@Service
public class BookListService {
	@Autowired
	private BooklistRepository booklistRepository;
	
	@Transactional(readOnly = true)
	public List<DtoBookList> findAllBookList() {
		
		List<BookList> lista = booklistRepository.findAll();
		return lista.stream().map(x -> new DtoBookList(x)).toList();
	}
}
