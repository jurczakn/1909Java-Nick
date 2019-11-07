package com.revature.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Laptop;
import com.revature.service.LaptopService;

@RestController
public class LaptopControllerImpl implements LaptopController {

	LaptopService laptopService;
	
	@Autowired
	public void setLaptopService(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	
	@Override
	public Laptop createLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLaptop(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public Laptop repairLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GetMapping("/laptop/{serialNumber}")
	public Laptop getLaptop(@PathVariable String serialNumber) {
		Optional<Laptop> laptop = laptopService.getLaptop(serialNumber);
		
		if(laptop.isPresent()) {
			return laptop.get();
		}
		
		return null;
	}

}
