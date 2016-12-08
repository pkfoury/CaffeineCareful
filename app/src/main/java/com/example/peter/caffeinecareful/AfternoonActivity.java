package com.example.peter.caffeinecareful;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class AfternoonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar5);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onStopTrackingTouch(SeekBar seekBar){
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                TextView textView = (TextView) findViewById(R.id.textView18);
                textView.setText(CurrentLevelString);
            }
            public void onStartTrackingTouch(SeekBar seekBar){}
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        });

        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar7);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onStopTrackingTouch(SeekBar seekBar){
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                TextView textView = (TextView) findViewById(R.id.textView19);
                textView.setText(CurrentLevelString);
            }
            public void onStartTrackingTouch(SeekBar seekBar){}
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        });

        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar8);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            public void onStopTrackingTouch(SeekBar seekBar){
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                TextView textView = (TextView) findViewById(R.id.textView20);
                textView.setText(CurrentLevelString);
            }
            public void onStartTrackingTouch(SeekBar seekBar){}
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){}
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
