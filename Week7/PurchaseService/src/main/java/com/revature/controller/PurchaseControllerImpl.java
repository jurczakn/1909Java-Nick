package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Purchase;
import com.revature.bean.PurchaseDTO;
import com.revature.service.LaptopService;
import com.revature.service.PurchaseService;

@RestController
public class PurchaseControllerImpl implements PurchaseController {

	private PurchaseService purchaseService;
	
	private LaptopService laptopService;
	
	@Autowired
	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}
	
	@Autowired
	public void setLaptopService(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	
	@Override
	@GetMapping("/purchase/{orderNumber}")
	public PurchaseDTO getPurchase(@PathVariable String orderNumber) {
		System.out.println(orderNumber);
		PurchaseDTO pDTO = new PurchaseDTO(purchaseService.viewPurchase(orderNumber));
		String serialNumber = pDTO.getLaptop().getSerialNumber();
		pDTO.setLaptop(laptopService.readLaptop(serialNumber));
		return pDTO;
	}

	@Override
	@PostMapping("/purchase")
	public Purchase makePurchase(@RequestBody Purchase purchase) {
		return purchaseService.createPurchase(purchase);
	}

}
