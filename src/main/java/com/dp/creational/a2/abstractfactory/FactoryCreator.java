package com.dp.creational.a2.abstractfactory;

public class FactoryCreator {
	
	private static AbstractFactory theFactory;
	
	public static AbstractFactory getFactory(String factorySeeked) {
		if(null != factorySeeked) {
			if("bank".equals(factorySeeked)) {
				theFactory = new BankFactory();
			} else if("loan".equals(factorySeeked)) {
				theFactory = new LoanFactory();
			}
		}
		return theFactory;
	}

}
