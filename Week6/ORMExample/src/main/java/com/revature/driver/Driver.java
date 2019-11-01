package com.revature.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.dao.CaveDao;

@Component
public class Driver {

	@Autowired
	CaveDao caveDao;
	
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Driver driver = (Driver) ac.getBean("driver");
		
		driver.printAllCaves();
		
	}
	
	public void printAllCaves() {
		System.out.println(caveDao.readAllCaves());
	}

}
