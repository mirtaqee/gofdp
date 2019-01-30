package com.dp.structural.b6.flyweight;

import java.util.Vector;

public class VehicleFactory {

	private Vector<Vehicle> pool = new Vector<>();

	public VehicleFactory() {
		for (int i = 0; i < 10; i++) {
			pool.add(new Vehicle("v" + (i + 1)));
		}
	}

	public Vehicle getVehicle(String type, String color, int speed, int duration) {
		for (Vehicle vehicle : pool) {
			if (!vehicle.isActive()) {
				vehicle.setVehicleProperties(type, color, speed, duration);
				return vehicle;
			}
		}
		return null;
	}

}
