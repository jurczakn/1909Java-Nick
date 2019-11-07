package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bean.Purchase;
import com.revature.repo.PurchaseRepo;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	private PurchaseRepo purchaseRepo;
	
	@Autowired
	public void setPurchaseRepo(PurchaseRepo purchaseRepo) {
		this.purchaseRepo = purchaseRepo;
	}
	
	@Override
	public Purchase createPurchase(Purchase purchase) {
		return purchaseRepo.save(purchase);
	}

	@Override
	public Purchase viewPurchase(String orderNumber) {
		return purchaseRepo.getOne(orderNumber);
	}

}
