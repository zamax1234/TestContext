package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.GetChars;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    Button button;
    Intent intent;
    EditText editTextLog;
    EditText editTextPass;
    EditText editTextName;
    String[] person;
    public void saveText() {
        SharedPreferences sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
//        ed.putString("", etText.getText().toString());
//        ed.putString(PHONENUMS, txtContact.getText().toString());
        ed.apply();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        button = findViewById(R.id.input);
        editTextLog = findViewById(R.id.login);
        editTextPass = findViewById(R.id.pass);
        editTextName = findViewById(R.id.name);
        person = new String[3];
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.list.add(new Person(editTextLog.getText().toString(), editTextPass.getText().toString(), editTextName.getText().toString()));
                finish();
            }
        });
    }
}