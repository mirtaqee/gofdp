package com.dp.behavioral.c10.templateMethod;

public class CheesePizza extends Pizza {

	@Override
	protected void addIngredients() {
		System.out.println("Adding Cheese...");
	}

	@Override
	protected void addToppings() {
		System.out.println("Topping cheese & spice...");
	}
	
	public void cook() {
		System.out.println("Cook cheese pizza for 8 minutes!!!");
	}

}
