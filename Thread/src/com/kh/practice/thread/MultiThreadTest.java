package com.kh.practice.thread;

public class MultiThreadTest {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		Thread provider = new Thread(new Provider(data));
		Thread customer = new Thread(new Customer(data));
		
		provider.start();
		customer.start();
	}
}
