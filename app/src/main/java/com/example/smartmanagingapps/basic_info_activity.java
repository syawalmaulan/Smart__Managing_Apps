package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class basic_info_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
 test
        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
      
        SQLHelper db = new SQLHelper(this);
        Button btn = findViewById(R.id.buttonNext);
     master
        EditText editName = findViewById(R.id.editName);
        EditText editLocation = findViewById(R.id.editLocation);
        EditText editSize = findViewById(R.id.editSize);
        RadioButton landStat1 = findViewById(R.id.radioRent);
        RadioButton landStat2 = findViewById(R.id.radioOwn);

        List<String> list = new ArrayList<String>();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteTable();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String loc = editLocation.getText().toString();
                int size = Integer.parseInt(String.valueOf(editSize.getText()));
                boolean landStat = true;
                landStat = getLandStat(landStat1,landStat2,landStat);
                Basic_Info_DB basic_info_db = new Basic_Info_DB(name,loc,size,landStat);
                insertDataToBasicTable(basic_info_db);
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }


    void insertDataToBasicTable(Basic_Info_DB basic_info_db){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().InsertBasicInfo(basic_info_db);
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(),basic_info_db.getNameVal().toString(),Toast.LENGTH_SHORT);
    }
    void deleteTable(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().deleteAll();
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(),"All values in Table has been removed",Toast.LENGTH_SHORT);
    }


    boolean getLandStat(RadioButton v1, RadioButton v2,boolean val){

        if(v1.isChecked() == true){
            return  val =  false;//rent
        }
        else if(v2.isChecked() == true){
            return val =  true;//true
        }
        return val;
    }


}