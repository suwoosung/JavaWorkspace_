package com.kh.chapter05_constructor.run;

import com.kh.chapter05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// 기본생성자로 객체 생성
		User u1 = new User();
	
		User u2 = new User("user01");
		
		User u3 = new User("user03", 30, 'M');
		System.out.println(u3.getUserId());
		System.out.println(u3.getAge());
		System.out.println(u3.getGender());

	}

}
