package com.kh.array;

import java.util.Arrays;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간. itn a = 10; a = 20; 배열 : 하나의 공간에 여러개의 값을
	 * 담을 수 있다.("같은 자료형"기준) ex) int[] a = new int[30000]; int자료형 값을 담을 수 있는 저장공간이 3칸
	 * 할당된다.(4byte * 3) [0, 0, 0] 배열에서 저장된 데이터를 커낼 때는 "인덱스"를 활용하여, 인덱스값은 0부터 시작.
	 * arr[0], arr[1], arr[2] 배열의 크기가 만약 5라면, 배열의 마지막 인덱스는 4 배열의 크기가 n이라면, 해당 배열의
	 * 마지막 인덱스는 항상 n-1
	 */

	public void method1() {
		/*
		 * 배열 선언 자료형 [] 배열명; 자료형 배열명 []
		 */
		int a;
		int[] arr;
		int arr2[];

		/*
		 * 배열 할당 - 이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정 - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을
		 * 가진 배열이 생성 [표현법] 배열명 = new 자료형[배열크기];
		 */

		arr = new int[5]; // 할당 완료.
		int[] arr3 = new int[5]; // [0,0,0,0,0]
		// System.out.println(a);
		System.out.println(arr3[0]);

		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3; // [1,2,3,0,0]

		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		System.out.println(arr3); // 참조형변수
	}

	public void method2() {
		int num = 10;

		int[] iArr = new int[5]; // [0,0,0,0,0]

		System.out.println("iArr :" + iArr); // 배열에 저장한 값이 아닌 주소값이 나옴
		System.out.println("iArr의 HashCode : " + iArr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 함수

		int[] iArr2 = new int[5]; // [0,0,0,0,0]
		System.out.println("iArr2의 ahshcode : " + iArr2.hashCode());

		int[] iArr3 = iArr2;
		System.out.println("iArr3의 ahshcode : " + iArr3.hashCode());

		System.out.println(iArr == iArr2); // false
		System.out.println(iArr == iArr3); // true
	}

	public void method3() {
		int[] iArr = new int[5];

		// 배열 값 초기화
		// iArr.length : 배열의 크기를 저장하는 변수
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i;
		}

		// [0, 1, 2, 3, 4]
		System.out.println(iArr[4]);
	}

	public void method4() {
		int result = 0;
		String str = null; // "";
		int[] arr = null;

		// null은 모든 참조자료형의 기본값이다
		// 단, 참조변수가 null을 저잦ㅇ한 상태에서, 주소값이 있어야 수행할 수 있는 행위
		// 를 코드로 작성하면 실행시 에러가 발생한다.

		// System.out.println(arr.length);
		// System.out.println(arr[0]);
	}

	public void method5() {
		int[] arr = new int[5];

		/*
		 * arr[0] = 2; arr[1] = 4; arr[2] = 6; arr[3] = 8; arr[4] = 10; 
		 * 1. 반복문을 활용하여 배열 초기화 하기
		 * 
		 * 2. 초기화 완료된 배열을 반복문을 활용하여 내부에 저장된 값을 출력 출력형식 : 10 8 6 4 2
		 */
		// 값 초기화
		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value+=2;
		}
		
		// 값 출력
		for(int i = arr.length-1; i>-1; i--) {
			System.out.print(arr[i]+" ");
		}
		
		// arr[5] = 12; 
		// 배열의 크기를 벗어난 인덱스 제시시 에러 발생.
		//배열은 한번 지정한 크기를 변경할 수 없다.
		// 배열의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야한다.
		
		arr = new int[6];
		arr[5] = 12;	// 기존 0~4번 인덱스의 값은 0으로 돌아간다.
	}
	
	public void method6() {
		// 배열의 선언, 할당, 초기화를 한번에 수행하는 방법.
		// 1.
		int [] arr1 = new int[] {1,2,3,4}; // [1,2,3,4]
		
		// 2.
		int [] arr2 = {1,2,3,4};
	}
	
	public void method7() {
		// 문자열을 문자배열로 만드는 방법
		String str = "merry";
		
		// 1. toCharArray()함수 사용
		char[] arr = str.toCharArray(); // ['m','e','r','r','y']
		
		// 2. for문으로 문자배열 생성하여 옮겨담기
		char[] arr2 = new char[str.length()];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = str.charAt(i);
		}
		
		int[] arr3 = new int[3];
		
		// Arrays.toString(배열) => 배열내부의 값들을 문자열로 변환하여 반환하는 메서드.
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
