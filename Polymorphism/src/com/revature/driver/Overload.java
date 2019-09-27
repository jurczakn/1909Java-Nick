package com.revature.driver;

import java.util.Arrays;

public class Overload {

	public static void main(String[] args) {
	
		Overload o = new Overload();
		
		o.add(4, 6);
		
		o.add(4,  6, 7);
		
		//o.add(50.0, 43.2);
		
		o.add(10L, 11L);
		
		o.add(5, 6, 7, 4, 8, 9);
		
		Integer i = new Integer(70);
		
		Integer j = new Integer(80);
		
		//Auto Unboxing - automatic process of converting a wrapper class to its primitive counterpart
		o.add(i, j);
		
		
		//Auto Boxing - automatic process of converting a primitive to its wrapper class counterpart
		o.add(1.1, 2.2, 3.3);
		
	}
	
	public Double add(Double a, Double b, Double c) {
		return a + b + c;
	}
	
	//varargs - variable length arguments
	public int add(int ...a) {
		int ret = 0;
		Arrays.parallelSort(a);
		System.out.println(a.length);
		System.out.println(a[0]);
		for (int x : a) {
			ret += x;
		}
		return ret;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public long add(long a, long b) {
		return a + b;
	}
	
	/*
	 * public double add(double a, double b) { return a + b; }
	 */
	
	/*
	 * public long add(int a, int b) {
	 * 
	 * }
	 */

}
