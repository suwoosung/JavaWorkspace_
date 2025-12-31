package com.kh.hw.member.controller;

import com.kh.hw.member.movel.vo.Member;

public class MemberController {

	public int SIZE = 10;
	private Member[] m = new Member[SIZE];
	private int index = 0;

	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		return existMemberNum();

	}

	// 아이디 중복확인 하는 메소드
	public Boolean checkId(String inputId) {
		boolean isDup = false;
		for (Member i : m) {
			if(i.getId().equals(inputId)) {
				isDup = true;
				break;
			}
		}
		return isDup;
	}

	// Member객체를 객체배열에 저장하는 메소드
	// 
	public void insertMember(String id, String name,String password,
			 String email, char gender, int age) {
		//입력받은 데이터를 바탕으로 Member객체 생성.
		Member member = new Member(id, name, password, email, gender, age);
		
		// 생성된 객체를 배열의 0번 인덱스부터 저장
		// 값을 저장할 때 마다 index값을 증가.
		m[index++] = member;
	}

	public String searchId(String id) {
		// id로 회원을 조회하는 메소드
		// 매개변수 id는 사용자 입력한 id값.
		// 매개변수 id와 member객체배열 m안에 들어있는 id값을 비교하여 , 일치하는 id가 있으면
		// 회원의 정보(information함수 호출)를 반환
		
		return 
	}

	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {

	}

	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {

	}

	// 비밀번호 변경 메소드
	public Boolean updatePassword(String id, String password) {

	}

	// 이름 변경 메소드
	public Boolean updateName(String id, String name) {

	}

	// 이메일 변경 메소드
	public Boolean updateEmail(String id, String email) {

	}

	// 한 회원만 삭제하는 메소드
	public Boolean delete(String id) {

	}

	// 전체 회원을 삭제하는 메소드
	public void delete() {

	}

	// Member객체 반환 메소드
	public Member[] printall() {

	}
}
