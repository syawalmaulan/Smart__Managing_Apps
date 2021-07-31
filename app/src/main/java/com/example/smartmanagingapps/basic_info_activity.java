package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

import com.example.smartmanagingapps.database.Basic_Info_DB;

public class basic_info_activity extends AppCompatActivity implements View.OnClickListener{

    Basic_Info_DB listed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        Button btn2 = findViewById(R.id.button2);
      
//        SQLHelper db = new SQLHelper(this);
        Button btn = findViewById(R.id.buttonNext);
        EditText editName = findViewById(R.id.editName);
        EditText editLocation = findViewById(R.id.editLocation);
        EditText editSize = findViewById(R.id.editSize);
        RadioButton landStat1 = findViewById(R.id.radioRent);
        RadioButton landStat2 = findViewById(R.id.radioOwn);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    deleteTable();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
                try {
                    insertDataToBasicTable(basic_info_db);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }


    void insertDataToBasicTable(Basic_Info_DB basic_info_db) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().InsertBasicInfo(basic_info_db);
            }
        });
        thread.start();
        thread.join();
        Toast.makeText(getApplicationContext(),basic_info_db.getNameVal().toString(),Toast.LENGTH_SHORT);
    }
    void deleteTable() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().deleteAll();
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().deleteAll();
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().clearPrimaryKey();
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().clearPrimaryKey();


            }
        });
        thread.start();
        thread.join();

//        Log.d(TAG,listed.toString());
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


    @Override
    public void onClick(View v) {

    }
}