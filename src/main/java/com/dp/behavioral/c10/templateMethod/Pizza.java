package com.dp.behavioral.c10.templateMethod;

public abstract class Pizza {
	
	public final void preparePizza() {
		selectCrust();
		addIngredients();
		addToppings();
		cook();
	}

	protected void selectCrust() {
		System.out.println("Selected Default Crust for Pizza!!!");
	}
	
	protected void cook() {
		System.out.println("Cooking for Default 15 minutes!!!");
	}
	
	protected abstract void addIngredients();
	protected abstract void addToppings();

}
