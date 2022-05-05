package com.example.expense_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        View s = findViewById(R.id.sign_in);
        s.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View s) {
                Intent intent=new Intent(LoginActivity.this,sign_in.class);
                startActivity(intent);
            }
        });
        View l = findViewById(R.id.log_in);
        l.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View s) {
                Intent intent=new Intent(LoginActivity.this,log_in.class);
                startActivity(intent);
            }
        });
    }
}