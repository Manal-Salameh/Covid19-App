package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cases, news, symptoms, preventions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cases = findViewById(R.id.casesBtn);
        news = findViewById(R.id.newsBtn);
        symptoms = findViewById(R.id.symptomBtn);
        preventions = findViewById(R.id.preventionBtn);

        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, symptoms.class);
                startActivity(intent);
            }
        });

        preventions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Prevention.class);
                startActivity(intent);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
            }
        });


        cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cases.class);
                startActivity(intent);
            }
        });

    }
}
