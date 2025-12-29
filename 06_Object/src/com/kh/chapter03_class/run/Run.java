package com.kh.chapter03_class.run;

import com.kh.chapter03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		p.changeName("경민");
		p.printName();
	}

}
