package com.kh.practice.student.model.vo;

public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	Student[] stu = new Student[5];
	

	public Student() {
		
	}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String inform() {
		return "이름 : "+name+" / 과목 : "+subject+" / 점수 : "+score;
	}
	// 정보 가져옴
	public String getName() {
		return name;
	}
	// 정보 저장
	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
