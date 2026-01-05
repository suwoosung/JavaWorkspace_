package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];

	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] PersonCount() {
		int sCount = 0;
		int eCount = 0;
		
		for(Student i : s) {
			if(i != null) {
				sCount++;
			}
		}
		
		for(Employee i : e) {
			if(i != null) {
				eCount++;
			}
		}
		return new int[] {sCount, eCount};
	}

	// 매개변수로 받아온 데이터를 학생 객체배열 중 빈 곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for (Student i : s) {
			i = new Student(name, age, height, weight, grade, major);
		}
	}

	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}

	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
		for (Employee i : e) {
			i = new Employee(name, age, height, weight, salary, dept);
		}
	}

	// 사원 객체 배열의 주소를 반환하는 메소드
	public Employee[] printEmplyee() {
		return e;
	}
}
