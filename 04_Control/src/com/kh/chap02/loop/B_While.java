package com.kh.chap02.loop;

public class B_While {
	/*
	 * while문 [표현법]
	 * 
	 * [초기식] // 필수아님 while(조건식){ // 반복적으로 수행할 코드 [증감식] // 필수아님 }
	 */

	public void method1() {
		// for문을 while문으로 변경

		int i = 0;
		while (i < 5) {
			System.out.println("안녕");
			i++;
		}
		System.out.println(i); // 5
	}

	public void method2() {
		// while문으로 5회 반복하여 아래 코드 출력
		// 1 2 3 4 5

		int i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void method3() {
		// 1부터 랜덤값(1~10)까지의 총 합계를 while문으로 작성
		// 출력예시 : 1부터 xxx까지의 합계는 xxx 입니다.

		int random = (int) (Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;

		while (i <= random) {
			sum += i++;
		}
		System.out.println("1부터 " + random + "값까지의 합은 : " + sum + "입니다.");
	}

	/*
	 * do-while [표현법] do { // 반복 실행할 코드(단, 최초1회는 반드시 수행) } while(조건식); - do-while문은
	 * 별도의 조건검사 없이 최초 1회는 무조건 실행된다.
	 */
	public void method4() {
		do {
			System.out.println("하이!");
		} while (false);
	}

	public void method5() {
		// do-while문을 활용하여
		// 1 2 3 4 5 출력
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
	}
}
