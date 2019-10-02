package com.revature.driver;

import java.util.ArrayDeque;
import java.util.Queue;

import com.revature.threads.Consumer;
import com.revature.threads.Producer;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		
		Producer p = new Producer();
		
		p.setList(q);
		
		Consumer c = new Consumer(); 
		
		c.setQueue(q);
		
		p.start();
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.start();
		
	}

}
