package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("입력");
			break;
		case 2:
			System.out.print("수정");
			break;
		case 3:
			System.out.print("조회");
			break;
		case 4:
			System.out.print("삭제");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
		// 메서드 내 어디서든 사용가능
		// 현재 위치에서 메서드를 "종료"시키는 키워드
		}
		System.out.println(" 메뉴입니다");
	}

	public void practice2() {

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		// 양수인지 아닌지
		if (!(num > 0)) {
			System.out.println("양수만 입력하세요");
			return;
		}
		// 홀수인지 짝수인지
		if (num % 2 == 1) {
			System.out.println("홀수다");
		} else
			System.out.println("짝수다");

		// 중첩 if문 구조
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		}
	}

	public void practice3() {
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3;

		if (!(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60)) {
			System.out.println("불합격입니다.");
			return;
		}
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + avg);
		System.out.println("축하합니다, 합격입니다!");
	}

	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season;

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			season = "해당하는 계절이 없습니다.";
			System.out.println(month + "월은 잘못 입력괸 달입니다.");
		}

		System.out.println(month + "월은 " + season + "입니다.");
	}

	public void practice5() {
		System.out.print("아이디 : ");
		String id = sc.next();

		System.out.print("비밀번호 : ");
		String password = sc.next();

//		if (id.equals("minmin") && password.equals("Minmin1234")) {
//			System.out.println("로그인 성공");
//		} else if (password.equals("Minmin1234")) {
//			System.out.println("아이디가 틀렸습니다.");
//		} else if (id.equals("minmin")) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		} else {
//			System.out.println("아이디와 비밀번호 둘다 틀렸습니다.");
//		}

		if (id.equals("minmin") && password.equals("Minmin1234")) {
			System.out.println("로그인 성공");
			return;
		}

		if (!(id.equals("minmin"))) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}

		if (!(password.equals("Minmin1234"))) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
	}

	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String revel = sc.next();

		switch (revel) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("다시입력하세요.");
		}
	}

	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double BMI = kg / (m * m);
		System.out.println("BMI 지수 : " + BMI);

		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI < 25) {
			System.out.println("과체중");
		} else if (BMI < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}

	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.next().charAt(0);

		if (num1 > 0 && num2 > 0) {

			switch (ch) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out.println(num1 + " / " + num2 + " = " + (double) (num1 / num2));
				break;
			case '%':
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}

	public void practice9() {
		System.out.print("중간고사 점수 : ");
		int num1 = sc.nextInt();

		System.out.print("기말고사 점수 : ");
		int num2 = sc.nextInt();

		System.out.print("과제점수 : ");
		int sj = sc.nextInt();

		System.out.print("출석횟수 : ");
		int ps = sc.nextInt();

		System.out.println("================= 결과 =================");

		Double n1 = num1 * 0.2;
		Double n2 = num2 * 0.3;
		Double sj1 = sj * 0.3;
		Double ps1 = 100 * ps / 20 * 0.2;
		Double sum = n1 + n2 + sj1 + ps1;

		System.out.println("중간고사 점수(20) : " + n1);

		System.out.println("기말고사 점수(30) : " + n2);

		System.out.println("과제점수     (30) : " + sj1);

		System.out.println("출석점수     (20) : " + ps1);

		System.out.println("총점 : " + sum);

		if (sum >= 70) {
			System.out.println("Pass");
		} else
			System.out.println("Fail");

		if (!(ps > 20 * 0.3)) {
			System.out.println("Fail [출석 회수 부족(" + ps + "/20)");
			return;
		}
	}

	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");

		System.out.print("선택 : ");
		int num = sc.nextInt();

		switch (num) {
		case (1):
			practice1();
			break;
		case (2):
			practice2();
			break;
		case (3):
			practice3();
			break;
		case (4):
			practice4();
			break;
		case (5):
			practice5();
			break;
		case (6):
			practice6();
			break;
		case (7):
			practice7();
			break;
		case (8):
			practice8();
			break;
		case (9):
			practice9();
			break;
		default:
			System.out.println("없는 기능입니다.");
		}
	}
}
