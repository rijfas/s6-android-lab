package com.example.program15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements Chronometer.OnChronometerTickListener {
    int seconds,minutes, hours;
    Chronometer chronometer;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        textView = (TextView) findViewById(R.id.textView);
        seconds = 0;
        minutes = 0;
        hours = 0;
        chronometer.setOnChronometerTickListener(this);
    }

    @Override
    public void onChronometerTick(Chronometer chronometer) {
        if(++seconds==60){
            seconds = 0;
            minutes++;
        }
        if(minutes==60){
            minutes = 0;
            hours++;
        }
        textView.setText(convertToTwoDigit(hours) + ":" + convertToTwoDigit(minutes) + ":" + convertToTwoDigit(seconds));
    }

    public void start(View view){
        chronometer.start();
    }

    public void stop(View view){
        chronometer.stop();
    }

    public void reset(View view){
        seconds = 0;
        minutes = 0;
        hours   = 0;
        textView.setText("00:00:00");
    }

    String convertToTwoDigit(int number) {
        if(number>=10)
            return  Integer.toString(number);
        return "0" + number;
    }
}