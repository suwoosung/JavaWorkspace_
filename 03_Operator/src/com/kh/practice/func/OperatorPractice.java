package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수: ");
		int num1 = sc.nextInt();

		System.out.print("사탕 개수: ");
		int num2 = sc.nextInt();

		int result1 = num2 / num1;
		int result2 = num2 % num1;

		System.out.println();
		System.out.println("1인당 사탕 개수: " + result1);
		System.out.println("남는 사탕 개수: " + result2);
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int num1 = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num2 = sc.nextInt();

		System.out.print("성별(M/F) : ");
		char ch = sc.next().charAt(0);
		String gender = ch == 'M' ? "남학생" : "여학생";

		System.out.print("성적(소수점 아래 둘째자라까지) : ");
		Double result = sc.nextDouble();

		System.out.print(grade + "학년 " + num1 + "반 " + num2 + "번 " + name + " " + gender + "의 성적은 " + result + "이다.");
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		String result = age <= 13 ? "어린이" : (age > 13 && age <= 19) ? "청소년" : "성인";

		System.out.println();
		System.out.println(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int num1 = sc.nextInt();

		System.out.print("영어 : ");
		int num2 = sc.nextInt();

		System.out.print("수학 : ");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		String result = num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60 ? "합격" : "불합격";

		System.out.println(result);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.next();
		char ch = str.charAt(7);
		String num = ch == '1' || ch == '3' ? "남자" : "여자";

		System.out.println(num);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean b = num3 <= num1 || num3 > num2 ? true : false;

		System.out.println(b);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean b = num1 == num2 && num2 == num3 && num1 == num3 ? true : false;

		System.out.println(b);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double n1 = num1+(double)(num1*0.4);
		double n2 = (double)(num1);
		double n3 = (num1+(double)(num1*0.15));
		
		String b1=n1>=3000 ? "3000 이상" : "3000 미만";
		String b2=n2>=3000 ? "3000 이상" : "3000 미만";
		String b3=n3>=3000 ? "3000 이상" : "3000 미만";
			
		System.out.println("A사원의 연봉/연봉+a : "+"num1/n1");
		System.out.println(b1);
		System.out.println("B사원의 연봉/연봉+a : "+"num2/n2");
		System.out.println(b2);
		System.out.println("B사원의 연봉/연봉+a : "+"num3/n3");
		System.out.println(b3);
	}
}
