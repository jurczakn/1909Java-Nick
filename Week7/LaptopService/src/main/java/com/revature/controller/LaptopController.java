package com.revature.controller;

import java.util.List;

import com.revature.bean.Laptop;

public interface LaptopController {
	
	public Laptop createLaptop(Laptop laptop);
	
	public void deleteLaptop(Laptop laptop);
	
	public Laptop repairLaptop(String serialNumber);
	
	public Laptop getLaptop(String serialNumber);
	
	public List<Laptop> getLaptopByManufacturer(String manufacturer);
	
	public List<Laptop> getAllLaptops();

}
