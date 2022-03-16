package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView firstNumber, secondNumber;
    float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = (TextView) findViewById(R.id.firstNumber);
        secondNumber = (TextView) findViewById(R.id.secondNumber);
    }

    public void addNumbers(View view){
        result = Float.parseFloat(firstNumber.getText().toString()) +
                Float.parseFloat(secondNumber.getText().toString());
        Toast.makeText(this, Float.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void subtractNumbers(View view){
        result = Float.parseFloat(firstNumber.getText().toString()) -
                Float.parseFloat(secondNumber.getText().toString());
        Toast.makeText(this, Float.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void multiplyNumbers(View view){
        result = Float.parseFloat(firstNumber.getText().toString()) *
                Float.parseFloat(secondNumber.getText().toString());
        Toast.makeText(this, Float.toString(result), Toast.LENGTH_SHORT).show();
    }

    public void divideNumbers(View view){
        result = Float.parseFloat(firstNumber.getText().toString()) /
                Float.parseFloat(secondNumber.getText().toString());
        Toast.makeText(this, Float.toString(result), Toast.LENGTH_SHORT).show();
    }
}