package com.dp.creational.a2.abstractfactory;

public class HDFCBank implements Bank {

	private String bankName;

	public HDFCBank() {
		bankName = "HDFC Bank";
	}
	
	@Override
	public String getBankName() {
		return bankName;
	}

}
