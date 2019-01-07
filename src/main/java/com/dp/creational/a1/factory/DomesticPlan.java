package com.dp.creational.a1.factory;

public class DomesticPlan extends Plan {
	
	@Override
	public String getPlanName() {
		return "Domestic Plan";
	}

	@Override
	public double getPlanRate() {
		return 3.5;
	}

}
