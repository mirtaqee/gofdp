package com.dp.behavioral.c7.observer;

public class CashierDisplay implements Observer {

	@Override
	public void update(String newInfo) {
		System.out.println(" Latest Info on Cashier Display is = " + newInfo);
	}

}
