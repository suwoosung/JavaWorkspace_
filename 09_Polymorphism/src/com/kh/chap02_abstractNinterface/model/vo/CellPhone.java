package com.kh.chap02_abstractNinterface.model.vo;

public interface CellPhone extends Phone, Camera{
	
	String charge(); // 충전 방식
}
