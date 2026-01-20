package com.kh.chap02_enum._enum.run;

import com.kh.chap02_enum.model._enum.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf("BLACK"));
		System.out.println(CarColor.valueOf(1));
		//System.out.println(CarColor.valueOf(10));
		CarColor.RED.printTest();
	}
}
