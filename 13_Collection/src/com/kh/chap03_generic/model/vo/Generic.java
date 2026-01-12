package com.kh.chap03_generic.model.vo;

// 현재 클래스에서 사용할 타입변수 지정
public class Generic < T , G >{
	/*
	 * 제네릭 설정방법
	 *  - 제네릭(타입변수)는 여러 참조자료형으로 댜채될 수있는 부분을 하나의 문자로 표현한다.
	 *  EX> <T>, <G>, ..
	 *  - 제네릭은 class 및 method, 각각 지정할 수 있다.
	 */
	T t;
	G g;
	
	public T getT() {
		return t;
	}
}
