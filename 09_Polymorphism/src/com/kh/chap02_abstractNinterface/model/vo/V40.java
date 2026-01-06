package com.kh.chap02_abstractNinterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		String maker = new String();
		setMaker("LG");
	}
	
	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	
	@Override
	public String picture() {
		return "1200, 1600만 듀얼카메라";
	}
	
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	@Override
	public String touch() {
		return "정전식";
	}
	
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	
	@ Override
	public String printInformation() {
		String result = "v40는"+getMaker()+"에서 만들어졌도 제원은 다음과 같다.\n"
				+makeCall()+"\n"
				+takeCall()+"\n"
				+picture()+"\n"
				+charge()+"\n"
				+touch()+"\n"
				+bluetoothPen()+"\n";
			return result;	
	}
}
