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
            table[index] = new Entry(key, value, null);
            size++;
        } else {
            Entry curr = entry;
            while (true) {
                if (curr.key.equals(key)) {
                    curr.value = value;
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }
            curr.next = new Entry(key, value, null);
            size++;
        }
	}
	
	public Snack get(String key) {
		int index = getIndex(key);
        Entry curr = table[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value; 
            }
            curr = curr.next;
        }
        return null; 
	}
	
	public boolean containsKey(String key) {
		int index = getIndex(key);
	    Entry curr = table[index];

	    if (curr == null) {
	        return false;
	    }

	    while (curr != null) {
	        if (curr.key.equals(key)) {
	            return true; 
	        }
	        curr = curr.next; 
	    }

	    return false;
	}
	
	public void remove(String key) {
		int index = getIndex(key);
        Entry curr = table[index];
        Entry prev = null; 

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    table[index] = curr.next; 
                } else {
                    prev.next = curr.next; 
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
        hm.put("칸쵸", new Snack("단맛", 600));
        hm.put("새우깡", new Snack("짠맛", 500));
        hm.put("포테토칩", new Snack("짠맛", 500));
        
        System.out.println("새우깡: " + hm.get("새우깡"));
        System.out.println("크기: " + hm.size());
        
        hm.remove("포테토칩");
        System.out.println(hm.containsKey("포테토칩"));
        System.out.println("크기: " + hm.size());
	}
}
