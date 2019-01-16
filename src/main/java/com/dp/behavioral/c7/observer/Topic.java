package com.dp.behavioral.c7.observer;

public interface Topic {
	
	void register(Observer observer);
	void notifyObservers(String latestStatusInfo);

}
