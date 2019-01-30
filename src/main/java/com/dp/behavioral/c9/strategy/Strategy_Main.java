package com.dp.behavioral.c9.strategy;

public class Strategy_Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.addItem(new Item("Pizza", 23.0));
		order.addItem(new Item("Juice", 13.0));
		order.addItem(new Item("Apple", 44.5));
		
		order.makePayment(new CardPayment("Debit", "VISA", 56.77));
		order.makePayment(new CashPayment(15.77));
	}

}
