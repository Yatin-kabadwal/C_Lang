package com.example.c_quiz;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
    }
    public void Third (View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity (intent);
    };

    public void Fourth (View view){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity (intent);
    };

    public void Fifth (View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void Six (View view){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void Seven (View view){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

}