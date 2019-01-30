package com.dp.structural.b6.flyweight;

public class Vehicle {

	private String name;
	private String task;

	private String type;
	private String color;
	private int speed;
	private int duration;

	protected boolean active;

	public boolean isActive() {
		return active;
	}

	public Vehicle(String name) {
		this.name = name;
		task = "OBSTRUCT THE TRAFFIC";
	}

	public void setVehicleProperties(String type, String color, int speed, int duration) {
		this.type = type;
		this.color = color;
		this.speed = speed;
		this.duration = duration;
	}

	public void addToTraffic() {
		System.out.println("Adding to traffic Vehicle: Type = " + type + " | Color = " + color + " | Speed = " + speed
				+ " | Duration = " + duration);
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				active = true;
				System.out.println(name + "->out");
			}
		}, duration * 1000);
		active = false;
	}

}
