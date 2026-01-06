package com.kh.chap02_abstractNinterface.controller;

import com.kh.chap02_abstractNinterface.model.vo.GalaxyNote9;
import com.kh.chap02_abstractNinterface.model.vo.Phone;
import com.kh.chap02_abstractNinterface.model.vo.SmartPhone;
import com.kh.chap02_abstractNinterface.model.vo.V40;

public class PhoneController {
	String[] result = new String[2];
	
	public String[] method() {
		Phone[] arr = new Phone[2];
		
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();  
		
		for(int i=0; i<arr.length; i++) {
			// 1안 downcasting
			result[i] = ((SmartPhone)arr[i]).printInformation();
			
			// 2안 instanceof
			if(arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)arr[i]).printInformation();
			} else if (arr[i] instanceof V40) {
				result[i] = ((V40)arr[i]).printInformation();
			}
		}
		return result;
	}
}
