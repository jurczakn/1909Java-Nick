package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.bean.Laptop;

public interface LaptopService {
	
	public void makeLaptop(Laptop laptop);
	
	public void throwLaptop(Laptop laptop);
	
	public Optional<Laptop> getLaptop(String serialNumber);
	
	public void fixLaptop(Laptop laptop);
	
	public List<Laptop> getLaptopByManufacturer(String manufacturer);
	
}
