package com.dp.structural.b4.decorator;

public class Pizza implements Food {

	@Override
	public String prepare() {
		return "Tis is Pizza";
	}

	@Override
	public double price() {
		return 30.0;
	}

}
