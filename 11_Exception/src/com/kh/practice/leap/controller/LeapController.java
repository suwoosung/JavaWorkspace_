package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public long leapDate(Calendar c) {
		long total = 0;
		for (int i = 1; i < c.get(Calendar.YEAR); i++) {
			// 1년 ~ 2025년까지
			if (isLeapYear(i)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		// 2026년 1월 1일 ~ 현재까지 지난 일 수
		int month = c.get(Calendar.MONTH);
		for (int i = 0; i < month; i++) {
			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:
				total += 31;
				break;
			case 4, 6, 9, 11:
				total += 30;
				break;
			case 2:
				total += isLeapYear(c.get(Calendar.YEAR)) ? 29 : 28;
				break;
			}
		}
		int date = c.get(Calendar.DATE);
		total += date;

		return total;
	}

}
