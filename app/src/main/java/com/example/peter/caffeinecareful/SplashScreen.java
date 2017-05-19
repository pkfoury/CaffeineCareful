package com.example.peter.caffeinecareful;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    private void finishscreen() {
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivityBasic.class);
                startActivity(intent);
                finishscreen();
            }
        };
        Timer t = new Timer();
        t.schedule(task, 2000);


    }
}
