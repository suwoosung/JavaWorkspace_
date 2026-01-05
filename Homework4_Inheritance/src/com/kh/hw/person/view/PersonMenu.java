package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			int[] currentCount = pc.PersonCount();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		while (true) {
			int[] currentCount = pc.PersonCount();
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (currentCount[0] == 3) {
					System.out.println("추가 메뉴는 더이상 활성화되지 않습니다.");
					return;
				} else {
					insertStudent();
				}
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			int[] currentCount = pc.PersonCount();
			
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if (currentCount[1] == 10) {
				System.out.println("추가 메뉴는 더이상 활성화되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (currentCount[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertEmployee();
				}
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		int[] currentCount = pc.PersonCount();
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		System.out.print("학생 키 : ");
		double height = sc.nextDouble();
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		System.out.print("학생 전공 : ");
		String major = sc.next();

		pc.insertStudent(name, age, height, weight, grade, major);
		while (true) {
			if (currentCount[2] != 3) {
				System.out.println("이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.next().toUpperCase().charAt(0);

				if (ch == 'N') {
					return;
				}
			} else {
				System.out.println("학생 메뉴로 돌아갑니다.");
				//studentMenu();
				break;
			}
		}
	}

	public void printStudent() {
		Student[] result = pc.printStudent();
		System.out.println(result);
	}

	public void insertEmployee() {
		int[] currentCount = pc.PersonCount();
		System.out.print("사원 이름 : ");
		String name = sc.next();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		System.out.print("사원 부서 : ");
		String dept = sc.next();

		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		while (true) {
			if (currentCount[1] != 10) {
				System.out.println("이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.next().toUpperCase().charAt(0);

				if (ch == 'N') {
					return;
				}
			} else {
				System.out.println("사원 메뉴로 돌아갑니다.");
				//employeeMenu();
				break;
			}
		}
	}

	public void printEmployee() {
		Employee[] result = pc.printEmplyee();
		System.out.println(result);
	}
}
