package com.devlpjruan.booklist.dto;

import org.springframework.beans.BeanUtils;

import com.devlpjruan.booklist.entities.Book;

public class DataTransferBook {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String author;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	
	
	public DataTransferBook() {

	}
	public DataTransferBook(Book entity) {
		BeanUtils.copyProperties(entity, this);
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
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
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	

}
