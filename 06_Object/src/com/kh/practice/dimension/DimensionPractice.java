package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];
		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = { { 6, 6, 1, 13 }, { 4, 10, 8, 22 }, { 8, 6, 5, 19 }, { 18, 22, 14, 108 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("행 크기 : ");
			int col = sc.nextInt();
			System.out.print("열 크기 : ");
			int row = sc.nextInt();

			char[][] arr = new char[col][row];

			if (!(col >= 1 && col <= 10 && row >= 1 && row <= 10)) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					int num = 0;
					
						
					num = (int) (Math.random() * 24 + 65);
					
					arr[i][j] = (char) num;
					System.out.print((arr[i][j] + " "));
					

					}
				System.out.println();
				}
				break;
			}
		}
	
}
