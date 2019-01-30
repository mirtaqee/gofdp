package com.dp.behavioral.c9.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List cart = new ArrayList<>();
	List payments = new ArrayList<>();
	
	public void addItem(Item item) {
		cart.add(item);
		System.out.println(item.getName() +" | $"+item.getPrice());
	}
	
	public void makePayment(PaymentStrategy paymentStrategy) {
		payments.add(paymentStrategy);
		paymentStrategy.pay();
	}
	
}
