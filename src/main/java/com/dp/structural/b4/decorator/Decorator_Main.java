package com.dp.structural.b4.decorator;

public class Decorator_Main {

	public static void main(String[] args) {
		
		Food[] foods = {new Pizza(), new DeepFried(new Pizza()), new Spicy(new DeepFried(new Pizza()))};
		
		for(Food food: foods) {
			System.out.println(food.prepare() + "---" + food.price());
		}

	}

}
