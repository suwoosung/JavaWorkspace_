package com.kh.chap03_stream.practice;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
	static class Student {
		String name;
		int age;
		int score;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public Student(String name, int age, int score) {
			super();
			this.name = name;
			this.age = age;
			this.score = score;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
		}

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 6, 2, 3, 3, 4, 4, 11, 9, 10);
		List<String> strlist = Arrays.asList("a", "a", "b", "b", "c", "c", "d", "e", "f", "g");
		List<Student> slist = List.of(new Student("홍길동", 15, 100),
				new Student("강감찬", 16, 80),
				new Student("이순신", 25, 80), 
				new Student("김말똥", 29, 90), 
				new Student("아무개", 23, 70));
		String[] wordArr = { "a b c d", "홍 길동", "h el lo wor ld" };
		IntStream dan = IntStream.range(1, 10);

		// 1. list에서 중복을 제거한 후 짝수만 출력하는 프로그램을 만드시오.(스트림활용)
				list
				.stream()
				.distinct()
				.filter(num -> num%2==0)
				.forEach(num -> System.out.print(num+" "));
				System.out.println();
		// 결과 : 6 2 4 10
				
		// 2. list에서 중복을 제거한 후 값이 5 이상이면서 홀수를 오름차순 출력 하는 프로그램
				list
				.stream()
				.distinct()
				.filter(num -> num>=5 && num%2==1)
				.sorted(Integer::compareTo)
				.forEach(num -> System.out.print(num+" "));
			System.out.println();
		// 결과 : 9 11
				
		// 3. list에서 각 요소에 3을 곱한후 오름차순 출력하는 프로그램
				list
				.stream()
				.map(num -> num * 3) // 값을 변환할 때는 map 사용
				.sorted(Integer::compareTo)
				.forEach(n -> System.out.print(n + " "));
			System.out.println();
		// 3 6 9 9 12 12 18 27 30 33
				
		// 4. strlist에서 각 문자를 대문자로 변경한 후 List로 반환하는 프로그램
				List<String> upperList = strlist
				.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
			System.out.println(upperList);
		// [A, A, B, B, C, C, D, E, F, G]

		// 5. strlist에서 중복값을 제거후 각 문자를 하나의 문자열로 합쳐서 반환해주는 프로그램
			String str = strlist
					.stream()
				    .distinct()
				    //.collect(Collectors.joining());
				    .reduce("",(result, str1) -> result+str1);
			System.out.println(str);
		// abcdefg

		// 6. slist에서 학생의 이름과 나이를 학생이름기준 오름차순 정렬하여 출력.
			slist
			.stream()
		    .sorted((s1, s2) -> s1.name.compareTo(s2.name)) 
		    .forEach(s -> System.out.print(s.getName() + " : " + s.getAge() + " "));
			System.out.println();
		// 이름: 나이
		// 강감찬 : 16 김말똥 : 29 아무개 : 23 이순신 : 25 홍길동 : 15

		// 7. slist에서 20살 이상인 학생의 평균점수를 구하는 프로그램
			double score = slist.stream()
				    .filter(s -> s.age >= 20)
				    .mapToInt(s -> s.score) // 평균을 구하려면 수치형 스트림으로 변환 필요
				    .average() // 평균계산
				    .orElse(0);
			System.out.println(score);
		// 80.0
//	      System.out.println(score);

		// 8. wordArr내부요소의 공백을 모두 제거한후 List<String>으로 변환하는 프로그램
			List<String> cleanWords = Arrays.stream(wordArr)
				    .map(s -> s.replace(" ", "")) // 모든 공백 제거
				    .collect(Collectors.toList());
		// 출력결과 : [abcd, 홍길동, helloworld]

		// 9. dan을 활용하여 구구단 2단~9단까지 출력하는 프로그램을 만드시오
			IntStream.rangeClosed(2, 9).forEach(dan1 -> {
			    IntStream.rangeClosed(1, 9)
			        .forEach(i -> System.out.printf("%d * %d = %d\n", dan1, i, dan1 * i));
			});
		// ex) 2 * 1 = 2
		// 2 * 2 = 4

		// 10. wordArr내부요소의 공백을 제거한 문자열의 길이가 8이상인 요소가 있는지 검사하는 프로그램
			boolean hasLongWord = Arrays.stream(wordArr)
				    .map(s -> s.replace(" ", ""))
				    .anyMatch(s -> s.length() >= 8); // 하나라도 만족하면 true
		// 출력결과 : true/false값

	}

}
