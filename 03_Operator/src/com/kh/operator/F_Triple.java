package com.kh.operator;

public class F_Triple {
	
	/*
	 * ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	 * 삼항연산자
	 * -3개의 항목을 가지고 연산하는 연산자
	 * [표현법]
	 * 조건식 ? 조건이 true인 경우 결과값 : 조건이 false인 경우 결과값
	 */
	
	public void method1() {
		int num = 50;
		
		//num의 값이 양수인지 아닌지 판단.
		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다" : "음수입니다");
	}
	
	public void method2() {
		int num = 0;
		
		// num의 값이 양수, 음수, 0중 무엇인지 판단
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0입니다");
	}
	
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; // 6+9=15
        int d = c / a; // 15/6=2
        int e = c % a; // 15%6=3
        int f = e++; // 3(4)
        int g = (--b) +(d--); // 9+2(1)=11
        int h = 2; 
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); 
        System.out.println("a : "+a); // a: 7
        System.out.println("b : "+b); // b: 9
        System.out.println("c : "+c); // c: 15
        System.out.println("d : "+d); // d: 1
        System.out.println("e : "+e); // e: 6
        System.out.println("f : "+f); // f: 4
        System.out.println("g : "+g); // g: 10
        System.out.println("h : "+h); // h: 2
        System.out.println("i : "+i); // i: 12
    }
}

