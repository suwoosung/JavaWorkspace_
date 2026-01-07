package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibaryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	// 회원 레퍼런스(mem) 주소 값 리턴
	public Member myinfo() {
		return mem;
	}
	
	// 도서 목록 레퍼런스(bList) 주소 값 리턴
	public Book[] selectAll() {
		return bList;
	}
	
	// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
	public Book[] searchBook(String keyword) {
		Book[] arr = new Book[5];
		int count = 0;
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				// keyword가 포함된 도서
				arr[count++] = bList[i];
			}
		}
		return arr;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book b = bList[index];
		if(b instanceof AniBook && mem.getAge()<((AniBook)b).getAccessAge()) {
			result = 1;
		} else if(b instanceof CookBook && ((CookBook)b).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		return result;
	}
}
