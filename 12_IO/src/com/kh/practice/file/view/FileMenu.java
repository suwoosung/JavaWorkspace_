package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.print("1. 노트 새로 만들기");
			System.out.print("2. 노트 열기");
			System.out.print("3. 노트 열어서 수정하기");
			System.out.print("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				fc.fileSave();
				break;
			case 2:
				fc.fileOpen();
				break;
			case 3:
				fc.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝ix 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.next();

			if ("ex끝it".equals(str)) {
				break;
			}

			sb.append(str); // 내가 입력한 내용 저장

			System.out.print("저장할 파일명을 입력해주세요(ex.myFile.txt): ");
			String title = sc.next();
			// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
			// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
			// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
			// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
			// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
			// 파일 명과 내용을 fc에 fileSave 메소드로 넘김

			if (title.equals(fc.fileSave(title))) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char ch = sc.next().toUpperCase().charAt(0);
				if (ch == 'Y') {
					sb.append(title);
				} else {
					System.out.println("저장할 파일 명을 입력해주세요 ~");
				}
			}
		}
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
	}
}
