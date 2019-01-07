package com.dp.creational.a3.builder;

public class Builder_Main {

	public static void main(String[] args) {
		HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
		HouseBuildDirector houseBuildDirector = new HouseBuildDirector(woodenHouseBuilder);
		House woodenHouse = houseBuildDirector.makeHouse();
		System.out.println(woodenHouse.getFloorType() + " | " + woodenHouse.getWallType() + " | " + woodenHouse.getRoofType());
	}

}
