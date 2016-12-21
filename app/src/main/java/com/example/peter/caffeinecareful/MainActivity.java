package com.example.peter.caffeinecareful;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String filename = "myfile";
        String string = "Hello world!";
        FileOutputStream outputStream;

        try {
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(string.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


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
