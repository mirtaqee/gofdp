package com.dp.creational.a3.builder;

public interface HouseBuilder {
	
	HouseBuilder buildFloor();
	HouseBuilder buildWall();
	HouseBuilder buildRoof();
	House build();

}
