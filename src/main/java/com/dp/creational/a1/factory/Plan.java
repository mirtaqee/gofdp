package com.dp.creational.a1.factory;

public abstract class Plan {

	public abstract String getPlanName();
	public abstract double getPlanRate();
	
	public double calculatePlanBill(int units) {
		return units * getPlanRate();
	}
}
