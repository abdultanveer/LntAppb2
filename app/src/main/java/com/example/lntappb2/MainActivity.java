package com.example.lntappb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
        hIntent.putExtra("mykey","abdul");
        startActivity(hIntent);
    }
}