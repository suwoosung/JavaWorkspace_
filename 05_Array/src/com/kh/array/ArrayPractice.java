package com.kh.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];

		// 배열의 길이만큼 반복 진행
		// i => 0
		// i => 1
		// i => 2 ...
		// i => 9

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
		}
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {

		String[] arr = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice5() {

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("총합 : " + sum);
	}

	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();

		System.out.print("문자열에 있는 문자 : ");
		int count = 0;
		// 전체 문자 반복
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i]; // 중복인지 검사하고자 하는 문자.

			// 문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재 단어와 일치하는 값이 있는지 확인.
			boolean isDup = false;
			for (int j = 0; j < i; j++) {
				if (ch == arr[j]) {
					// 중복
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				System.out.print(ch + ", ");
				count++;
			}
		}
		System.out.println("\n문자 개수 : " + count);
	}

	public void practice7() {
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
	
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (ch == arr[i]) {	
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\ni 개수: "+count);
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		for(int i=8; i<str.length(); i++) {
			arr[i]='*';
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(arr[i]);;
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		

		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("\n최대값 : "+max);
		System.out.print("\n최소값 : "+min);
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			int random = arr[i];
			boolean isDup = false;
			for(int j=0; j<i; j++) {
				if (arr[j]==random) {
					isDup = true;
					break;
				}
			}
			if (isDup) {
				i--;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			int random = arr[i];
			System.out.print(random+" ");
		}
	}
	
	public void practice11() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if (num%2==0 && num<3) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = num;
		}
	}
}




