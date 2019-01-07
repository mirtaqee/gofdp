package com.dp.structural.b2.bridge;

public abstract class Shape {
	
	// Look at the usage of protedted. This could have been private but this 
	// has to be accessed from its implementations
	protected Color color;

	public Shape(Color shapeColor) {
		this.color = shapeColor;
	}
	
	public abstract void draw();

}
