package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.movel.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			int currentCount = mc.existMemberNum();
			System.out.println("현재 등록된 회원 수는 " + currentCount + "명입니다.");
			if (currentCount != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈딥니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				if (currentCount != MemberController.SIZE) {
					insertMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			case 2:
				if (currentCount != MemberController.SIZE) {
					searchMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 3:
				if (currentCount != MemberController.SIZE) {
					updateMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 4:
				if (currentCount != MemberController.SIZE) {
					deleteMember();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 5:
				if (currentCount != MemberController.SIZE) {
					printAll();
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		String id = null;
		while (true) {
			System.out.print("아이디 : ");
			id = sc.next();

			boolean isDup = mc.checkId(id);
			if (isDup) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();

		char gender = '\u0000';
		while (true) {
			System.out.print("성별 : ");
			gender = sc.next().toUpperCase().charAt(0);

			if (gender == 'M' || gender == 'F') {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();

		String str = mc.searchId(id);

		if (str == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(str);
		}
	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();

		Member[] m = mc.searchName(name);

		if (m == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (Member i : m) {
				if (i != null) {
					System.out.println(i);
				}
			}
		}
	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();

		Member[] m = mc.searchEmail(email);

		if (m == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (Member i : m) {
				if (i != null) {
					System.out.println(i);
				}
			}
		}
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	public void updatePassword() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 패스워드 : ");
		String password = sc.next();

		boolean result = mc.updatePassword(id, password);

		if (result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void updateName() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();

		boolean result = mc.updateName(id, name);

		if (result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;

		}
	}

	public void updateEmail() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();

		boolean result = mc.updateEmail(id, email);

		if (result) {
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;

		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 아이디 : ");
		String id = sc.next();

		System.out.print("정말로 삭제하시겠습니까?(Y/N) : ");
		char delete = sc.next().toUpperCase().charAt(0);

		if (delete == 'Y') {
			boolean result = mc.delete(id);

			if (result) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
				return;
			}
		} else {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
	}

	public void deleteAll() {
		System.out.print("정말로 삭제하시겠습니까?(Y/N) : ");
		char delete = sc.next().toUpperCase().charAt(0);

		if (delete == 'y') {
			mc.delete();
		} else {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
	}

	public void printAll() {
		Member[] m = mc.printAll();
		int count = mc.existMemberNum();

		if (count == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		} else {
			for (Member i : m) {
				if (i != null)
					System.out.println(i);
			}
		}
	}
}
