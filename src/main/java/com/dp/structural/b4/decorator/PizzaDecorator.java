package com.dp.structural.b4.decorator;

public abstract class PizzaDecorator implements Food {

	private Food pizza;
	
	public PizzaDecorator(Food food) {
	    pizza = food;
	}
	
	public String prepare() {
		return pizza.prepare();
	}
	
	public double price() {
		return pizza.price() + 10.0;
	}
}
