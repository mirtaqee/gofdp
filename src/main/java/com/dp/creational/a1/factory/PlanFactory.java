package com.dp.creational.a1.factory;

public class PlanFactory {

	private Plan thePlan;

	public Plan getPlan(String planType) {
		if(planType != null) {
			if("domestic".equals(planType)) {
				thePlan = new DomesticPlan();
			} else if("commercial".equals(planType)) {
				thePlan = new CommercialPlan();
			}
		}	
		return thePlan;
	}
}
