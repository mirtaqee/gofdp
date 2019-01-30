package com.dp.behavioral.c10.templateMethod;

public class TemplateMethod_Main {

	public static void main(String[] args) {
		Pizza cheesePizza = new CheesePizza();
		cheesePizza.preparePizza();
		System.out.println("-----------------------");
		Pizza meatPizza = new MeatPizza();
		meatPizza.preparePizza();
	}

}
