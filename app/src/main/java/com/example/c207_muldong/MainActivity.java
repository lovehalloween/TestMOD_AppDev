package com.example.c207_muldong;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Result = findViewById(R.id.Result);
        EditText Year = findViewById(R.id.Year);
        Button checkbttn = findViewById(R.id.checkbttn);

        checkbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = Integer.parseInt(Year.getText().toString());
                String checkIfLeapYear = year%4==0 && (year%100!=0 || year%400==0)?
                        "Yes " + year +" is a Leap Year!":"No " + year + " is not a Leap Year";
                Result.setText(checkIfLeapYear);
            }
        });


    }
}