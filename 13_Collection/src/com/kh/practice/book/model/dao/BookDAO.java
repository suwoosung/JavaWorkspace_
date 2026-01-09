package com.kh.practice.book.model.dao;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {

	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("book.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		ArrayList<Book> list = new ArrayList<Book>(3);
	}
}
