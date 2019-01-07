package com.dp.creational.a4.singleton;

public class Singleton_Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		Singleton anotherSingleton = Singleton.getInstance();
		System.out.println(anotherSingleton.hashCode());
	}

}
