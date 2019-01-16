package com.dp.behavioral.c7.observer;

public class Observer_Main {

	public static void main(String[] args) {
		Order order = new Order();
		order.addItem(new Item("Pizza", 23.0));
		order.addItem(new Item("Juice", 13.0));
		order.addItem(new Item("Apple", 44.5));
		
		order.makePayment(new Payment("Cash", 15.77));
		
		order.completeOrder();
	}

}
