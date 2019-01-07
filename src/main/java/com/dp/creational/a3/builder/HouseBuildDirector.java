package com.dp.creational.a3.builder;

public class HouseBuildDirector {

	private HouseBuilder houseBuilder;

	public HouseBuildDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House makeHouse() {
		return houseBuilder.buildFloor().buildWall().buildRoof().build();
	}

}
