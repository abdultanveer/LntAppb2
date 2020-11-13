package com.example.lntappb2.observerdesignpattern;

import android.util.Log;

public class SamsungMob implements MobilePhone {

	private static final String TAG = SamsungMob.class.getSimpleName() ;
	private String name;
	private PushNotifServer topic;
	
	public SamsungMob(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
			Log.i(TAG,name+ "no new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
		Log.i(TAG,name+ "Consuming message::"+msg);

	}

	@Override
	public void setSubject(PushNotifServer sub) {
		this.topic=sub;
	}

}