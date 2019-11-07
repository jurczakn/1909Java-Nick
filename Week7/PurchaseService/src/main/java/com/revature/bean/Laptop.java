package com.revature.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Laptop {
	
	private String serialNumber;
	
	private String model;
	
	private String manufacturer;
	
	private double price;
	
	private String parts;
	
	private int memory;
	
	private String timeOfPurchase;
	
	private boolean broken;

	public boolean isBroken() {
		return broken;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getTimeOfPurchase() {
		return timeOfPurchase;
	}

	public void setTimeOfPurchase(String timeOfPurchase) {
		this.timeOfPurchase = timeOfPurchase;
	}

	public Laptop(String serialNumber, String model, String manufacturer, double price, String parts, int memory,
			String timeOfPurchase, boolean broken) {
		super();
		this.serialNumber = serialNumber;
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.parts = parts;
		this.memory = memory;
		this.timeOfPurchase = timeOfPurchase;
		this.broken = broken;
	}

	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", model=" + model + ", manufacturer=" + manufacturer
				+ ", price=" + price + ", parts=" + parts + ", memory=" + memory + ", timeOfPurchase=" + timeOfPurchase
				+ ", broken=" + broken + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (broken ? 1231 : 1237);
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + memory;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((parts == null) ? 0 : parts.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		result = prime * result + ((timeOfPurchase == null) ? 0 : timeOfPurchase.hashCode());
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
		Laptop other = (Laptop) obj;
		if (broken != other.broken)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (memory != other.memory)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (parts == null) {
			if (other.parts != null)
				return false;
		} else if (!parts.equals(other.parts))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		if (timeOfPurchase == null) {
			if (other.timeOfPurchase != null)
				return false;
		} else if (!timeOfPurchase.equals(other.timeOfPurchase))
			return false;
		return true;
	}

	public Laptop() {
		super();
	}
	
}
