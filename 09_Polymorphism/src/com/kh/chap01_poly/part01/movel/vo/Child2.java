package com.kh.chap01_poly.part01.movel.vo;

public class Child2 extends Parent{
	
	public Child2() {
		
	}
	
	public Child2(int x, int y) {
		super(x, y);
	}
	
	public void printChild2() {
		System.out.println("Child2 메서드");
	}
	
	public void print() {
		System.out.println("오버라이딩 자식메서드2");
	}

}
