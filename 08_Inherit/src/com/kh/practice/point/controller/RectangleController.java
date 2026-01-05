package com.kh.practice.point.controller;

import com.kh.practice.point.movel.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle(); // x y height = 0 weight = 0

	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "면적 : " + r + " / " + (r.getWidth() * r.getHeight());
	}

	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		return "둘레 : " + r + " / " + (2 * (r.getWidth() + r.getHeight()));
	}
}
