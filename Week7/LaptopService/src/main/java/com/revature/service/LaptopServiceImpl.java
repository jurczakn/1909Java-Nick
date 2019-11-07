package com.revature.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bean.Laptop;
import com.revature.repo.LaptopRepo;

@Service
public class LaptopServiceImpl implements LaptopService {
	
	private LaptopRepo laptopRepo;
	
	@Autowired
	public void setLaptopRepo(LaptopRepo laptopRepo) {
		this.laptopRepo = laptopRepo;
	}

	@Override
	public Laptop makeLaptop(Laptop laptop) {
		return laptopRepo.save(laptop);
	}

	@Override
	public void throwLaptop(Laptop laptop) {
		laptopRepo.delete(laptop);
	}

	@Override
	public Optional<Laptop> getLaptop(String serialNumber) {
		return laptopRepo.findById(serialNumber);
	}

	@Override
	public Laptop fixLaptop(Laptop laptop) {
		laptop.setBroken(false);
		return laptopRepo.save(laptop);
	}

	@Override
	public List<Laptop> getLaptopsByManufacturer(String manufacturer) {
		return laptopRepo.findAllByManufacturer(manufacturer);
	}

	@Override
	public List<Laptop> getAllLaptops() {
		return laptopRepo.findAll();
	}

}
