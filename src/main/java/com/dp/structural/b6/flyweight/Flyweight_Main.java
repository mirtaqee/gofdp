package com.dp.structural.b6.flyweight;

import java.util.Random;

public class Flyweight_Main {
	
	static Random random = new Random();
	private static String[] types = {"Bus", "Truck", "Car"};
	private static String[] colors = {"RED", "YELLOW", "BLUE"};
	private static int[] speeds = {60, 80, 100};

	public static void main(String[] args) throws InterruptedException {
		for(int i=0; i<20; i++) {
			VehicleFactory vehicleFactory = new VehicleFactory();
			Vehicle vehicle = vehicleFactory.getVehicle(getRandonType(), getRandomColor(), getRandomSpeed(), getRandomDuration());
			if(vehicle != null) {
				vehicle.addToTraffic();
			} else {
				Thread.sleep(1000);
			}
		}
	}

	private static int getRandomDuration() {
		return random.nextInt(5)+1 ;
	}

	private static int getRandomSpeed() {
		return speeds[random.nextInt(speeds.length)];
	}

	private static String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}

	private static String getRandonType() {
		return types[random.nextInt(types.length)];
	}

}
