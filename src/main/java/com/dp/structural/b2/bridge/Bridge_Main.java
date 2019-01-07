package com.dp.structural.b2.bridge;

public class Bridge_Main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{new Square(new Red()), new Circle(new Green())};
		
		for(Shape shape:shapes) {
			shape.draw();
		}
	}

}
