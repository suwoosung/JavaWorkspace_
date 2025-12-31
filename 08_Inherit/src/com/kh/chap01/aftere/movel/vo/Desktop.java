package com.kh.chap01.aftere.movel.vo;

public class Desktop extends Product {

	private boolean allInOne;

	public Desktop() {

	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		// 상속 메모리 구조 보여주기
		// 부모객체 필즈의 값 초기화 하기
		// 방법 1. 자식클래스에서 부모클래스의 필드에 접근 가능하도록 접근제한자를 수정.
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		this.allInone = allInone;

		// 방법 2. 부모클래스에 있는 setter 메서드 사용
//		super.setBrand(brand);
//		setpCode(pCode);
//		setpName(pName);
//		setPrice(price);

		// 방법 3. 부모생성자 호출하기.
		// super : 부모의 주소값이 담긴 변수
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	// 객체의 정보를 문자열로 반환하는 메서드.
	// 오버라이딩 : 부모클래스와 자식클래스의 메서드명이 동일한 케이스.
	public String information() {
//		return getBrand()+", "+getpCode()+", "+getpName()
//		+", "+getPrice()+", "+isAllInOne();
		return super.information() + ", " + allInOne;
	}
}
