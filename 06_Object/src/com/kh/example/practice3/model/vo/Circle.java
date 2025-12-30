package com.kh.example.practice3.model.vo;

public class Circle {
	private final static double PI = 3.14;
	private static int radius = 1;

	public Circle() {

	}

	public void incrementRadius() {
		radius += 1;
	}

	public void getAreaOfCircle() {
		// 원둘레
		System.out.println(radius * 2 * PI);
	}

	public void getSizeOfCircleS() {
		// 원 넓이
		System.out.println(radius * radius * PI);
	}
}
