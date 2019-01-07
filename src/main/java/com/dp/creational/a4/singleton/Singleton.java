package com.dp.creational.a4.singleton;

public class Singleton {

	private static Singleton instance = null;

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	private Singleton() {
	}

}
