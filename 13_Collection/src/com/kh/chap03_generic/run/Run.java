package com.kh.chap03_generic.run;

import java.util.ArrayList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		/*
		 * 1. 제네릭 등장 이전 프로그래밍 방식(jdk 5 이전)
		 *  - 컬렉션에 데이터를 추가시 할상 Object객체로 저장해야 했다.
		 *  - 저장된 데이터를 꺼내서 활용시에는 항상 "강제형변환"이 필요하낟.
		 *  - 단, 형변환시 잘못된 자료형으로의 형변환을 진행한다면 에러가 발생할 수 있다.
		 */
		List l = new ArrayList();
		for(Object o : l) {
			// o가 String이 아닌경우 ClassNotFoundException
			String s = (String) o;
		}
		/*
		 * 2. 제네릭 등장(JDK 1.5)
		 *  - 데이터의 자료형을 일반화 시켜서 여러 자료형을 다룰 수 있게 만든 문법
		 *  - 클래스의 메서드의 "변환형", "매개변수", 필드의 "자료형"들을 미리 확정
		 *  짓지 않고 파라미터화 하여 나중에 지정할 수 있게 만드는 문법
		 *  - 즉, 제네릭을 사용하면 다향한 자료형(타입)들을 저장할 수 있기 때문에
		 *  타입변수 라고도한다.
		 *  - 제네릭을 사용하면 런타임이 아닌 컴파일 시점에서 에러를 캐치할 수 있으므로
		 *  타입안정성을 확보할 수있다.
		 */
	}
}
