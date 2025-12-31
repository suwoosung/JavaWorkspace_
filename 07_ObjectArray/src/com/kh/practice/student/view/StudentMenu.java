package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========= 학생 정보 출력 =========");
		// studentController에 printStudent()의 반환 값을 통해 학생 정보
		Student[] arr = ssm.printStudent(); // 학생 객체 배열
		
		for (Student s : arr) {
			System.out.println(s.inform());
		}
		
		System.out.println("========= 학생 성적 출력 =========");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+(int)dArr[0]);
		System.out.println("학생 점수 평균 : "+dArr[1]);
		System.out.println();

		System.out.println("========= 성적 결과 출력 =========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for(Student s : arr) {
			System.out.println(s.getName()+"은 "+
					(s.getScore() < StudentController.CUT_LINE ?
							"재시험 대상입니다." : "통과입니다"));
		}
	}
}
