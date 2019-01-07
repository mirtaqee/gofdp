package com.dp.creational.a2.abstractfactory;

public class BankFactory extends AbstractFactory{
	
	private Bank theBank;
	
	@Override
	public Bank getBank(String bank) {
		if(null != bank) {
			if("icici".equals(bank)) {
				theBank = new ICICIBank();
			} else if ("hdfc".equals(bank)) {
				theBank = new HDFCBank();
			}
		}
		return theBank;
	}

	//THIS WILL RETURN NULL.NO IMPLEMENTATION AS THIS IS BANKFACTORY
	@Override
	public Loan getLoan(String loan) {
		return null;
	}

}
