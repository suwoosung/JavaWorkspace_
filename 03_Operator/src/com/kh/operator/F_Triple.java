package com.kh.operator;

public class F_Triple {
	
	/*
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
        int c = (++a) + b; //  a=6 , b=10, c=16
        int d = c / a; // c=16, a=6, d=2
        int e = c % a; // c=16, a=6, e=4
        int f = e++; // e=4(5), f=4
        int g = (--b) +(d--); // b=9, d=2(1), g=11
        int h = 2; 
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // a=6(7), b=9, c=15, d=1, e=6, f=4, g=11(10)
        //h=2, i=6+ (9/3)*10%8=6+ 30%8=12
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

