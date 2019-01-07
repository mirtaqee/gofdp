package com.dp.structural.b2.bridge;

public class Circle extends Shape {
	
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Draw Circle in:");
		// This variable is accessible coz it is Protected in class Shape
		color.applyColor();
	}

}
