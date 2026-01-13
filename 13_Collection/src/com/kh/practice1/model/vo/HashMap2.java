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

	public HashMap(int capacity) {
		this.capacity = capacity;
		
		HashMap hm = new HashMap(capacity);
		table = hm;
	}
	
	public void put(String key, Snack value) {
		int index = getIndex(key);
	}
	
	public Snack get(String key) {
		
	}
	
	public boolean containsKey(String key) {
		
	}
	
	public void remove(String key) {
		
	}
	
	public int size() {
		
	}
	
	public static void main(String[] args) {
		
	}
}
