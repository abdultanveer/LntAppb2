package com.example.lntappb2.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class FcmServer implements PushNotifServer {

	private List<MobilePhone> mobilePhones;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public FcmServer(){
		this.mobilePhones =new ArrayList<>();
	}
	@Override
	public void register(MobilePhone obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!mobilePhones.contains(obj)) mobilePhones.add(obj);
		}
	}

	@Override
	public void unregister(MobilePhone obj) {
		synchronized (MUTEX) {
		mobilePhones.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<MobilePhone> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.mobilePhones);
			this.changed=false;
		}
		for (MobilePhone obj : observersLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(MobilePhone obj) {
		return this.message;
	}
	
	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}

}