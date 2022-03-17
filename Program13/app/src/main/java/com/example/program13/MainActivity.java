package com.example.program13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setIndianFlag(View view){
        imageView.setImageResource(R.drawable.india);
    }

    public void setChineseFlag(View view){
        imageView.setImageResource(R.drawable.china);
    }

    public void setPakistanFlag(View view){
        imageView.setImageResource(R.drawable.pakistan);
    }
}