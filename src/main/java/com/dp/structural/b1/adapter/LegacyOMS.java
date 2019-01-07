package com.dp.structural.b1.adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyOMS {
	
	List<Item> items = new ArrayList<>();
	List<Payment> payments = new ArrayList<>();
	
	public void addItem(Item itemXML){
		items.add(itemXML);
	}
	
	public void makePayment(Payment paymentXML) {
		payments.add(paymentXML);
	}

}
