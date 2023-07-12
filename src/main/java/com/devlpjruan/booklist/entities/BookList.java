package com.devlpjruan.booklist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class BookList {
	
	private Long id;
	private String nome;
	
	
	public BookList() {
		
	}
	public BookList(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookList other = (BookList) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
	
}
