package com.kh.chapter01.abstraction.run;

import com.kh.chapter01.abstraction.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 1. 객체지향언어 : 객체를 중심으로 객체간의 상호작용을 통해 동작하는 프로그래밍방식 언어
		 * 2. 객체(Object) : new연산자와 클래스를 통해 메모리(heap)에 할당된 데이터
		 * 3. 객체지향 프로그래밍 : 현실세계에서 독립적인 객체간의 상호작용을 프로그래밍을 통해
		 * 	  코드로 구현하는 과정
		 * 4. 구현하고자하는 프로그램상의 필요한 객체를 만들기 위해선 "클래스"라는 틀을 먼저
		 *    만들어야한다. => 클래스는 각 객체들의 속성들을 담아낼 수 있는 설계도의 역할을 하며,
		 *    추상화와 캡슐화를 거쳐 만들어진다.
		 * 5. 추상화 & 캡슐화를 하는 방법
		 * - 내가 구현하고자 하는 프로그램의 목적에 맞는 객체를 선정 후 그 객체들이 가지고 있을
		 * 핵심적인 역할의 속성과 기능만 남긴다.
		 */
		
		// 학생객체 생성
		Student han = new Student(); // null, 0, 0.0
		han.name = "한동희";
		han.age = 29;
		han.height = 180.0;
		
		// 여러분들 정보로 학생객체 초기화.
		Student seo = new Student();
		seo.name = "서우성";
		seo.age = 25;
		seo.height = 170.0;
		
		
	}
}
