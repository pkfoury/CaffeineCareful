package com.example.peter.caffeinecareful;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar2);
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

        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar3);
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

        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar6);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                int CurrentLevel = seekBar.getProgress();
                String CurrentLevelString = Integer.toString(CurrentLevel);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(new MorningActivity());
                builder.setMessage("Fire missiles");
                builder.setPositiveButton("Fire", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE!
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
                // Create the AlertDialog object and return it
                builder.create();

                /**
                 Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 .setAction("Action", null).show();
                 */
            }
        });
    }

}
