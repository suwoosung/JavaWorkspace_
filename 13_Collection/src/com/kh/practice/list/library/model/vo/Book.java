package com.kh.practice.list.library.model.vo;

public class Book<T> implements Comparable<T>{

	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		
	}

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public int hashCode() {
		
	}
	
	public boolean equals() {
		
	}

	@Override
	public int compareTo(T o) {
		return 0;
	}
	
	
}
