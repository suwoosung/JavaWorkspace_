package com.kh.practice.thread;

public class MultiThreadTest {

	public static void main(String[] args) {
		 
		Data data = new Data(); // 공유데이터
		
		Thread putThread = new Provider(data);
		Thread getThread = new Customer(data);
		
		// 쓰레드 구동
		putThread.start();
		getThread.start();
	}
}
