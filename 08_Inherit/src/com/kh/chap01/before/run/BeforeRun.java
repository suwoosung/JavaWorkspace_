package com.kh.chap01.before.run;

import com.kh.chap01.before.movel.vo.Desktop;
import com.kh.chap01.before.movel.vo.SmartPhone;

public class BeforeRun {
	public static void main(String[] args) {
		// 데스크탑 객체
		Desktop d = new Desktop("삼성","d-01","데탑",2000000,true);
		SmartPhone sp = new SmartPhone("애플","s-01","아이폰11",1300000,"kt");
		
		System.out.println(d.information());
		System.out.println(sp);	
			
		/*
		 * 매 클래스 마다 중복된 코드들을 일일히 기술하게 되면
		 * 수정과 유지보수에서 번거로움이 발생함
		 * 
		 * 상속이라는 개념을 적용시켜서,
		 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의해두고, 이 클래스를
		 * 상속시켜주는 방식으로 작업한다.
		 */
	}
}
