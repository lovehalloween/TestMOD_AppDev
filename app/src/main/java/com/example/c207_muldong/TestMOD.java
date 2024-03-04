package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class TestMOD extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_mod);

        Button start = findViewById(R.id.startbtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TestMOD.this, "Quiz Started", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TestMOD.this, Question1.class);
                intent.putExtra("name", "Patricia");
                startActivity(intent);
            }
        });
    }
}