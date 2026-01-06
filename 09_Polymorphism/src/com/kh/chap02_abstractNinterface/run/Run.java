package com.kh.chap02_abstractNinterface.run;

import com.kh.chap02_abstractNinterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = pc.method();
		
		for(String srt : arr) {
			System.out.println(srt);
		}
	}
}
