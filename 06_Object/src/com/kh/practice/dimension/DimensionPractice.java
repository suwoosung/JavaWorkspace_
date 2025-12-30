package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

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
		int[][] arr =new int[4][4];
//		int[][] arr = { { 6, 6, 1, 13 },
//					  { 4, 10, 8, 22 },
//					  { 8, 6, 5, 19 },
//					  { 18, 22, 14, 108 } };

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j] * 2;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			System.out.print("열 크기 : ");
			int col = sc.nextInt();

			char[][] arr = new char[row][col];

			if (!(col >= 1 && col <= 10 && row >= 1 && row <= 10)) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {

					int random = (int) (Math.random() * 26 + 65);

					arr[i][j] = (char) random;
					System.out.print((arr[i][j] + " "));

				}
				System.out.println();
			}
			break;
		}
	}

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();

		int[][] arr = new int[rowSize][];
		char ch = 'a';

		for (int i = 0; i < rowSize; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int colSize = sc.nextInt();

			arr[i] = new int[colSize];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch;
				System.out.print((char) arr[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public void practice8() {

		String[][] arr1 = new String[3][];
		String[][] arr2 = new String[3][];

		arr1[0] = new String[] { "강건강", "남나나" };
		arr1[1] = new String[] { "도대남", "류라라" };
		arr1[2] = new String[] { "문미미", "박보배" };

		arr2[0] = new String[] { "송성실", "윤예의" };
		arr2[1] = new String[] { "진재주", "차천축" };
		arr2[2] = new String[] { "피풍표", "홍하하" };

		System.out.println("== 1분단 ==");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		String[][] arr1 = new String[3][];
		String[][] arr2 = new String[3][];

		arr1[0] = new String[] { "강건강", "남나나" };
		arr1[1] = new String[] { "도대남", "류라라" };
		arr1[2] = new String[] { "문미미", "박보배" };

		arr2[0] = new String[] { "송성실", "윤예의" };
		arr2[1] = new String[] { "진재주", "차천축" };
		arr2[2] = new String[] { "피풍표", "홍하하" };

		System.out.println("== 1분단 ==");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===========================");

		String[][] copyArr = new String[arr1.length + arr2.length][];
		System.arraycopy(arr1, 0, copyArr, 0, arr1.length);
		System.arraycopy(arr2, 0, copyArr, arr1.length, arr2.length);

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();

		for (int i = 0; i < copyArr.length; i++) {
			for (int j = 0; j < copyArr[i].length; j++) {
				if(copyArr[i][j].equals(name)) {
				int bunban = (i < 3) ? 1 : 2;
				int row = i % 3 + 1;
				String position = (j == 0) ? "왼쪽" : "오른쪽";
				
				System.out.print("검색하신 "+name+" 학생은 "+bunban+"분단 "+row+" 번째 줄 "+position+"에 있습니다.");
				}
			}
		}
	}
}
