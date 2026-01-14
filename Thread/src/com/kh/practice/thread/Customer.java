package com.kh.practice.thread;

public class Customer implements Runnable{

	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			int value = data.getValue();
			System.out.println("get value : " + value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			try {
				Thread.sleep((long) 0.1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
