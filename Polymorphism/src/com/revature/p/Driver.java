package com.revature.p;

import com.revature.c.Child;
import com.revature.p.Parent;

public class Driver {
	
	public static void main(String[] args) {
		Parent p = new Parent(5);
		System.out.println(p.a);
		System.out.println(p.getA());
		System.out.println("----------------------------------------------------------");
		Child c = new Child(6);
		System.out.println(c.a);
		System.out.println(c.getA());
		System.out.println(((Parent)c).a);
		System.out.println(((Parent)c).getA());
		System.out.println("----------------------------------------------------------");
		Parent p2 = new Child(7);
		System.out.println(p2.a);
		System.out.println(p2.getA());
		
		Object o;
		
		try {
			o = p.doStuff();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			o = ((Parent)c).doStuff();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
