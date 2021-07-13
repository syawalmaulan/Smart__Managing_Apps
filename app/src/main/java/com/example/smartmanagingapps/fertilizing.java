package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fertilizing extends AppCompatActivity {

    Button Btn;
    EditText editFW,editBag,editArea,editNVal,editPVal,editKVal,editStartTime,editEndTime,editDuration,editSC,editLabourCost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizing);
        Btn = findViewById(R.id.Next);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }
}