package com.revature.main;

import com.revature.pojos.Circle;

public class ExampleDriver {
	
	public static void main(String[] args) {
		System.out.println(new com.revature.pojos.Circle().getRadius());
		com.revature.pojos.Circle circle = null;
		circle = new Circle();
		
		//circle.setColor("Red");
		
		System.out.println("bool: " + circle.c);
		
		System.out.println("String: " + circle.getColor());
		
		circle.setDiameter(25.5);
		
		circle.setRadius(77.698);
		
		System.out.println("Diameter: " + circle.getDiameter());
		System.out.println("Radius: " + circle.getRadius());
		
		short s = 3000;
		
		short s2 = 4;
		
		s = (short) (s + s2);
		
		float f = 1.1F;
		
	}

}
