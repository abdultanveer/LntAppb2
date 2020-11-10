package com.example.lntappb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    public void clickHandler(View view) {
        Log.e(TAG,"clickHandler");
        Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
        hIntent.putExtra("mykey","abdul");
        startActivity(hIntent);
    }
}