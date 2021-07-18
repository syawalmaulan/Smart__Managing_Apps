package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class seeding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeding);
        RadioButton Method1 = findViewById(R.id.radioDirect);
        RadioButton Method2 = findViewById(R.id.radioTransplanting);
        EditText editVariety = findViewById(R.id.editVariety);
        EditText editArea  = findViewById(R.id.editArea);
        EditText editStart = findViewById(R.id.editStart);
        EditText editEnd = findViewById(R.id.editEnd);
        EditText editDuration = findViewById(R.id.editDuration);
        EditText editWT = findViewById(R.id.editWT);
        EditText editWS = findViewById(R.id.editWS);
        EditText editNo_bag = findViewById(R.id.editNo_bag);
        EditText editOC = findViewById(R.id.editOC);
        EditText editSC = findViewById(R.id.editSC);
        EditText editLC = findViewById(R.id.editLC);
        Button Btn = findViewById(R.id.Next);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }
}