package com.devlpjruan.booklist.dto;

import org.springframework.beans.BeanUtils;

import com.devlpjruan.booklist.entities.BookList;

public class DtoBookList {
	
	private Long id;
	private String nome;
	
	
	public DtoBookList() {
	}
	public DtoBookList(BookList entity) {
		BeanUtils.copyProperties(entity, this);
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
	
	
}
