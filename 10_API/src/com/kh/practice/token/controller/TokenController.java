package com.kh.practice.token.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		// 방법1.
		String result1 = str.replace(" ","");
		// System.out.println(result1);
		
		// 방법2. split(" ")을 활용하여 " "기준 문자를 분리하고, 분리된 문자를 다시 하나로 합친다.
		String[] arr = str.split(" ");
		String result2 = "";
		for(String s : arr) {
			result2 += s;
		}
		
		// 방법3. StringTokenizer이용
		StringTokenizer st = new StringTokenizer(str, " ");
		String result3 = "";
		while(st.hasMoreTokens()) {
			result3 += st.nextToken();
		}
		
		return result1;
	}
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// 방법1. substring으로 문자를 하나 빼고, 대문자로 변경후 합쳐서 반환
		String first = input
				.substring(0,1)
				.toUpperCase()
				.concat(input.substring(1));
		String other = input.substring(1);
		return first;
	}
	
	public int findChar(String input, char one) {
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		char[] arr = input.toCharArray();
		int count = 0;
		for(char ch : arr) {
			if(ch == one) {
				count++;
			}
		}
		return count;
	}
}
