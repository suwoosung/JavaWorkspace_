package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 1 2 3 4 5 6 7 8

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice1();
		}
	}

	public void practice2() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 8 7 6 5 4 3 2 1
		for (int i = num; i > 0 && i <= num; i--) {

			System.out.print(i + " ");
		}

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
		}
	}

	public void practice3() {

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i; // 1부터 정수까지의 합
			System.out.print(i + (i != num ? " + " : " = ")); // 1 + 2 + 3 + 4 ..
		}
		System.out.println(sum);
	}

	public void practice4() {

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (!(num1 > 0 && num2 > 0)) {
			System.out.println("1이상의 수를 입력해주세요");
			practice4();
			return;
		}

		int min = num1 > num2 ? num2 : num1;
		int max = num1 > num2 ? num1 : num2;

		for (int i = min; i < max; i++) {
			System.out.print(i + " ");
		}

//		while (true) {
//			System.out.print("첫 번째 숫자 : ");
//			int num1 = sc.nextInt();
//
//			System.out.print("두 번째 숫자 : ");
//			int num2 = sc.nextInt();
//			
//			if (num1 > 1 && num2 > 1) {
//				for (; num1 < num2; num1++) {
//					System.out.print(num1 + " ");
//				}
//				for (; num2 < num1; num2++) {
//					System.out.print(num2 + " ");
//				}
//				break;
//			} else {
//				System.out.println("1 이상의 숫자를 입력해주세요");
//			}
	}

	public void practice5() {

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num <= 9) {
				for (int i = num; i <= 9; i++) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " X " + j + " = " + (i * j));
					}
				}
				break;
			} else {
				System.out.println(" 9 이하의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice6() {

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		// 10회 반복
		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}

	public void practice7() {

		System.out.print("연산자(+, -, *, /, %) : ");
		String s = sc.next();

		// exit가 맞는지 검사
		char ch = s.charAt(0);

		if (s.equals("exit")) {
			System.out.println("프로그램을 종료합니다");
			return;
		}

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		if (ch == '/' && num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			practice7();
			return;

		} else if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')) {
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			practice7();
			return;
		}

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
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			break;
		}

	}

	public void practice8() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0 && j <= num; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num % 1 == 0 || num % num == 0) {
			System.out.println("소수입니다.");
			return;
		} else if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		} else {
			System.out.println("소수가 아닙니다. 잘못 입력하셨습니다.");
		}
	}
}
