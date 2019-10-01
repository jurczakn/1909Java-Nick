package com.revature.driver;

import com.revature.threads.MyRunnable;
import com.revature.threads.MyThread;

public class Driver {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		MyRunnable r = new MyRunnable();
		
		Thread t2 = new Thread(r);
		
		t2.setPriority(9);
		
		t2.start();
		t.start();
		
	}

}
