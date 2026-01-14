package com.kh.practice.thread;

import java.awt.desktop.ScreenSleepEvent;

public class Provider implements Runnable {

	private Data data;

	public Provider(Data data) {
		this.data = data;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 100 + 1);
			data.setValue(random);
			try {
				Thread.sleep((long) 0.1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
