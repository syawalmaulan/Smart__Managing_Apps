package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class land_preparation extends AppCompatActivity {

    EditText editArea = findViewById(R.id.editArea1);
    EditText editStart = findViewById(R.id.editStart);
    EditText editEnd = findViewById(R.id.editEnd);
    EditText editDuration = findViewById(R.id.editDuration);
    EditText editWeight = findViewById(R.id.editWeight);
    EditText editCost = findViewById(R.id.editCost);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_preparation);
        Button Btn = findViewById(R.id.Next);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed () {
        Toast.makeText(this, "To Get Back To Previous Page, Finish Filling Up the Details", Toast.LENGTH_SHORT).show();
    }
}