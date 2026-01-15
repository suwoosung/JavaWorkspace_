package com.kh.practice.thread;

public class Data {

	private int value; // provider가 공급하고, customer가 소비/사용하는 데이터
	private boolean isEmpty = true;

	public Data() {

	}
	
	public int getValue() {
		synchronized (this) {
			if (isEmpty) {
				// 값이 없는데 값을 꺼내오려고하는 경우
				try {
					throw new EmptyException("현재 입력된 값이없습니다. 기다리십시오...");
				}catch(EmptyException e) {
					String errMessage = e.getMessage();
					System.out.println(errMessage);
					try {
						wait(); // 값이 찰때까지 대기..
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
			isEmpty = true;
			System.out.println("get value : " + value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			notify();
			return value;
		}
	}
	
	public void setValue(int value) {
		synchronized (this) {
			if (!isEmpty) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);
			notify();
		}
	}

}
