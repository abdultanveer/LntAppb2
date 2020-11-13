package com.example.lntappb2.observerdesignpattern;

public interface PushNotifServer {

	//methods to register and unregister observers
	public void register(MobilePhone obj);
	public void unregister(MobilePhone obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getUpdate(MobilePhone obj);
	
}