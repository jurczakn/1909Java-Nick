package com.revature.service;

import java.util.logging.Logger;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.bean.Laptop;

@Service
public class LaptopServiceFinder implements LaptopService {

	private static final String laptopUrl = "http://localhost:10001/laptop/";
	private static Logger log = Logger.getLogger("Laptop_Service_Finder_Logger");
	
	@Override
	public Laptop readLaptop(String serialNumber) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Laptop> responseEntity =
				restTemplate.exchange(
						laptopUrl + serialNumber,
						HttpMethod.GET,
						null,
						Laptop.class);
		
		Laptop laptop = responseEntity.getBody();
		
		log.info(responseEntity.getStatusCode().toString());
		
		return laptop;
	}

}
