package com.example.eventmgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }



    public void c1(View view){
        Intent i = new Intent(Home.this,birthday.class);
        startActivity(i);
    }
    public void c2(View view){
        Intent i = new Intent(Home.this,wedding.class);
        startActivity(i);
    }
    public void c3(View view){
        Intent i = new Intent(Home.this,bachlor.class);
        startActivity(i);
    }
    public void c4(View view) {
        Intent i = new Intent(Home.this,concerts.class);
    startActivity(i);
    }
    public void c5(View view){
        Intent i = new Intent(Home.this,reception.class);
        startActivity(i);
    }
    public void c6(View view){
        Intent i = new Intent(Home.this,felicitation.class);
        startActivity(i);
    }
}
