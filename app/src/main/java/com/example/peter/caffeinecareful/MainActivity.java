package com.example.peter.caffeinecareful;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        int progress = seekBar.getProgress();
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText("#");


        Button predictButton = (Button) findViewById(R.id.button2);
        predictButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, PredictionActivity.class);
                startActivity(myIntent);
            }
        });

    }

}
