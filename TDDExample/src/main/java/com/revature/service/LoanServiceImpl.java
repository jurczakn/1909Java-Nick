package com.revature.service;

import com.revature.pojos.Loan;
import com.revature.util.CalcImpl;
import com.revature.util.Calculator;

public class LoanServiceImpl implements LoanService {

	private Calculator<Double> calc = new CalcImpl<Double>();
	
	@Override
	public Double calculatePaymentAmount(Loan loan) {
		return null;
	}

	@Override
	public Double makeScheduledPayment(Loan loan) {
		return null;
	}

	public void setCalc(Calculator<Double> calc) {
		this.calc = calc;
	}
	
}
