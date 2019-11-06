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
	public void makeLaptop(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public void throwLaptop(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Laptop> getLaptop(String serialNumber) {
		return laptopRepo.findById(serialNumber);
	}

	@Override
	public void fixLaptop(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Laptop> getLaptopByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		return null;
	}

}
