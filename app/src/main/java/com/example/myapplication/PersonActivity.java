package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {
    TextView textView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        textView = findViewById(R.id.name);
        intent = getIntent();
        textView.setText(intent.getStringExtra("Name"));
    }
}