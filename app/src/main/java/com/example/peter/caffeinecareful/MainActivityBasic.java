package com.example.peter.caffeinecareful;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivityBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_basic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


         SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar18);
         int progress = seekBar.getProgress();
         String progressString = Integer.toString(progress);
         final TextView textView = (TextView) findViewById(R.id.textView26);
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




         Button morningButton = (Button) findViewById(R.id.button10);
         morningButton.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        Intent myIntent = new Intent(MainActivityBasic.this, MorningActivity.class);
        startActivity(myIntent);
        }
        });

         Button afternoonButton = (Button) findViewById(R.id.button11);
         afternoonButton.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        Intent myIntent = new Intent(MainActivityBasic.this, AfternoonActivity.class);
        startActivity(myIntent);
        }
        });

         Button eveningButton = (Button) findViewById(R.id.button12);
         eveningButton.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        Intent myIntent = new Intent(MainActivityBasic.this, EveningActivity.class);
        startActivity(myIntent);
        }
        });



    }

}
