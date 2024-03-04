package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        RadioGroup answers1 = findViewById(R.id.choices1);
        Button submitQ1 = findViewById(R.id.abtn);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question1.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answers1.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(selectedRB.getText().toString().equals("July 29, 2007")){
                        StoreScore.score++;
                        Toast.makeText(Question1.this, "You're answer is: CORRECT!!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question1.this, Question2.class);
                        intent.putExtra("name", "Patricia"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question1.this, "You're answer is: WRONG!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question1.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question1.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}