package com.revature.driver;

import com.revature.dao.CarDAO;
import com.revature.dao.CarDAOSerialization;
import com.revature.pojo.Car;

public class Driver {

	private static CarDAO carDAO = new CarDAOSerialization();
	
	public static void main(String[] args) {
		
		/*
		 * Car car = new Car("Toyota", 3, 2004, "numbersandstuff", "white");
		 * carDAO.createCar(car);
		 */
		 
		System.out.println(carDAO.readCar("numbersandstuff"));
	}

}
