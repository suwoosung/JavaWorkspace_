package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.movel.vo.Farm;
import com.kh.practice.generics.movel.vo.Fruit;
import com.kh.practice.generics.movel.vo.Nut;
import com.kh.practice.generics.movel.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public void mainMenu() {
		while (true) {
			System.out.println("========== KH 마트 ==========");
			System.out.println("******* 메인메뉴 *******");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void adminMenu() {
		while (true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void customerMenu() {
		while (true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	public void addNewKind() {
		while (true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int kind = sc.nextInt();

			if (!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				addNewKind();
				return;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("수량 : ");
			int Acount = sc.nextInt();

			Farm f = null;
			if (kind == 1) {
				f = new Fruit("과일", name);
			} else if (kind == 2) {
				f = new Vegetable("야채", name);
			} else if (kind == 3) {
				f = new Nut("견과", name);
			}

			boolean result = fc.addNewKind(f, Acount);

			if (result) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패했습니다. 다시입력해주세요.");
			}
		}
	}

	public void removeKind() {
		while (true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();

			if (!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			Farm f = null;
			if (kind == 1) {
				f = new Fruit("과일", name);
			} else if (kind == 2) {
				f = new Vegetable("채소", name);
			} else {
				f = new Nut("견과", name);
			}

			boolean result = fc.removeKind(f);
			if (result) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else {
				System.out.println("농산물 삭제에 실패했습니다. 다시입력해주세요.");
			}
		}
	}

	public void changeAmount() {
		while (true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();

			if (!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			Farm f = null;
			if (kind == 1) {
				f = new Fruit("과일", name);
			} else if (kind == 2) {
				f = new Vegetable("야채", name);
			} else {
				f = new Nut("견과", name);
			}

			System.out.print("수량 : ");
			int Acount = sc.nextInt();

			boolean result = fc.changeAmount(f, Acount);
			if (result) {
				System.out.println("수량이 수정되었습니다..");
				break;
			} else {
				System.out.println("수정 실패했습니다. 다시입력해주세요.");
			}
		}
	}

	public void printFarm() {
		Map<Farm, Integer> map = fc.printFarm();
		Set<Farm> set = map.keySet();
		for (Farm f : set) {
			System.out.println(f + "(" + map.get(f) + "개)");
		}
	}

	private Farm inputFarm() {
		Farm f = null;
		while (true) {
			System.out.print("1. 과일 / 2. 채소 / 3. 견과 : ");
			int kind = sc.nextInt();

			if (!(kind >= 1 && kind <= 3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요. ");
				continue;
			}

			System.out.print("이름 : ");
			String name = sc.next();

			if (kind == 1) {
				f = new Fruit("과일", name);
			} else if (kind == 2) {
				f = new Vegetable("야채", name);
			} else {
				f = new Nut("견과류", name);
			}
			break;
		}
		return f;
	}

	public void buyFarm() {
		Farm f = inputFarm();
		boolean result = fc.buyFarm(f);

		if (result) {
			System.out.println("구매에 성공하였습니다.");
		} else {
			System.out.println("마트에 없는 물건이나거 수량이 없습니다. 다시 입력해주세요.");
			buyFarm();
		}
	}

	public void removeFarm() {
		Farm f = inputFarm();

		boolean result = fc.removeFarm(f);

		if (result) {
			System.out.println("구매취소에 성공하였습니다.");
		} else {
			System.out.println("구매목록에 없습니다.");
			removeFarm();
		}
	}

	public void printBuyFarm() {
		List<Farm> list = fc.printBuyFarm();
		Iterator<Farm> iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
