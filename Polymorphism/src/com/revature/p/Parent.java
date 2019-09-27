package com.revature.p;

public class Parent {
	
	public int a;
	
	public int getA() {
		System.out.println("Inside parent");
		return this.a;
	}
	
	public Parent() {
		
	}
	
	public Parent(int a) {
		this.a = a;
	}
	
	protected Object doStuff() throws Exception {
		return null;
	}

}
