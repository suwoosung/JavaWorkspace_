package com.kh.hw.member.controller;

import com.kh.hw.member.movel.vo.Member;

public class MemberController {

	public int SIZE = 10;
	private Member[] m = new Member[SIZE];

	// 현재 존재하는 멤버 수 반환
	public int existMemberNum() {
		int count = 0;
		for (Member i : m) {
			if (i != null) {
				count++;
			}
		}
		return count;
	}

	// 아이디 중복확인 하는 메소드
	public Boolean checkId(String inputId) {
		boolean isDup = false;
		for (Member i : m) {
			if (i!=null && i.getId().equals(inputId)) {
				isDup = true;
				break;
			}
		}
		return isDup;
	}

	// Member객체를 객체배열에 저장하는 메소드
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// 입력받은 데이터를 바탕으로 Member객체 생성.
		Member member = new Member(id, name, password, email, gender, age);
		// 생성된 객체를 배열의 0번 인덱스부터 저장
		for(int i=0; i<m.length; i++) {
			if(m[i]==null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}

	// id로 회원을 조회하는 메소드
	public String searchId(String id) {
		// 매개변수 id는 사용자 입력한 id값.
		// 매개변수 id와 member객체배열 m안에 들어있는 id값을 비교하여 , 일치하는 id가 있으면
		// 회원의 정보(information함수 호출)를 반환
		for (Member i : m) {
			if (i != null && i.getId().equals(id))
				return i.inform();
		}
		return null;
	}

	// 이름으로 회원을 조회하는 메소드
	public Member[] searchName(String name) {
		Member[] arr = new Member[10];
		int count = 0;

		for (Member i : m) {
			if (i != null && i.getName().equals(name)) {
				arr[count++] = i;
			}
		}

		if (count == 0) {
			return null;
		}
		return arr;
	}

	// 이메일로 회원을 조회하는 메소드
	public Member[] searchEmail(String email) {
		Member[] arr = new Member[10];
		int count = 0;

		for (Member i : m) {
			if (i != null && i.getEmail().equals(email)) {
				arr[count++] = i;
			}
		}
		return arr;
	}

	// 비밀번호 변경 메소드
	public Boolean updatePassword(String id, String password) {
		for (Member i : m) {
			if (i != null && i.getId().equals(id)) {
				i.setPassword(password);
				return true;
			}
		}
		return false;
	}

	// 이름 변경 메소드
	public Boolean updateName(String id, String name) {
		for (Member i : m) {
			if (i != null && i.getId().equals(id)) {
				i.setName(name);
				return true;
			}
		}
		return false;
	}

	// 이메일 변경 메소드
	public Boolean updateEmail(String id, String email) {
		for (Member i : m) {
			if (i != null && i.getId().equals(id)) {
				i.setEmail(email);
				return true;
			}
		}
		return false;
	}

	// 한 회원만 삭제하는 메소드
	public Boolean delete(String id) {
		for (int i=0; i<m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	// 전체 회원을 삭제하는 메소드
	public void delete() {
		for(int i=0; i<m.length; i++) {
			m[i] = null;
		}
	}

	// Member객체 반환 메소드
	public Member[] printAll() {
		return m;
	}
}
