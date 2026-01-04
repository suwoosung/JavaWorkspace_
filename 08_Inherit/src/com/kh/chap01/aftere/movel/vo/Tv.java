package com.kh.chap01.aftere.movel.vo;

public class Tv extends Product {

	private int inch;

	private Tv() {

	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String information() {
		return super.information() + ", " + inch;
	}

}
