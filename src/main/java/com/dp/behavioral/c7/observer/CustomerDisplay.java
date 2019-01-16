package com.dp.behavioral.c7.observer;

public class CustomerDisplay implements Observer {

	@Override
	public void update(String newInfo) {
		System.out.println(" Latest Info on Customer Display is = " + newInfo);
	}

}
