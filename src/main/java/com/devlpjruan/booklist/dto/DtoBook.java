package com.devlpjruan.booklist.dto;

import com.devlpjruan.booklist.entities.Book;

public class DtoBook {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public DtoBook() {
	}

	public DtoBook(Book book) {
		
		this.id = book.getId();
		this.title = book.getTitle();
		this.year = book.getYear();
		this.imgUrl = book.getImgUrl();
		this.shortDescription = book.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
}
