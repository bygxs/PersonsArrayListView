package com.biniyam.personsarraylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    TextView textView, tvAge,tvAddress ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        textView = findViewById(R.id.textViewName);
        tvAge = findViewById(R.id.tv_age);
        tvAddress = findViewById(R.id.tv_address);

        String name = getIntent().getStringExtra("NAME");
        textView.setText(name);

        int  age = getIntent().getIntExtra("AGE",0);
       // String age2 = String.valueOf(age); // changing int to String
        tvAge.setText(String.valueOf(age));

        String address = getIntent().getStringExtra("ADDRESS");
        tvAddress.setText(address);

       // tvAddress.setText(Integer.parseInt( address)); changeing String to int




    }
}