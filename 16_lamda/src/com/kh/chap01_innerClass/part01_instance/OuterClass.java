package com.kh.chap01_innerClass.part01_instance;

public class OuterClass {

	private String str = "외부클래스필드";
	private static String staticStr = "외부클래스 정적필드";
	private InnerClass inner;
	
	/*
	 * 인스턴스 내부 클래스
	 *  - 필드(인스턴스 변수)와 동일한 위치에 선언하는 내부클래스는 인스턴스 내부 클래스라고 부른다.
	 *  - 일반적으로 외부클래스에서만 사용하는 고유한 객체를 선언할 때 사용.
	 *  - 외부클래스의 "보조적인역할"의 클래스를 정의한다.
	 *  - ex) HashMap내부의 Node, KeySet, EntrySet 등.
	 *  - 인스턴스 내부 클래스는 반드시 "외부 클래스"에 생성되어야 한다.
	 */
	
	public OuterClass() {
		inner = new InnerClass();
	}
	
	/*public*/private class InnerClass{
		private int num = 100;
		private static int sNum = 100;
		
		public void method() {
			System.out.println(num);
			System.out.println(str); // 외부클래스의 필드.
			System.out.println(staticStr);
			System.out.println(sNum);
		}
	}
	
	public void method() {
		inner.method();
	}
}
