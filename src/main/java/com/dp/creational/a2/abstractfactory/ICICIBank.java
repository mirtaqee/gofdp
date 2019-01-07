package com.dp.creational.a2.abstractfactory;

public class ICICIBank implements Bank {
	
	private String bankName;

	public ICICIBank() {
		bankName = "ICICI Bank";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
