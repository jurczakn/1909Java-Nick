package com.revature.c;

import java.io.IOException;

import com.revature.p.Parent;

public class Child extends Parent {
	
	public int a;
	
	@Override
	public int getA() {
		System.out.println("Inside child");
		return this.a;
	}
	
	public Child() {
		
	}
	
	public Child(int a) {
		this.a = a;
	}
	
	@Override
	 public Exception doStuff() throws IOException{
		return null;
	}

}
