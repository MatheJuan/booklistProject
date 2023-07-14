package com.devlpjruan.booklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devlpjruan.booklist.dto.DataTransferBook;
import com.devlpjruan.booklist.dto.DtoBook;
import com.devlpjruan.booklist.dto.DtoBookList;
import com.devlpjruan.booklist.entities.Book;
import com.devlpjruan.booklist.entities.BookList;
import com.devlpjruan.booklist.projection.DtoBookprojection;
import com.devlpjruan.booklist.repository.BooklistRepository;
import com.devlpjruan.booklist.repository.Bookrepository;

@Service
public class BookService {

	@Autowired
	private Bookrepository repositoryBook;

	@Transactional(readOnly = true)
	public DataTransferBook findById(Long id) {
		Book result = repositoryBook.findById(id).get();
		return new DataTransferBook(result);
	}

	@Transactional(readOnly = true)
	public List<DtoBook> findAll() {
		List<Book> result = repositoryBook.findAll();

		return result.stream().map(x -> new DtoBook(x)).toList();

	}

	public List<DtoBook> findByList(@PathVariable Long idlist) {
		List<DtoBookprojection> result = repositoryBook.searchByList(idlist);
		return result.stream().map(x -> new DtoBook(x)).toList();

	}

}
