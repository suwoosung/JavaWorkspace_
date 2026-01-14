package com.kh.practice.map.controller;


import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.vo.Member;



public class MemberController {
	private HashMap<String,Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환있다면 false 값 반환
		
		// 1. put메서드를 활용한 방법
		//Member prev =  map.put(id, m);
		
		// 2. containsKey메서드를 활용한 방법
		boolean result = map.containsKey(id);
		if(result) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
		// 3. 반복문을 활용하여 key값을 체크
	}
	
	public String logIn(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와 
		// 사용자가 입력한 비밀번호가 같은지 비교. 
		String name = null;
		if(!map.containsKey(id)) {
			return null;
		}
		
		if(map.get(id).getPassword().equals(password)) {
			name = map.get(id).getName();
		}
		return name;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		// 전달 받은 name이 저장된 데이터의 이름과 같으면 
		// key로 오름차순 해주는 객체(TreeMap)에 해당 id와 이름 저장 후 객체 반환 
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것 
		Set<String> keys =  map.keySet();
		TreeMap<String, String> tree = new TreeMap<>();
		
		for(String key : keys) {
			String str = map.get(key).getName();
			if(str.equals(name)) {
				tree.put(key, str);// id와 name
			}
		}
		
		return tree;
	}
}
