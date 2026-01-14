package com.kh.practice.thread;

public class Data {

	private int value;
	private boolean isEmpty = true;

	public Data() {

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
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : " + value);
			isEmpty = false;
			notify();
		}
	}

	public int getValue() {
		synchronized (this) {
			if (isEmpty) {
				// 값이 없는데 값을 꺼내오려고하는 경우
				try {
					throw new EmptyException("현재 입력된 값이없습니다. 기다리십시오...");
				}catch(EmptyException e) {
					try {
						wait();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			}
			isEmpty = true;
			notify();
			return value;
		}
	}
}
