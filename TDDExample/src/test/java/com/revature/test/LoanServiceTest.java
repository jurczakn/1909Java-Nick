package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.pojos.Loan;
import com.revature.service.LoanServiceImpl;
import com.revature.util.Calculator;

@RunWith(MockitoJUnitRunner.class)
public class LoanServiceTest {
	
	@Mock
	Calculator<Double> calc;

	LoanServiceImpl loanService;
	Loan loan;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		loanService = new LoanServiceImpl();
		loan = new Loan();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testSimpleMonthlyCalculatePaymentAmount() {
		loan.setInterest(.05);
		loan.setInterestType(Loan.InterestType.SIMPLE);
		loan.setPeriod(Loan.Period.MONTHLY);
		loan.setPrinciple(1000);
		loan.setLength(3);
		assertEquals("Payments should equal 31.94", new Double(31.94), loanService.calculatePaymentAmount(loan));

	}

}
