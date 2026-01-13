package com.kh.practice1.model.vo;

import java.util.HashMap;

import com.kh.chap04_map.part01_hasMap.model.vo.Snack;

public class HashMap2 {

	private Entry[] table;
	private int capacity;
	private int size;
	
	class Entry {
		String key;
		Snack value;
		Entry next;
		
		public Entry(String key, Snack value, Entry next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public HashMap2(int capacity) {
		this.capacity = capacity;
		this.table = new Entry[capacity];
		this.size = 0;
	}
	
	public int getIndex(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }
	
	public void put(String key, Snack value) {
		int index = getIndex(key);
        Entry entry = table[index];

        if (entry == null) {
            // 해당 인덱스가 비어있으면 첫 노드로 추가
            table[index] = new Entry(key, value, null);
            size++;
        } else {
            // 이미 값이 있다면 연결 리스트를 탐색
            Entry curr = entry;
            while (true) {
                if (curr.key.equals(key)) {
                    curr.value = value; // 키가 같으면 값 덮어쓰기 (중복 처리)
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }
            // 같은 키가 없다면 리스트의 마지막에 새 노드 연결
            curr.next = new Entry(key, value, null);
            size++;
        }
	}
	
	public Snack get(String key) {
		int index = getIndex(key);
        Entry curr = table[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value; // 키 일치 시 값 반환
            }
            curr = curr.next;
        }
        return null; // 끝까지 없으면 null
	}
	
	public boolean containsKey(String key) {
		int index = getIndex(key);
	    Entry curr = table[index];

	    if (curr == null) {
	        return false;
	    }

	    while (curr != null) {
	        if (curr.key.equals(key)) {
	            return true; // 일치하는 키 발견
	        }
	        curr = curr.next; // 다음 노드로 이동
	    }

	    return false;
	}
	
	public void remove(String key) {
		int index = getIndex(key);
        Entry curr = table[index];
        Entry prev = null; // 이전 노드를 기억해야 연결을 이어줄 수 있음

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    table[index] = curr.next; // 첫 번째 노드 삭제 시
                } else {
                    prev.next = curr.next; // 중간/끝 노드 삭제 시 건너뛰기
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		HashMap2 hm = new HashMap2(10);
        
        hm.put("다이제", new Snack("초코맛", 1500));
        hm.put("새우깡", new Snack("짠맛", 500));
        
        System.out.println("새우깡: " + hm.get("새우깡"));
        System.out.println("크기: " + hm.size());
        
        hm.remove("새우깡");
        System.out.println("삭제 후 새우깡 존재 여부: " + hm.containsKey("새우깡"));
	}
}
