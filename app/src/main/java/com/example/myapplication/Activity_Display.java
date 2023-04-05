package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textViewName = (TextView) findViewById(R.id.textViewName);
        TextView textViewGender = (TextView) findViewById(R.id.textViewGender);
        TextView textViewBdate = (TextView) findViewById(R.id.textViewBdate);
        TextView textViewPhone = (TextView) findViewById(R.id.textViewPhone);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String phone = intent.getStringExtra("phone_key");
        String email = intent.getStringExtra("email_key");

        textViewName.setText(name);
        textViewGender.setText(gender);
        textViewBdate.setText(bdate);
        textViewPhone.setText(phone);
        textViewEmail.setText(email);
    }
}