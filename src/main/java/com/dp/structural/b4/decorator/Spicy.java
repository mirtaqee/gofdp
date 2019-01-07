package com.dp.structural.b4.decorator;

public class Spicy extends PizzaDecorator {

	public Spicy(Food food) {
		super(food);
	}
	
	public String prepare() {
		return super.prepare()+ " | Wit Spice.";
	}
	
	public double price() {
		return super.price()+5.0;
	}

}
