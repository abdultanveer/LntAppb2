package com.example.lntappb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.w(TAG,"onCreate");
        //get the intent which started this activity
        Intent intent = getIntent();
        //from the intent get the extras
        Bundle extras = intent.getExtras();
        //from extras get the string with the key = mykey
        String data = extras.getString("mykey");
        //put the string extraCTED into a textview
        TextView resultTextView = findViewById(R.id.textViewResult);
        resultTextView.setText(data);
    }
}