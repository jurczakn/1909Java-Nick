package com.revature.pojo;

import java.io.Serializable;

//Serializable is a MARKER INTERFACE
//A marker interface is an interface with no methods
public class Car implements Serializable{
	
	private String make;
	
	private transient int wheels;
	
	private int modelYear;
	
	private String vin;
	
	private String color;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car(String make, int wheels, int modelYear, String vin, String color) {
		super();
		this.make = make;
		this.wheels = wheels;
		this.modelYear = modelYear;
		this.vin = vin;
		this.color = color;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", wheels=" + wheels + ", modelYear=" + modelYear + ", vin=" + vin + ", color="
				+ color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + modelYear;
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
		result = prime * result + wheels;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (modelYear != other.modelYear)
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		if (wheels != other.wheels)
			return false;
		return true;
	}
	
}
