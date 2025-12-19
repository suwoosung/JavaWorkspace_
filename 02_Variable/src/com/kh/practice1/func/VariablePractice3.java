package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		Double f1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		Double f2 = sc.nextDouble();
		
		System.out.println("면적 : "+ (f1*f2));
		
		System.out.println("둘레 : "+ ((f1*f2)*2));
		
	}
}
