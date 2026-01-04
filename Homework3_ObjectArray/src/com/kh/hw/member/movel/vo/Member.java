package com.kh.hw.member.movel.vo;

public class Member {
	
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	public Member() {
		
	}
	
	public Member(String id, String name, String password,
			String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	// 필드의 값을 리턴하는 메소드
	public String getId() {
		return id;
	}

	// 필드의 값을 초기화/변경하는 메소드
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Member 클래스의 모든 필드값들을 합쳐 반환
	public String inform() {
		return id+", "+name+", "+password+","+
			email+", "+gender+", "+age;	
	}
}
