package com.dp.structural.b4.decorator;

public class DeepFried extends PizzaDecorator{

	public DeepFried(Food food) {
		super(food);
	}
	
	public String prepare() {
		return super.prepare() + " | Wit DeepFry";
	}

}
