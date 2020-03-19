package com.example.eventmgmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        TextView u=findViewById(R.id.username66);
        TextView p=findViewById(R.id.password66);

        if(dbmanager.checkacc(u.getText().toString(),p.getText().toString())){

            Toast.makeText(this, "Account Login Successfully", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity.this,Home.class);
            startActivity(i);
        }else {
            Toast.makeText(this, "Account Login Failed", Toast.LENGTH_SHORT).show();
        }


    }
    public void signup(View view){
        Intent i = new Intent(MainActivity.this,signup.class);
        startActivity(i);
    }
}
