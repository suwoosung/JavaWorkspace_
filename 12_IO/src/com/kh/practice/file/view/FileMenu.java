package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() throws FileNotFoundException {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
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
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String input = sc.nextLine();

			if ("ex끝it".equals(input)) {
				break;
			}
			sb.append(input).append("\n"); // 내가 입력한 값을 StringByilder에 저장
		}
		while (true) {
			System.out.print("저장할 파일명을 입력해주세요(ex.myFile.txt) : ");
			String fileName = sc.nextLine();

			boolean isFileExist = fc.checkName(fileName);
			
			if(!isFileExist) {
				fc.fileSave(fileName, sb);
				return;
			}
			
			if (isFileExist) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n): ");
				char ch = sc.nextLine().toLowerCase().charAt(0);
				if (ch == 'y') {
					fc.fileSave(fileName, sb);
				} else {
					continue;
				}
				break;
			}
		}
	}
	public void fileOpen() throws FileNotFoundException {
		System.out.print("열 파일명 : ");
		String fileName = sc.nextLine();

		boolean exist = fc.checkName(fileName);
		
		if (!exist) {
			System.out.println("없는 파일입니다.");
			return;
			//throw new RuntimeException("존재하지 않는 파일입니다.")
		}
		System.out.println(fc.fileOpen(fileName));
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exists = fc.checkName(fileName);

		if (!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}

		StringBuilder sb = new StringBuilder();

		while (true) {
			if (fc.checkName(fileName)) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String input = sc.nextLine();

				if ("ex끝it".equals(input)) {
					break;
				}
				sb.append(input).append("\n");
			}
		}
		fc.fileEdit(fileName, sb);
	}
}
