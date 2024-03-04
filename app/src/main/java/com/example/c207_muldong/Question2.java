package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        RadioGroup answers2 = findViewById(R.id.choices2);
        Button submitQ2 = findViewById(R.id.bbtn);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question2.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answers2.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(selectedRB.getText().toString().equals("September 23, 2008")){
                        StoreScore.score++;
                        Toast.makeText(Question2.this, "You're answer is: CORRECT!!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question2.this, Question3.class);
                        intent.putExtra("name", "Patricia"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question2.this, "You're answer is: WRONG!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question2.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question2.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}