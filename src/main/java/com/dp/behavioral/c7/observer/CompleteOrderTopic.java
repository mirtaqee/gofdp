package com.dp.behavioral.c7.observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {
	
	List<Observer> registeredObservers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		registeredObservers.add(observer);
	}

	@Override
	public void notifyObservers(String orderCompleteInfo) {
		for(Observer observer: registeredObservers) {
			observer.update(orderCompleteInfo);
		}
	}

}
