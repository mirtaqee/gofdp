package com.dp.creational.a1.factory;

public class CommercialPlan extends Plan {

	@Override
	public String getPlanName() {
		return "Commercial Plan";
	}

	@Override
	public double getPlanRate() {
		return 5.5;
	}

}
