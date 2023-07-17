package com.devlpjruan.booklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlpjruan.booklist.dto.DtoBookList;
import com.devlpjruan.booklist.entities.BookList;
import com.devlpjruan.booklist.projection.DtoBookprojection;
import com.devlpjruan.booklist.repository.BooklistRepository;
import com.devlpjruan.booklist.repository.Bookrepository;

@Service
public class BookListService {
	@Autowired
	private BooklistRepository booklistRepository;
	
	@Autowired
	private Bookrepository bookrepository;
	
	@Transactional(readOnly = true)
	public List<DtoBookList> findAllBookList() {
		
		List<BookList> lista = booklistRepository.findAll();
		return lista.stream().map(x -> new DtoBookList(x)).toList();
	}
	@Transactional
	public void updateList(Long listId, int originIndex, int finalPosition) {
		List<DtoBookprojection> lista = bookrepository.searchByList(listId);
		DtoBookprojection obj = lista.remove(originIndex);
		lista.add(finalPosition, obj);
		
		int min = originIndex < finalPosition ? originIndex : finalPosition;
		int max = originIndex < finalPosition ? finalPosition : originIndex;
		
		for(int i=min; i<=max; i++) {
			booklistRepository.newBelongingPosition(listId, lista.get(i).getId(), i);
		}
	}
}
