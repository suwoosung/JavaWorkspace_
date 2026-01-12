package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		while (true) {
			System.out.println("== Welcome KH Library ==");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void insertBook() {
		System.out.print("도서 명 : ");
		String title = sc.next();

		System.out.print("저자 명 : ");
		String author = sc.next();

		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();

		System.out.println("가격 : ");
		int price = sc.nextInt();
		String[] bk = null;
		switch (category) {
		case 1:
			for (String s : bk) {
				if (s != null) {
					s = "인문";
				}
			}
			break;
		case 2:
			for (String s : bk) {
				if (s != null) {
					s = "자연과학";
				}
			}
			break;
		case 3:
			for (String s : bk) {
				if (s != null) {
					s = "의료";
				}
			}
			break;
		case 4:
			for (String s : bk) {
				if (s != null) {
					s = "기타";
				}
			}
			break;
		}

		Book b = new Book(title, author, s, price);

		bc.insertBook(b);

	}

	public void selectList() {

	}

	public void searchBook() {

	}

	public void deleteBook() {

	}

	public void ascBook() {

	}

}
