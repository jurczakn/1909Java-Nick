package com.revature.main;

import java.io.IOException;

public class Driver {

	private static int count = 1;
	
	public static void main(String[] args) {

		String s = "hello";
		
		s = changeString(s);
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("hello");
		
		changeBuilder(sb);
		
		System.out.println(sb);
		
		/*
		 * try { recur(); } catch (Error e) { System.out.println("Caught");
		 * e.printStackTrace(); }
		 */
		
		//throwCheckedException();
		
		System.out.println("Starting fine");

		Object o = null;

		//System.out.println(getClassExample(o));

		System.out.println("ending fine");
		
		int x = 1000;
		int y = 0;
		
		//int z = x/y;
		
		try {
			throwCheckedException();
		} catch (IOException e) {
			
		} catch (Exception e) {
			System.out.println("Something was thrown");
			e.printStackTrace();
		} catch (Error e) {
			
		} catch (Throwable e) {
			
		} 
		
		try {
			
		} catch(Exception e) {
			
		}
		
		try {
			//throwCheckedException();
		} finally {
			
		}
		
		try {
			
		} catch (Exception e) {
			
		} finally {
			
		}
		
		//throw new RuntimeException();
		

	}

	private static String getClassExample(Object o) {
		/*
		 * if (o != null) { o.getClass(); }
		 */
		
		try {
			// risky code goes here
			System.out.println("Start of try");
			o.getClass();
			System.out.println("End of try");
			return returnValue("From inside the try block");
		} catch (Exception e) {
			System.out.println("This did not work, your object is null");
			o = new Object();
			e.printStackTrace();
			//throw new RuntimeException();
		} finally {
			System.out.println("This will always happen");
			//return "Inside finally";
		}
		
		return "";
		
	}
	
	private static String returnValue(String s) {
		System.out.println("Successfully called returnValue method");
		return s;
	}
	
	private static void throwCheckedException() throws Exception, IOException, Error, Throwable{
		double number = Math.random();
		return;
		/*
		 * if (number < 0.25) { throw new Exception(); } else if (number < .5) { throw
		 * new IOException(); } else if (number < .75) { throw new Error(); } else {
		 * throw new Throwable(); }
		 */
		
	}
	
	public static void recur() {
		System.out.println("Inside recur for " + count++ + "times");
		recur();
	}

	static String changeString(String s) {
		//s = new String(s + " world");
		s+=" world";
		return s;
	}
	
	static void changeBuilder(StringBuilder sb) {
		sb.append(" world");
	}
	
}
