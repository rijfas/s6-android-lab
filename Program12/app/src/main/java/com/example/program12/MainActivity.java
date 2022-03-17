package com.example.program12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

   public void showSelected(View view) {
       CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
       CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
       CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
       CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
       String message = "Selected Qualifications: ";
       if(checkBox1.isChecked())
           message += "PG ";
       if(checkBox2.isChecked())
           message += "UG ";
       if(checkBox3.isChecked())
           message += "+2 ";
       if(checkBox4.isChecked())
           message += "SSLC ";
       Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
   }
}