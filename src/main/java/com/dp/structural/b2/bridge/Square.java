package com.dp.structural.b2.bridge;

public class Square extends Shape {
	
	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Draw a square by applying color:");
		color.applyColor();
	}

}
