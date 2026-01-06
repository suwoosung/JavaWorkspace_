package com.kh.chap02_abstractNinterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	private String maker; // 제조사 정보
	
	public SmartPhone() {
		
	}
	
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
