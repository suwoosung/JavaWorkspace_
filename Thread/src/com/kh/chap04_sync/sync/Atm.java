package com.kh.chap04_sync.sync;

import java.util.Random;

public class Atm implements Runnable {

	private Account acc;

	public Atm(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// 잔액이 0원보다 크면 무한반복
		while (acc.getBalance() > 0) {
			int money = (new Random().nextInt(3) + 1) * 300; // 300 600 900
			acc.withdraw(money);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"종료");
	}
}
