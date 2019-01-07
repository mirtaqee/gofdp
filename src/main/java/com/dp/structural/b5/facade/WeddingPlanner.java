package com.dp.structural.b5.facade;

public class WeddingPlanner {
	
	private Hall weddingHall;
	private Vehicle vehicle;
	private Restuarant resturant;
	private Photography photograpy;
	
	public WeddingPlanner() {
		weddingHall = new Hall();
		vehicle = new Vehicle();
		resturant = new Restuarant();
		photograpy = new Photography();
	}
	
	public void organize() {
		weddingHall.bookHall();
		vehicle.reserveVehicle();
		resturant.orderFood();
		photograpy.book();
	}

}

class Hall {
	public void bookHall() {
		System.out.println("Booked Weddin hall");
	}
}

class Vehicle {
	public void reserveVehicle() {
		System.out.println("Booked Weddin Vehicle");
	}
}

class Restuarant{
	public void orderFood() {
		System.out.println("Odered Weddin Food");
	}
}

class Photography{
	public void book() {
		System.out.println("Booked foto service");
	}
}
