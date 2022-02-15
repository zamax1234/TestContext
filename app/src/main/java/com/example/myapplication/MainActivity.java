package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextLogin;
    EditText editTextPass;
    Intent intent;
    SharedPreferences preferences;
    static List<Person> list;
    int age = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.input);
        editTextLogin = findViewById(R.id.login);
        editTextPass = findViewById(R.id.pass);
        intent = new Intent();
        list = new ArrayList();
        preferences = getSharedPreferences("MyPref", MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String number = sPref.getString(SENDSMS,"");
//                String sms = sPref.getString(PHONENUMS,"");

                Log.d("####  ", list.size()+"");
                if (list.size() == 0) {
                    intent = new Intent(getBaseContext(), Registration.class);
                    startActivity(intent);
                    return;
                }
                else {
                    for (int i = 0; i < list.size(); i++) {
                        String editText = editTextLogin.getText().toString() + editTextPass.getText().toString();
                        String listData = list.get(i).getLogin() + list.get(i).getPass();
                        if (editText.equals(listData)) {
                            Log.d("####  ", list.get(i) + "");
                            intent = new Intent(getBaseContext(), PersonActivity.class);
                            intent.putExtra("Name", list.get(i).getName());
                            startActivity(intent);
                            return;
                        }
                        if (list.size()-1 == i) {
                            intent = new Intent(getBaseContext(), Registration.class);
                            startActivity(intent);
                            return;
                        }

                    }
                }
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();

    }
}