package com.dp.creational.a2.abstractfactory;

public class LoanFactory extends AbstractFactory{
	
	private Loan theLoan;
	
	@Override
	public Loan getLoan(String loan) {
		if(null != loan) {
			if("personal".equalsIgnoreCase(loan)) {
				theLoan = new PersonalLoan();
			} else if("car".equalsIgnoreCase(loan)) {
				theLoan = new CarLoan();
			}
		}
		return theLoan;
	}

	//THIS WILL RETURN NULL.NO IMPLEMENTATION AS THIS IS LOAN FACTORY
	@Override
	public Bank getBank(String bank) {
		return null;
	}

}
