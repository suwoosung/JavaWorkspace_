package com.kh.array;

import java.util.Arrays;
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
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n총합 : " + sum);
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
		char[] arr = str.toCharArray(); // 문자열을 문자배열로 변환하는 메서드

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
		System.out.println("\ni 개수: " + count);
	}

	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] arr = str.toCharArray(); // 원본배열
		char [] copy = Arrays.copyOf(arr,  arr.length); // 복사본
		
		for (int i = 8; i < str.length(); i++) {
			copy[i] = '*';
		}

		for (int i = 0; i < str.length(); i++) {
			System.out.print(copy[i]);
		}
	}

	public void practice9() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		// 최대값, 최소값
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("\n최대값 : " + max);
		System.out.print("\n최소값 : " + min);
	}

	public void practice10() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			boolean isDup = false;
			for (int j = 0; j < i; j++) {
				// 중복검사
				if (arr[j] == arr[i]) {
					isDup = true;
					break;
				}
			}
			if (isDup) {
				i--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice11() {

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}

		int[] arr = new int[num];
		int mid = num / 2;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			// mid까지는 오름차순
			if (i <= mid) {
				System.out.print(++count + " ");
			// mid이후는 내림차순
			} else {
				System.out.print(--count + " ");
			}
		}
	}

	public void practice12() {

		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size]; // [자바의 정석, 알고리즘, c프로그래밍]
		
		sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine(); // 띄어쓰기 포함.
		}

		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'Y' || ch == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addsize = sc.nextInt();
				// [자바의 정석, 알고리즘, c프로그래밍]
				// [자바의 정석, 알고리즘, c프로그래밍, ㅇㅇ, 11]
				// [자바의 정석, 알고리즘, c프로그래밍, ㅇㅇ, 12, 영단어 600]
				
				String[] copy = Arrays.copyOf(arr, arr.length+addsize); // 깊은복사
				
				sc.nextLine();
				
				for (int i = arr.length; i < copy.length; i++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					copy[i] = sc.nextLine(); // 띄어쓰기 포함.
				}

//				String[] newarr = new String[arr.length + addsize];
//				
//				System.arraycopy(arr, 0, newarr, 0, arr.length);
//
//				for (int i = arr.length; i < newarr.length; i++) {
//					System.out.print((i + 1) + "번째 문자열 : ");
//					newarr[i] = sc.nextLine();
//				}
//				
//				arr = newarr;
				
				arr = copy; // 얕은복사
			} else if (ch == 'N' || ch == 'n') {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
