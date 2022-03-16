package com.example.program5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void showSelectedItem(View view){
        String[] flowers = getResources().getStringArray(R.array.flowers);
        Toast.makeText(this, flowers[spinner.getSelectedItemPosition()], Toast.LENGTH_SHORT).show();
    }
}