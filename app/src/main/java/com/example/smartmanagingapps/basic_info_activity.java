package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class basic_info_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        SQLHelper db = new SQLHelper(this);
        Button btn = findViewById(R.id.button);
        EditText editName = findViewById(R.id.editName);
        EditText editLocation = findViewById(R.id.editLocation);
        EditText editSize = findViewById(R.id.editSize);
        RadioButton landStat1 = findViewById(R.id.radioRent);
        RadioButton landStat2 = findViewById(R.id.radioOwn);

        List<String> list = new ArrayList<String>();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String loc = editLocation.getText().toString();
                String size = editSize.getText().toString();
                String landStat = String.valueOf(getLandStat(landStat1,landStat2));
                list.add(name);list.add(loc);list.add(size);list.add(landStat);
                db.addBasicData(list);
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }

    int getLandStat(RadioButton v1, RadioButton v2){
        int val  = 0 ;
        if(v1.isSelected()){
            val =  1;
        }
        if(v1.isSelected()&&v2.isSelected()){
            v2.toggle();
        }
        else if(v2.isSelected()){
            val =  2;
        }
        return val;
    }


}