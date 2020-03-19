package com.example.eventmgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void login(View view){
        Intent i = new Intent(signup.this,MainActivity.class);
        startActivity(i);
    }
    public void signup(View view){
        TextView u=findViewById(R.id.username66);
        TextView p=findViewById(R.id.password66);

        dbmanager.addacc(u.getText().toString(),p.getText().toString());

        Toast.makeText(this, "Account created Successfully", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(signup.this,MainActivity.class);
        startActivity(i);

    }
}
