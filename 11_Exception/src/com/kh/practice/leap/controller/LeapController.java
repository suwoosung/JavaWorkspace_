package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	private boolean b = false;
	public boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0) {
			b = true;
		} else if(year%400==0) {
			b = true;
		}
		return b;	
	}
	
	public long leapDate(Calendar c) {
		Calendar dDay = new GregorianCalendar(1, 0, 1);
		
		long num1 = c.getTimeInMillis();
		long num2 = dDay.getTimeInMillis();
		long diff = (num1 - num2) / 1000 / 60 / 60 / 24;
		
		return diff;
	}
}
