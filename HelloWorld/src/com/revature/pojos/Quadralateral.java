package com.revature.pojos;

public class Quadralateral {
	
	public static final int NUMBER_OF_SIDES = 4;
	
	private int[] sideLengths;
	
	private double[] angles;
	
	public int[] getSideLengths() {
		return this.sideLengths;
	}
	
	public void setSideLengths(int[] sideLengths) {
		this.sideLengths = sideLengths;
	}
	
	public double[] getAngles() {
		return this.angles;
	}
	
	public void setAngles(double[] angles) {
		this.angles = angles;
	}
	
	public Quadralateral(int[] sideLengths, double[] angles){
		super();  //If we did not call super, it would be call implicitly
		setAngles(angles);
		setSideLengths(sideLengths);
	}
	
	//first line of every constructor must me super() or this()
	public Quadralateral() {
		this(new int[]{1,1,1,1},new double[]{45.0,45.0,45.0,45.0});  //this refers to the other constructor in this class
	}

}
