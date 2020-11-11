package com.example.lntappb2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service {
    public MusicService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "service created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "service destroyed", Toast.LENGTH_SHORT).show();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}