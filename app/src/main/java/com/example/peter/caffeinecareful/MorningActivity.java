package com.example.peter.caffeinecareful;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar15);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                TextView textView = (TextView) findViewById(R.id.textView16);
                textView.setText(CurrentLevelString);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }
        });

        final SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar16);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
                TextView textView = (TextView) findViewById(R.id.textView17);
                textView.setText(CurrentLevelString);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }
        });

        final SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar17);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                String CurrentLevelString;
                int CurrentLevel = seekBar.getProgress();
                if (CurrentLevel == 0)
                    CurrentLevelString = "0%";
                else if (CurrentLevel == 1)
                    CurrentLevelString = "25%";
                else if (CurrentLevel == 2)
                    CurrentLevelString = "50%";
                else if (CurrentLevel == 3)
                    CurrentLevelString = "75%";
                else if (CurrentLevel == 4)
                    CurrentLevelString = "100%";
                else {
                    CurrentLevelString = "null";
                }
                TextView textView = (TextView) findViewById(R.id.textView14);
                textView.setText(CurrentLevelString);

            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int ans = User.predictMorning(seekBar.getProgress(), seekBar2.getProgress(),seekBar3.getProgress());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (!isFinishing()) {
                            if (ans == 1) {
                                new AlertDialog.Builder(MorningActivity.this)
                                        .setTitle("Drink coffee")
                                        .setMessage("Just know you'll be shorter tomorrow")
                                        .setCancelable(false)
                                        .setPositiveButton("thanks", new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent(MorningActivity.this, MainActivityBasic.class);
                                                startActivity(intent);
                                            }
                                        }).show();
                            } else if (ans == 0) {
                                new AlertDialog.Builder(MorningActivity.this)
                                        .setTitle("Don't drink coffee")
                                        .setMessage("You probably shouldn't")
                                        .setCancelable(false)
                                        .setPositiveButton("fine", new OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent(MorningActivity.this, MainActivityBasic.class);
                                                startActivity(intent);
                                            }
                                        }).show();
                            }
                        }
                    }
                });

            }
        });
    }

}
