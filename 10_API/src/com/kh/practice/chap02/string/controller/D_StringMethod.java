package com.kh.practice.chap02.string.controller;

public class D_StringMethod {

	public void method() {
		String str1 = "Hello World";
		
		// 1. 문자열.charAt(int index) : char
		// 'W'문자를 뽑기위해선?
		char ch = str1.charAt(6);
		System.out.println("CH : "+ch);
		
		// 2. 문자열의 길이를 반환하는 메서드
		//	  문자열.length() : int
		System.out.println("str1의 길이 : "+str1.length());
		
		// 3. 문자열.concat(String str) : String
		// 	  - 문자열과 전달된 또다른 문자열을 하나로 합쳐주는 메서드
		String a = str1 + "!!!";
		String str2 = str1.concat("!!!");
		System.out.println("str2 : "+str2);
		
		// 4. 문자열.substring(int beginIndex) : string
		//    - 문자열의 시작인덱스위치부터 끝까지의 문자열을 추출하여 리턴
		// 	  문자열.substring(int beginIndex, int endIndex) : String
		//    - 문자열의 시작인덱스부터 종료 인덱스까지의 문자열을 추출라여 리턴
		// "World"
		System.out.println(str1.substring(6)); // 6번인덱스부터 끝까지
		// "Hello"
		System.out.println(str1.substring(0,5)); // 0번인덱스부터 5번까지(4번인덱스)
		
		// 5. 문자열.replace(char old, char new) : String
		//    -> 문자열에서 old문자르 new문자로 변환한 문자열을 반환
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : "+str3);
		
		// 6. 문자열.trim() : String
		// -> 문자열의 앞, 뒤 공백을 제거한 문자열 리턴
		String str4 = "    J A V A    ";
		System.out.println("trim() : "+str4.trim());
		
		// 7. 문자열.toUpperCase() : 대문자로 변경
		//    문자열.toLowerCase() : 소문자로 변경
		System.out.println(str1.toUpperCase());
		
		// 8. 문자열.toCharArray() : char[]
		char [] arr = str1.toCharArray();
		System.out.println(arr);
		
		// 9. static valueOf(다양한자료형) : String
		//   - 전달된 자료형의 값을 "문자열"로 반환해주는 메서드
		//   - 1 -> "1"
		String str = "" + 1;
		System.out.println(String.valueOf(arr));
	}
}
