package com.revature.driver;

import java.lang.reflect.Field;

//Reflection - Java's ability to look at itself, your code, at runtime
public class Driver {
	
	public static void main(String[] args) {

		
		String var = "Foo";
		
		System.out.println("Initial contents: " + var);
		
		Class<String> string = String.class;
		
		try {
			Field field = string.getDeclaredField("value");
			field.setAccessible(true);
			field.set(var, "Something Different".toCharArray());
			System.out.println("New contents: " + var);
			System.out.println("Foo");
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}


}
