package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book bo1 = new Book();
		bo1.inform();
		
		Book bo2 = new Book("자바의 정석", "이지퍼블리싱", "서우성");
		bo2.inform();
		
		Book bo3 = new Book("자바의 정석", "이지퍼블리싱", "서우성", 1500, 0.5);
		bo3.inform();
		

	}

}
