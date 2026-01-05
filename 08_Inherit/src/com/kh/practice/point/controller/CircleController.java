package com.kh.practice.point.controller;

import com.kh.practice.point.movel.vo.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius); // 필드 초기화
		return "면적 : " + c.toString() + " / " + radius + " / " + (Math.PI * (c.getRadius() * c.getRadius()));
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "둘레 : " + c.toString() + " / " + (Math.PI * c.getRadius() * 2);
	}
}
