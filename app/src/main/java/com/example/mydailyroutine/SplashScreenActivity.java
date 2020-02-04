package com.example.mydailyroutine;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_splash_screen);


        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    // After 5 seconds redirect to another intent
                    Intent intent=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(intent);

                    //Remove activity
                    finish();

                } catch (Exception e) {
                    Toast.makeText(SplashScreenActivity.this, "An error occured in your app", Toast.LENGTH_SHORT).show();

                }
            }
        };

        // start thread
        background.start();
    }
}
