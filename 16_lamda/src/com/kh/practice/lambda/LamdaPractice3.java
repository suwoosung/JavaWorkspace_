package com.kh.practice.lambda;

public class LamdaPractice3 {

	public static void main(String[] args) {
		
		MyFunction<String, String> first = v -> v.toUpperCase(); // String::toUpperCase
		System.out.println(first.apply("lambda"));
		
		MyFunction<String, Boolean> second = v -> v.length() >= 5;
		System.out.println(second.apply("lambda"));
		
		
		MyFunction<String, String> third = v -> {
			String[] arr = v.split("");
			StringBuilder sb = new StringBuilder();
			for(String s : arr) {
				sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);
			
			return sb.toString();
		};
		System.out.println(third.apply("lambda"));
	}
	
	@FunctionalInterface
	interface MyFunction<V,B>{
		B apply(V v);
	}
}
