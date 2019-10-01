package com.revature.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 10001; i++) {
			System.out.println("Inside MyThread " + i);
		}
	}
	
	

}
