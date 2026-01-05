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

			System.out.println("학생은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + currentCount[0] + "명입니다.");
			System.out.println("사원은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + currentCount[1] + "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			System.out.println();

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
			System.out.println();
			
			if (currentCount[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				return;
			}

			switch (menu) {
			case 1:
				if (currentCount[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertStudent();
				}
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
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			System.out.println();

			if (currentCount[1] == 10) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				return;
			}
			
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
		while (true) {
			int[] currentCount = pc.PersonCount();

			if (currentCount[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				break;
			}

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
			
			// 추가 후 다시 개수 세어서 판단
			currentCount = pc.PersonCount();

			if (currentCount[0] < 3) {
				System.out.print("그만 하시려면N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.next().toUpperCase().charAt(0);

				if (ch == 'N') {
					break;
				}
			}
		}
	}

	public void printStudent() {
		Student[] result = pc.printStudent();
		System.out.println(result);
	}

	public void insertEmployee() {
		while (true) {
			int[] currentCount = pc.PersonCount();

			if (currentCount[1] == 10) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
				break;
			}

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

			currentCount = pc.PersonCount();
			
			if (currentCount[1] != 10) {
				System.out.print("그만 하시려면N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.next().toUpperCase().charAt(0);

				if (ch == 'N') {
					break;
				}
			} 
		}
	}

	public void printEmployee() {
		Employee[] result = pc.printEmplyee();
		System.out.println(result);
	}
}
