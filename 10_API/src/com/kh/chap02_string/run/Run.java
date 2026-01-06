package com.kh.chap02_string.run;

import com.kh.chap02_string.model.vo.B_StringBuilderAndBuffer;
import com.kh.chap02_string.controller.A_StringPool;

public class Run {
	public static void main(String[] args) {
		A_StringPool asp = new A_StringPool();
		//asp.method3();
		
		B_StringBuilderAndBuffer bs = new B_StringBuilderAndBuffer();
		bs.method();
	}
}
