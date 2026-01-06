package com.kh.chap01_math.run;

// import java.lang.Math;
// java.lang패캐지는 보이진않지만 항상 import가 되어 있다.
public class MathRun {

	public static void main(String[] args) {
		// Math클래스의 유용한 메서드들
		// 파이 (PI)
		System.out.println("파이 : " + Math.PI);

		// 올림처리 메서드
		// 올림 => Math.ceil(double) : double
		double num1 = 4.349; // 4.4로 올림처리하려면?
		System.out.println("올림 : " + Math.ceil((num1 * 10) / 10));

		// 반올림 => Math.round(double) : long
		System.out.println("반올림 : " + Math.round((num1 * 100) / 100.0));

		// 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));

		// 절대값 => 음수도 양수, 양수는 양수로 만드는 메서드
		// Math.abs(int/double/long/float) : int/double/long/float
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));

		// 최소값
		// Math.min(int, int) : int
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// Math.max(int, int)
		System.out.println("최대값 : "+Math.max(5, 10));
		
		// 제곱근(루트)
		// Math.sqrt(double) : double
		System.out.println("4의 제곱근 : "+ Math.sqrt(4.0));
		
		// 제곱
		// Math.pow(double, double) : double
		System.out.println("2의 10제곱 : "+Math.pow(2, 10));
	}
}
