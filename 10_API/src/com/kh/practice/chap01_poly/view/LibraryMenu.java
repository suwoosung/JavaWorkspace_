package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibaryController;
import com.kh.practice.chap01_poly.model.vo.Book;

public class LibraryMenu {
	LibaryController lc = new LibaryController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 잔체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				lc.myinfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				return;
			}
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for (int i=0; i<bList.length; i++) {
			System.out.println(bList[i]);
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		
		for(Book arr : searchList) {
			System.out.println();
		}
		
	}

	public void rentBook() {

	}
}
