package com.kh.practice.chap05_class.model.vo;

public class Book {
	// 필즈
	public String title;
	public String author;
	
	// 생성자부
	public Book() {
		
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// 메서드부
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
