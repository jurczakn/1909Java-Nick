package com.revature.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.House;
import com.revature.beans.Roof;
import com.revature.beans.StandardRoof;

public class BeanDriver {

	public static void main(String[] args) {

		//Old Way
		/*
		 * House house = new House(); house.setName("Brian's House");
		 * house.setOwner("Jacob and Michael"); 
		 * Roof roof = new StandardRoof(true, false, "true"); 
		 * house.setRoof(roof); 
		 * System.out.println(house);
		 */
		//Spring Way
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		House house = (House) ac.getBean("house");
		System.out.println(house);
		house.setName("Brian's House");
		house.setOwner("Jacob and Michael");
		
		
		House house2 = (House) ac.getBean("house");
		house2.setName("Brian's Other House");
		house2.setOwner("Carlos");
		((StandardRoof)house2.getRoof()).setShingles("no");
		((StandardRoof)house2.getRoof()).setSolarPanels(false);
		System.out.println("House 2 :" +house2);
		System.out.println("House 1:" +house);
		
	}

}
