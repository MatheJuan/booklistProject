package com.devlpjruan.booklist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.devlpjruan.booklist.entities.BookList;

public interface BooklistRepository extends JpaRepository<BookList, Long>{
	@Modifying
	@Query(nativeQuery=true, 
	value="UPDATE tb_belonging SET position = :newPosition WHERE booklist_pk= :booklist_pk AND book_pk = :book_pk")
	void newBelongingPosition(Long booklist_pk, Long book_pk, Integer newPosition);
}
