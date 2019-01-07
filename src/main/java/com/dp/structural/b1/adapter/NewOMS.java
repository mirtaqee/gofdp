package com.dp.structural.b1.adapter;

import java.util.ArrayList;
import java.util.List;

public class NewOMS {
	
	List<ItemJson> items = new ArrayList<>();
	List<PaymentJson> payments = new ArrayList<>();
	
	public void addItem(ItemJson itemJson){
		items.add(itemJson);
	}
	
	public void makePayment(PaymentJson paymentJson) {
		payments.add(paymentJson);
	}

}
