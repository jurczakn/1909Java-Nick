package com.revature.pojos;

public class Circle {

	public boolean c;

	private double diameter;

	private double radius;

	private String color;

	public double getDiameter() {
		return this.diameter;
	}

	public void setDiameter(double diameter) {
		if (diameter >= 0) {
			this.diameter = diameter;
			this.radius = diameter/2;
		}
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
			this.diameter = 2 * radius;
		}
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
