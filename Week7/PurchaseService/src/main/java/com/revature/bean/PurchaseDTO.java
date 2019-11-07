package com.revature.bean;

public class PurchaseDTO {
	
	private String orderNumber;
	
	private String customer;
	
	private Laptop laptop;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseDTO other = (PurchaseDTO) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (laptop == null) {
			if (other.laptop != null)
				return false;
		} else if (!laptop.equals(other.laptop))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PurchaseDTO [orderNumber=" + orderNumber + ", customer=" + customer + ", laptop=" + laptop + "]";
	}

	public PurchaseDTO(String orderNumber, String customer, Laptop laptop) {
		super();
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.laptop = laptop;
	}

	public PurchaseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PurchaseDTO(Purchase purhchase) {
		this.orderNumber = purhchase.getOrderNumber();
		
		this.customer = purhchase.getCustomer();
		
		this.laptop = new Laptop();
		
		this.laptop.setSerialNumber(purhchase.getSerialNumber());
	}

}
