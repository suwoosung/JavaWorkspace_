package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator{

	@ Override
	public int compare(Object o1, Object o2) {
		Music m1 = (Music) o1;
		Music m2 = (Music) o2;
		
		int result = m1.getTitle().compareTo(m2.getTitle());
		
		if(result == 0) {
			result = m1.getTitle().compareTo(m2.getTitle());
		}
		
		return result;
	}
}
