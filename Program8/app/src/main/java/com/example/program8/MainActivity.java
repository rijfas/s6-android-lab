package com.example.program8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DatePicker.OnDateChangedListener, TimePicker.OnTimeChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker datePicker = (DatePicker) findViewById(R.id.datepicker);
        datePicker.setOnDateChangedListener(this);
        TimePicker timePicker = (TimePicker) findViewById(R.id.timepicker);
        timePicker.setOnTimeChangedListener(this);
    }

    @Override
    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
        Toast.makeText(this, "Selected Date: " + i2 + "/" + i1 +  "/" + i, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTimeChanged(TimePicker timePicker, int i, int i1) {
        Toast.makeText(this, "Selected Time: " +   i1 +  ":" + i, Toast.LENGTH_SHORT).show();
    }
}