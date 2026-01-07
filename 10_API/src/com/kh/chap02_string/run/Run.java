package com.kh.chap02_string.run;

import com.kh.chap02_string.model.vo.B_StringBuilderAndBuffer;
import com.kh.practice.chap02.string.controller.C_StringTokenizer;
import com.kh.practice.chap02.string.controller.D_StringMethod;
import com.kh.chap02_string.controller.A_StringPool;

public class Run {
	public static void main(String[] args) {
		A_StringPool asp = new A_StringPool();
		//asp.method3();
		
		B_StringBuilderAndBuffer bs = new B_StringBuilderAndBuffer();
		//bs.method();
		
		C_StringTokenizer cs = new C_StringTokenizer();
		//cs.method();
		
		D_StringMethod ds = new D_StringMethod();
		ds.method();
	}
}
