package com.kh.practice.lambda;

import com.kh.practice.lambda.LamdaPracatice1.StringChecker;

public class LamdaPractice2 {

	public static void main(String[] args) {
		
		Calculator<Integer> adder = (v1, v2) -> v1*v2;
		System.out.println(adder.operate(10, 20));
		
		Calculator<Integer> findMax = (v1, v2) -> Math.max(v1,v2); // Math:max
		System.out.println(findMax.operate(10, 20));
		
		Calculator<String> combiner = (v1, v2) -> v1+"-"+v2; 
		System.out.println(combiner.operate("hello","world"));
		
	}

	@FunctionalInterface
	interface Calculator<V> {

		V operate(V v1, V v2);
	}
}
