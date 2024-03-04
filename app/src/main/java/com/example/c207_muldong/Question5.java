package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        RadioGroup answers5 = findViewById(R.id.choices5);
        Button submitQ5 = findViewById(R.id.ebtn);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question5.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answers5.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(selectedRB.getText().toString().equals("Android")){
                        StoreScore.score++;
                        Toast.makeText(Question5.this, "You're answer is: CORRECT!!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question5.this, ScorePage.class);
                        intent.putExtra("name", "Patricia"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question5.this, "You're answer is: WRONG!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question5.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question5.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}