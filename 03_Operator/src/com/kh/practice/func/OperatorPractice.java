package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candys = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� "+ (person / candys));
		System.out.println("���� ���� ���� "+ (person % candys));
	}

	public void practice2() {
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		
		System.out.print("�� : ");
		int classes = sc.nextInt(); 
		
		System.out.print("��ȣ : ");
		int num = sc.nextInt();
		
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("���� : ");
		double d = sc.nextDouble();
		
		System.out.println(
				grade+"�г� "+classes+"�� "+num+"�� "+name
				+(ch == 'M' ? "���л�" : "���л�")
				+ "�� ������ "+d+"�̴�.");
	}

	public void practice3() {
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String str = age <= 13 ? "���" : 
						(age <= 19 ? "û�ҳ�" : "����");
		System.out.println(str);
	}

	public void practice4() {
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		
		System.out.println(
				kor >= 40 && eng >= 40 && math >= 40
				&& avg >= 60.0 ? "�հ�" : "���հ�");
	}
	
	public void practice5() {
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String str = sc.next();
		char gender = str.charAt(7);// 1 �� | 2����
		System.out.println(gender == '1' || gender == '3'
				? "����" :"����" );
	}
	
	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 || 
				input > num2;
				
		System.out.println(result);
	}
	
	public void practice7() {
		System.out.print("입력 1 :");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 :");
		int num3 = sc.nextInt();
		
		boolean result = 
				num1 == num2 &&
				num2 == num3;
	}
	
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int salaryA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int salaryB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int salaryC = sc.nextInt();
		
		double inSalaryA = salaryA * 1.4;// 인센 0.4
		double inSalaryB = salaryB * 1.0;// 인센 X
		double inSalaryC = salaryC * 1.15;
		
		System.out.println("A사원 연봉/연봉+인센 : " 
		+ salaryA +"/"+inSalaryA);
		System.out.println(inSalaryA >= 3000 ? "3000이상": "3000이하");
		
		System.out.println("B사원 연봉/연봉+인센 : " 
				+ salaryB +"/"+inSalaryB);
				System.out.println(inSalaryB >= 3000 ? "3000이상": "3000이하");
		
		System.out.println("C사원 연봉/연봉+인센 : " 
				+ salaryC +"/"+inSalaryC);
				System.out.println(inSalaryC >= 3000 ? "3000이상": "3000이하");
	}
	
	
	
	
	
	
	
	
}
