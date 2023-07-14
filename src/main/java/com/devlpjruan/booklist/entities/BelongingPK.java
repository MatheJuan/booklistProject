package com.devlpjruan.booklist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable	
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "book_pk")
	private Book book; 
	@ManyToOne
	@JoinColumn(name="booklist_pk")
	private BookList lista;
	
	public BelongingPK() {
	
	}
	public BelongingPK(Book book, BookList lista) {
		super();
		this.book = book;
		this.lista = lista;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public BookList getLista() {
		return lista;
	}


	public void setLista(BookList lista) {
		this.lista = lista;
	}


	@Override
	public int hashCode() {
		return Objects.hash(book, lista);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(book, other.book) && Objects.equals(lista, other.lista);
	}
		
	
}
