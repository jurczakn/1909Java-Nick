package com.revature.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10001; i++) {
			System.out.println("Inside MyRunnable " + i);
		}
	}

}
