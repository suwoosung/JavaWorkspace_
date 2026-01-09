package com.kh.practice.book.controller;

import java.io.File;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {

	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		File f = new File("Book.txt");
		if(!(f.exists())) {
			f.mkdir();
		}
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
