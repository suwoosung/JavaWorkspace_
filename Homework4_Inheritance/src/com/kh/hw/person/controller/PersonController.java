package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];

	// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
	public int[] PersonCount() {
		int[] arr = new int[2];

		int count = 0;
		for (Student std : s) {
			if (std != null) {
				count++;
			}
		}
		arr[0] = count;

		count = 0;
		for (Employee emp : e) {
			if (emp != null) {
				count++;
			}
		}
		arr[1] = count;

		return arr;
	}

	// 매개변수로 받아온 데이터를 학생 객체배열 중 빈 곳에 저장하는 메소드
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				s[i] = std;
				break;
			}
		}
	}

	// 학생 객체 배열의 주소를 반환하는 메소드
	public Student[] printStudent() {
		return s;
	}

	// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				e[i] = emp;
			}
		}
	}

	// 사원 객체 배열의 주소를 반환하는 메소드
	public Employee[] printEmplyee() {
		return e;
	}
}
