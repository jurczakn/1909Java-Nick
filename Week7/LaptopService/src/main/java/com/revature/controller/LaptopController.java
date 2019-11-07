package com.revature.controller;

import com.revature.bean.Laptop;

public interface LaptopController {
	
	public Laptop createLaptop(Laptop laptop);
	
	public void deleteLaptop(Laptop laptop);
	
	public Laptop repairLaptop(Laptop laptop);
	
	public Laptop getLaptop(String serialNumber);

}
