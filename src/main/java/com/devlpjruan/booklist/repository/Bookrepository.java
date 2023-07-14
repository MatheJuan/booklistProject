package com.devlpjruan.booklist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devlpjruan.booklist.dto.DtoBook;
import com.devlpjruan.booklist.entities.Book;
import com.devlpjruan.booklist.projection.DtoBookprojection;


public interface Bookrepository extends JpaRepository<Book, Long>{
	@Query(nativeQuery = true, value=
	"SELECT tb_book.id, tb_book.title, tb_book.book_year AS year, tb_book.img_url AS imgurl,\r\n"
	+ "tb_book.short_description AS shortDescription, tb_book.long_description AS longDescription, tb_belonging.position\r\n"
	+ "FROM tb_book\r\n"
	+ "INNER JOIN tb_belonging ON tb_book.id = tb_belonging.book_pk \r\n"
	+ "WHERE tb_belonging.booklist_pk = :listId"
	+ "		ORDER BY tb_belonging.position"
	 		)
	List<DtoBookprojection> searchByList(Long listId);
}
