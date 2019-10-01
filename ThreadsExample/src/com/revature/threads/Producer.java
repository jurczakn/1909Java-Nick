package com.revature.threads;

import java.util.List;
import java.util.Queue;

public class Producer extends Thread {

	private Queue<Integer> 	q;
	
	@Override
	public void run() {
		
		int value = 0;
		
		for(;;) {
			System.out.println("Adding value " + value);
			q.add(value++);
		}
		
	}
	
	public void setList(Queue<Integer> q) {
		this.q = q;
	}

}
