package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

import com.kh.chap01_constant.model.vo.Color;

public enum CarColor {
	//public static final Color BLACK = new Color();
	/*
	 * Enum -> Enumeration(열거)/ 클래스 내부의 상수값 들을 열거하였기 떄문에 enum
	 *         이라는 명칭을 쓴다.
	 *         객체단위 상수값들을 간결하게 사용하기 위해 도안되었다.
	 */
	BLACK(0, "black"){
		@Override
		public void printTest() {
			System.out.println("검은색입니다.");
		}
	},
	
	WHITE(1, "white"){
		@Override
		public void printTest() {
			System.out.println("하얀색입니다.");
		}
	},
	
	RED(2, "red"){
		public void printTest() {
			System.out.println("빨간색입니다.");
		}
	};
	
	private int color;
	private String name;
	
	private CarColor(int color, String name) { // 현재의 생성자만사용하려고 public 사용 불가능
		this.color = color;
		this.name = name;
	}

	public int getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	// enum만의 기능
	//  - enum내부의 상수값들을 배열로 모아서 반환해주는 메서드
	//    values()
	public static CarColor valueOf(int color) {
		return Arrays
			.stream(values())
			.filter(_enum -> _enum.color == color)
			.findFirst()
			.orElseThrow(() -> new RuntimeException("일치하는 컬러가 없습니다."));
	}
	
	public abstract void printTest();
}
