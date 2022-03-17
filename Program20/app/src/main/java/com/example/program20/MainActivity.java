package com.example.program20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void register(View view){
        String currentUserName = userName.getText().toString();
        String currentPassword = password.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("user", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", currentUserName);
        editor.putString("password", currentPassword);
        editor.apply();
        Toast.makeText(this, "Credentials Saved", Toast.LENGTH_SHORT).show();
    }

    public void login(View view){
        String currentUserName = userName.getText().toString();
        String currentPassword = password.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("user", Activity.MODE_PRIVATE);
        String correctUserName = sharedPreferences.getString("username", "");
        String correctPassword = sharedPreferences.getString("password", "");
        if(currentUserName.equals(correctUserName)){
            if(currentPassword.equals(correctPassword)){
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Invalid User Name", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("user", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", "");
        editor.putString("password", "");
        editor.apply();
        Toast.makeText(this, "Credentials Reset", Toast.LENGTH_SHORT).show();
    }
}