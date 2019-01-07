package com.dp.structural.b1.adapter;

import java.util.ArrayList;
import java.util.List;

public class OMSAdapter {
	
	NewOMS newOMS = new NewOMS();
	
	public void addItem(Item itemXML){
		ItemJson itemJson = convertItemXMLToItemJson(itemXML);
		newOMS.addItem(itemJson);
	}

	public void makePayment(Payment paymentXML) {
		PaymentJson paymentJson = convertPaymentXMLToPaymentJson(paymentXML);
		newOMS.makePayment(paymentJson);
	}

	
	private PaymentJson convertPaymentXMLToPaymentJson(Payment paymentXML) {
		//LOGIC to transform 
		return null;
	}

	private ItemJson convertItemXMLToItemJson(Item itemXML) {
		//LOGIC to transform 
		return null;
	}
}
