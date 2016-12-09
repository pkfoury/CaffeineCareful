package com.example.peter.caffeinecareful;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        int progress = seekBar.getProgress();
        String progressString = Integer.toString(progress);
        final TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(progressString);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onStopTrackingTouch(SeekBar seekBar){

                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                textView.setText(CurrentLevelString);

            }

            public void onStartTrackingTouch(SeekBar seekBar){}

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        });





        Button morningButton = (Button) findViewById(R.id.button4);
        morningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MorningActivity.class);
                startActivity(myIntent);
            }
        });

        Button afternoonButton = (Button) findViewById(R.id.button3);
        afternoonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AfternoonActivity.class);
                startActivity(myIntent);
            }
        });

        Button eveningButton = (Button) findViewById(R.id.button2);
        eveningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, EveningActivity.class);
                startActivity(myIntent);
            }
        });

    }

}
