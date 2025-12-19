package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void Practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열을 입력하세요: ");
		String word = sc.next();

		System.out.println("첫번째 문자: " + word.charAt(0));
		System.out.println("두번째 문자: " + word.charAt(1));
		System.out.println("세번째 문자: " + word.charAt(2));

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("국 : ");
		double kor = sc.nextDouble();

		System.out.println("영 : ");
		double eng = sc.nextDouble();

		System.out.println("수 : ");
		double math = sc.nextDouble();
		
		int total = (int) (kor + eng + math);
		int avg = total / 3;

		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}

	public void math() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println( iNum1/iNum2); // 2
		System.out.println( (int)dNum); // 2
		
		System.out.println( (double)iNum2*dNum); // 10.0
		System.out.println( (double)iNum1); // 10.0
		
		System.out.println( (double)iNum1/iNum2); // 2.5
		System.out.println(dNum ); // 2.5
		
		System.out.println( (int)fNum); // 3
		System.out.println(iNum1/(int)fNum); // 3
		
		System.out.println(iNum1/fNum );// 3.3333333
		System.out.println(iNum1/(double)fNum ); // 3.3333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( (int) ch ); // 65
		
		System.out.println( ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'
	}
}