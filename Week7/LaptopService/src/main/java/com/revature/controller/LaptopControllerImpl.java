package com.revature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@PostMapping("/laptop")
	@ResponseStatus(HttpStatus.CREATED)
	public Laptop createLaptop(@RequestBody Laptop laptop) {
		return laptopService.makeLaptop(laptop);
	}

	@Override
	@DeleteMapping("/laptop")
	public void deleteLaptop(Laptop laptop) {
		laptopService.throwLaptop(laptop);
	}

	@Override
	@PostMapping("/laptop/{serialNumber}/repair")
	public Laptop repairLaptop(@PathVariable String serialNumber) {
		return laptopService.fixLaptop(laptopService.getLaptop(serialNumber).get());
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

	@Override
	@GetMapping("/manufacturer/{manufacturer}/laptop")
	public List<Laptop> getLaptopByManufacturer(@PathVariable String manufacturer) {
		return laptopService.getLaptopsByManufacturer(manufacturer);
	}

	@Override
	@GetMapping("/laptop")
	public List<Laptop> getAllLaptops() {
		return laptopService.getAllLaptops();
	}

}
