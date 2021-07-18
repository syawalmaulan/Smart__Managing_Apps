package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class data_input extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);
        Button Btn1 = findViewById(R.id.LandPreparation);
        Button Btn2 = findViewById(R.id.Seeding);
        Button Btn3 = findViewById(R.id.Fertilizing);
        Button Btn4 = findViewById(R.id.Spraying);
        Button Btn5 = findViewById(R.id.Harvesting);
        Button Btn6 = findViewById(R.id.PostHarvest);
        Button Btn7 = findViewById(R.id.Result);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),land_preparation.class);
                startActivity(intent);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),seeding.class);
                startActivity(intent);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),fertilizing.class);
                startActivity(intent);
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),spraying.class);
                startActivity(intent);
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),harvesting.class);
                startActivity(intent);
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),postharvest.class);
                startActivity(intent);
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),outputdisplay.class);
                startActivity(intent);
            }
        });
    }
}





