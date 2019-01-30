package com.dp.behavioral.c9.strategy;

public class CashPayment implements PaymentStrategy {

	private double amount;

	public CashPayment(double amount) {
		this.amount = amount;
	}

	@Override
	public void pay() {
		System.out.println("PAID " + amount + " as Cash ");
	}

}
