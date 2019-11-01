package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Bear;
import com.revature.dao.BearRepo;

public class DataDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("data.xml");
		
		BearRepo bearRepo = (BearRepo) ac.getBean("bearRepo");
		
		System.out.println(bearRepo.save(new Bear(-1, "is this possible", "i sure hope so", 183.0123, 10382.0983)));
		
		System.out.println(bearRepo.findAllByBreed("football"));

		
	}

}
