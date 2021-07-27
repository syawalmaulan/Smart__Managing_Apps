package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Test extends AppCompatActivity implements View.OnClickListener {

    CardView landPrep;
    CardView seedingCard;
    CardView sprayingCard;
    CardView fertilizingCard;
    CardView harvestingCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getSupportActionBar().hide();
        landPrep = findViewById(R.id.cardview1);
        seedingCard = findViewById(R.id.cardview2);
        sprayingCard = findViewById(R.id.cardview3);
        fertilizingCard = findViewById(R.id.cardview4);
        harvestingCard = findViewById(R.id.cardview5);

        landPrep.setOnClickListener(this);
        seedingCard.setOnClickListener(this);
        sprayingCard.setOnClickListener(this);
        fertilizingCard.setOnClickListener(this);
        harvestingCard.setOnClickListener(this);

   }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardview1:
                startActivity(new Intent(v.getContext(),land_preparation.class));
                break;
            case R.id.cardview2:
                startActivity(new Intent(v.getContext(),seeding.class));
                break;
            case R.id.cardview3:
                startActivity(new Intent(v.getContext(),spraying.class));
                break;
            case R.id.cardview4:
                startActivity(new Intent(v.getContext(),fertilizing.class));
                break;
            case R.id.cardview5:
                startActivity(new Intent(v.getContext(),harvesting.class));
                break;
        }
    }
}