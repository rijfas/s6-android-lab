package com.example.program19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listview);
    }

    public void generateMultiplicationTable(View view){
        int number = Integer.parseInt(editText.getText().toString());
        ArrayList<String> multiplicationTable = new ArrayList<String>();
        for(int i=1;i<=10;i++)
            multiplicationTable.add(i + " x " + number + " = " + i*number);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, multiplicationTable);
        listView.setAdapter(arrayAdapter);
    }
}