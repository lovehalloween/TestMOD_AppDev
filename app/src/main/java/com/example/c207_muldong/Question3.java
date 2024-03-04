package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        RadioGroup answers3 = findViewById(R.id.choices3);
        Button submitQ3 = findViewById(R.id.cbtn);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question3.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answers3.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(selectedRB.getText().toString().equals("Martin Cooper")){
                        StoreScore.score++;
                        Toast.makeText(Question3.this, "You're answer is: CORRECT!!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question3.this, Question4.class);
                        intent.putExtra("name", "Patricia"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question3.this, "You're answer is: WRONG!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question3.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question3.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}