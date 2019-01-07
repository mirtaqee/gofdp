package com.dp.structural.b1.adapter;

public class PaymentJson {
	
	private String paymentType;
	private double amount;
	
	public PaymentJson(String payType, double d) {
		paymentType = payType;
		amount = d;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
