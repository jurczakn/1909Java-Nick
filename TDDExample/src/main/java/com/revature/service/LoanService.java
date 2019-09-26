package com.revature.service;

import com.revature.pojos.Loan;

public interface LoanService {
	
	public Double calculatePaymentAmount(Loan loan);
	
	public Double makeScheduledPayment(Loan loan);

}
