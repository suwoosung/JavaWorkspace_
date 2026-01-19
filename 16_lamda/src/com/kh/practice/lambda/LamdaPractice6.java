package com.kh.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaPractice6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jin","Suga","RM","J-Hope","V");
		
		Comparator<String> comp = getComparator("length");
		names.sort(comp);
		System.out.println(names);
		
		comp = getComparator("reverse");
		names.sort(comp);
		System.out.println(names);
	}
	public static Comparator<String> getComparator(String mode){
		Comparator<String> comp = null;
		
		switch(mode) {
		case "length" ->
			comp = (s1 , s2) -> s1.length() - s2.length();
		case "reverse" ->
			comp = (s1 , s2) -> s2.compareTo(s1);
		default ->
			throw new RuntimeException("존재하지 않는 정렬기준입니다.");
		}
		return comp;
	}
}
