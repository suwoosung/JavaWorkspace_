package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController le = new LeapController();
	
	public LeapView() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		boolean b = le.isLeapYear(year);
		String s;
		if(b==true) {
			s = "윤년";
		} else {
			s = "평년";
		}
		
		long num = le.leapDate(cal);
		
		System.out.println(year+"년은 "+s+"입니다.");
		System.out.println("총 날짜 수 : "+num);
	}

	
}
