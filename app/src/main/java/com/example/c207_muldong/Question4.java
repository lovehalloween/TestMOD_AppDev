package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        RadioGroup answers4 = findViewById(R.id.choices4);
        Button submitQ4 = findViewById(R.id.dbtn);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question4.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answers4.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(selectedRB.getText().toString().equals("iOS")){
                        StoreScore.score++;
                        Toast.makeText(Question4.this, "You're answer is: CORRECT!!!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question4.this, Question5.class);
                        intent.putExtra("name", "Patricia"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question4.this, "You're answer is: WRONG!", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question4.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question4.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}