package com.kh.array;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간.
	 * 		 itn a = 10;
	 * 		 a = 20;
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다.("같은 자료형"기준)
	 * 		ex) int[] a = new int[30000];
	 * 		int자료형 값을 담을 수 있는 저장공간이 3칸 할당된다.(4byte * 3)
	 * 		[0, 0, 0]
	 * 		배열에서 저장된 데이터를 커낼 때는 "인덱스"를 활용하여, 인덱스값은 0부터 시작.
	 * 		arr[0], arr[1], arr[2]
	 * 		배열의 크기가 만약 5라면, 배열의 마지막 인덱스는 4
	 * 		배열의 크기가 n이라면, 해당 배열의 마지막 인덱스는 항상 n-1
	 */
	
	public void method1() {
		/*
		 * 배열 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 []
		 */
		int a;
		int [] arr;
		int arr2 [];
		
		/*
		 * 배열 할당
		 * - 이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 * - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 */
		
		arr = new int[5]; // 할당 완료.
		int [] arr3 = new int[5]; // [0,0,0,0,0]
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
		
		int [] iArr = new int[5]; // [0,0,0,0,0]
		
		System.out.println("iArr :"+ iArr); // 배열에 저장한 값이 아닌 주소값이 나옴
		System.out.println("iArr의 HashCode : "+ iArr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 함수
		
		int [] iArr2 = new int[5]; // [0,0,0,0,0]
		System.out.println("iArr2의 ahshcode : "+ iArr2.hashCode());
		
		int [] iArr3 = iArr2;
		System.out.println("iArr3의 ahshcode : "+ iArr3.hashCode());
	}
}
