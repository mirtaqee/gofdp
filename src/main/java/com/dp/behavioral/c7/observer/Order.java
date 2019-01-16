package com.dp.behavioral.c7.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List cart = new ArrayList<>();
	List payments = new ArrayList<>();
	
	AddItemTopic addItemTopic;
	AddPaymentTopic addPaymentTopic;
	CompleteOrderTopic completeOrderTopic;
	
	
	public Order() {
		
		//create observers
		Observer cashierDisplay = new CashierDisplay();
		Observer customerDisplay = new CustomerDisplay();
		
		//create topics (subscribers to observer)
		addItemTopic = new AddItemTopic();
		addPaymentTopic = new AddPaymentTopic();
		completeOrderTopic = new CompleteOrderTopic();
		
		//register
		addItemTopic.register(cashierDisplay);
		addPaymentTopic.register(cashierDisplay);
		completeOrderTopic.register(cashierDisplay);
		
		addItemTopic.register(customerDisplay);
		addPaymentTopic.register(customerDisplay);
		completeOrderTopic.register(customerDisplay);
	}
	
	public void addItem(Item item) {
		cart.add(item);
		addItemTopic.notifyObservers(item.getName() +" | $"+item.getPrice());
	}
	
	public void makePayment(Payment payment) {
		payments.add(payment);
		addPaymentTopic.notifyObservers(payment.getType() +" || $"+payment.getAmount());
	}
	
	public void completeOrder() {
		completeOrderTopic.notifyObservers("---ORDER COMPLETED---");
	}

}
