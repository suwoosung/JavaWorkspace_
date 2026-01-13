package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {

	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		while (true) {
			System.out.println("======= kh 추첨 프로그램 =======");
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 담청 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 검색 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int insert = sc.nextInt();

		for (int i = 0; i < insert; i++) {
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.next();

			Lottery l = new Lottery(name, phone);
			boolean result = lc.insertObject(l);

			if (!result) {
				System.out.println("중복된 추첨 대상입니다, 다시 입력하세요");
				i--;
			}
		}
		System.out.println(insert + "명 추가 완료되었습니다");

	}

	public void deleteObject() {
		System.out.println("삭제할 이름과 삭제할 핸드폰 번호를 입력하세요.");

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();

		Lottery remove = new Lottery(name, phone);
		boolean result = lc.deleteObject(remove);

		if (result) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void winObject() {
		HashSet<Lottery> s = lc.winObject();
		System.out.println(s);
	}

	public void sortedWinObject() {
		TreeSet<Lottery> set = lc.sortedWinObject();
		
		Iterator<Lottery> iter = set.iterator();
		while(iter.hasNext()) {
			Lottery lo = iter.next();
			System.out.println(lo);
		}
	}

	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();

		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);

		if (result == true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}
}
