package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();

	// 둘레
	public double clacPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return width * 2 + height;
	}

	// 넓이
	public double clacArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return width * height;
	}

	// 색깔지정
	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		return "사각형"+s.information();
	}

}
