package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static {
		grade = 1;
	}
	
	{
		classroom = 2;
		name = "서우성";
		height = 170.0;
		gender = '남';
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+"학년 "+classroom+"반 "+name+" "+height+"cm "+gender+"학생");
	}
}
