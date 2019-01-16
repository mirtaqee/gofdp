package com.dp.behavioral.c7.observer;

import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {
	
	List<Observer> registeredObservers = new ArrayList<>();

	@Override
	public void register(Observer observer) {
		registeredObservers.add(observer);
	}

	@Override
	public void notifyObservers(String latestStatusInfo) {
		for(Observer observer: registeredObservers) {
			observer.update(latestStatusInfo);
		}
	}

}
