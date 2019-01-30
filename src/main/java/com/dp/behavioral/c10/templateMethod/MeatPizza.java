package com.dp.behavioral.c10.templateMethod;

public class MeatPizza extends Pizza {

	@Override
	protected void addIngredients() {
		System.out.println("Adding MEAT....");
	}

	@Override
	protected void addToppings() {
		System.out.println("TOPPING with spiced MEAT....");
	}
	
	public void selectCrust() {
		System.out.println("Selecting special Crust for meat Pizza...");
	}

}
