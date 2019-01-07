package com.dp.creational.a3.builder;

public class WoodenHouseBuilder implements HouseBuilder {

	private House house;

	public WoodenHouseBuilder() {
		house = new House();
	}

	@Override
	public HouseBuilder buildFloor() {
		house.setFloorType("Wooden Floor");
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWallType("Wooden Wall");
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoofType("Wooden Roof");
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}
