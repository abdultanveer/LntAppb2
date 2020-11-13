package com.example.lntappb2.observerdesignpattern;

public interface MobilePhone {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(PushNotifServer sub);
}