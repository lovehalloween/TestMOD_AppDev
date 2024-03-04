package com.example.c207_muldong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ScorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        TextView tv = findViewById(R.id.ShowScore);
        StoreScore ss = new StoreScore();
        tv.setText(Integer.toString(StoreScore.score));

        Button retrake = findViewById(R.id.retakebtn);

        retrake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScorePage.this, TestMOD.class);
                intent.putExtra("name", "Patricia");
                startActivity(intent);
            }
        });
    }
}