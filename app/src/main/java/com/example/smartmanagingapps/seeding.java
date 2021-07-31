package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.smartmanagingapps.database.SeedingTable;

import java.util.ArrayList;
import java.util.List;

public class seeding extends AppCompatActivity {
    RadioButton Method1;
    EditText editVariety;
    RadioButton Method2;
    EditText editWS;
    EditText editStartS;
    EditText editEndS;
    EditText editDurationS;
    EditText editWT;
    EditText editNobag;
    EditText editOC;
    EditText editSC;
    EditText editLC;
    Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeding);
        Method1 = findViewById(R.id.radioDirect);
        Method2 = findViewById(R.id.radioTransplanting);
        editVariety = findViewById(R.id.editVariety);
        editStartS = findViewById(R.id.editStartS);
        editEndS = findViewById(R.id.editEndS);
        editDurationS = findViewById(R.id.editDurationS);
        editWT = findViewById(R.id.editWT);
        editWS = findViewById(R.id.editWS);
        editNobag = findViewById(R.id.editNobag);
        editOC = findViewById(R.id.editOC);
        editSC = findViewById(R.id.editSC);
        editLC = findViewById(R.id.editLC);
        Btn = findViewById(R.id.Next);

//        List<String> list = new ArrayList<String>();

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Variety = editVariety.getText().toString();
                int StartS = Integer.parseInt(String.valueOf(editStartS.getText()));
                int EndS = Integer.parseInt(String.valueOf(editEndS.getText()));
                int DurationS = Integer.parseInt(String.valueOf(editDurationS.getText()));
                int Nobag = Integer.parseInt(String.valueOf(editNobag.getText()));
                int WT = Integer.parseInt(String.valueOf(editWT.getText()));
                int WS = Integer.parseInt(String.valueOf(editWS.getText()));
                int OC = Integer.parseInt(String.valueOf(editOC.getText()));
                int LC = Integer.parseInt(String.valueOf(editLC.getText()));
                int SC = Integer.parseInt(String.valueOf(editSC.getText()));
                boolean Method = true;
                Method = getMethod(Method1, Method2, Method);
                SeedingTable seedingTable = new SeedingTable(Variety, Method,StartS, EndS, DurationS,WT,WS, Nobag, OC, LC, SC);
                try {
                    insertDataToBasicTable(seedingTable);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(v.getContext(), data_input.class);
                startActivity(intent);
            }
        });
    }


    void insertDataToBasicTable(SeedingTable seedingTable) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).seeding_dao().InsertBasicInfo(seedingTable);
            }
        });
        thread.start();
        thread.join();
        Toast.makeText(getApplicationContext(), seedingTable.getVariety(), Toast.LENGTH_SHORT);
    }

    void deleteTable() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().deleteAll();
                DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().clearPrimaryKey();
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(), "All values in Table has been removed", Toast.LENGTH_SHORT);
    }


    boolean getMethod(RadioButton v1, RadioButton v2, boolean val) {

        if (v1.isChecked() == true) {
            return val = false;//rent
        } else if (v2.isChecked() == true) {
            return val = true;//own
        }
        return val;
    }


}