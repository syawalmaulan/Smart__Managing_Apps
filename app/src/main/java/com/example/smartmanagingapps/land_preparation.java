package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;


import com.example.smartmanagingapps.database.LandPrepTable;

public class land_preparation extends AppCompatActivity {

    //    EditText editArea = findViewById(R.id.editArea1);
//    EditText editStart = findViewById(R.id.editStart);
//    EditText editEnd = findViewById(R.id.editEnd);
//    EditText editDuration = findViewById(R.id.editDuration);
//    EditText editWeight = findViewById(R.id.editWeight);
//    EditText editCost = findViewById(R.id.editCost);
    TextView skipBtn1;
    TextView skipBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_preparation);
        Button Btn = findViewById(R.id.NextLP);
        EditText editStartFT = findViewById(R.id.editStartFT);
        EditText editEndFT = findViewById(R.id.editEndFT);
        EditText editDateFT = findViewById(R.id.editDateFT);
        EditText editMachineFT = findViewById(R.id.editMachineFT);
        EditText editLabourFT = findViewById(R.id.editlabourFT);
        EditText editCostFT = findViewById(R.id.editCostFT);
        EditText editStartST = findViewById(R.id.editStartST);
        EditText editEndST = findViewById(R.id.editEndST);
        EditText editDateST = findViewById(R.id.editDateST);
        EditText editMachineST = findViewById(R.id.editMachineST);
        EditText editLabourST = findViewById(R.id.editlabourST);
        EditText editCostST = findViewById(R.id.editCostST);
        EditText editStartTT = findViewById(R.id.editStartTT);
        EditText editEndTT = findViewById(R.id.editEndTT);
        EditText editDateTT = findViewById(R.id.editDateTT);
        EditText editMachineTT = findViewById(R.id.editMachineTT);
        EditText editLabourTT = findViewById(R.id.editlabourTT);
        EditText editCostTT = findViewById(R.id.editCostTT);
        skipBtn1 = findViewById(R.id.textView2);
        skipBtn2 = findViewById(R.id.textView3);

        skipBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editStartST.setText("0");
                editEndST.setText("0");
                editDateST.setText("0");
                editMachineST.setText("0");
                editLabourST.setText("0");
                editCostST.setText("0");
                editStartST.setEnabled(false);
                editEndST.setEnabled(false);
                editDateST.setEnabled(false);
                editMachineST.setEnabled(false);
                editLabourST.setEnabled(false);
                editCostST.setEnabled(false);

            }
        });
        skipBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editStartTT.setText("0");
                editEndTT.setText("0");
                editDateST.setText("0");
                editMachineST.setText("0");
                editLabourST.setText("0");
                editCostTT.setText("0");
                editStartTT.setEnabled(false);
                editEndTT.setEnabled(false);
                editDateST.setEnabled(false);
                editMachineST.setEnabled(false);
                editLabourST.setEnabled(false);
                editCostTT.setEnabled(false);

            }
        });

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int StartFT = Integer.parseInt(editStartFT.getText().toString());
                int EndFT = Integer.parseInt(editEndFT.getText().toString());
                int DateFT = Integer.parseInt(editDateFT.getText().toString());
                int MachineFT = Integer.parseInt(editMachineFT.getText().toString());
                int labourFT = Integer.parseInt(editLabourFT.getText().toString());
                int CostFT = Integer.parseInt(editCostFT.getText().toString());
                int StartST = Integer.parseInt(editStartST.getText().toString());
                int EndST = Integer.parseInt(editEndST.getText().toString());
                int DateST = Integer.parseInt(editDateST.getText().toString());
                int MachineST = Integer.parseInt(editMachineST.getText().toString());
                int labourST = Integer.parseInt(editLabourST.getText().toString());
                int CostST = Integer.parseInt(editCostST.getText().toString());
                int StartTT = Integer.parseInt(editStartTT.getText().toString());
                int EndTT = Integer.parseInt(editEndTT.getText().toString());
                int DateTT = Integer.parseInt(editDateTT.getText().toString());
                int MachineTT = Integer.parseInt(editMachineTT.getText().toString());
                int labourTT = Integer.parseInt(editLabourTT.getText().toString());
                int CostTT = Integer.parseInt(editCostTT.getText().toString());

                LandPrepTable landPrepTable = new LandPrepTable (StartFT, EndFT, DateFT, MachineFT,labourFT, CostFT, StartST, EndST, DateST, MachineST,labourST, CostST, StartTT, EndTT, DateTT, MachineTT,labourTT, CostTT);
                insertDataToLandPrepTable(landPrepTable);
                Intent intent = new Intent(v.getContext(), data_input.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "To Get Back To Previous Page, Finish Filling Up the Details", Toast.LENGTH_SHORT).show();
    }

    void insertDataToLandPrepTable(LandPrepTable landPrepTable) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().InsertLandPrepInfo(landPrepTable);
            }
        });
        thread.start();
//        Toast.makeText(getApplicationContext(), landPrepTable.getId(), Toast.LENGTH_SHORT);
    }

    void deleteTable() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().deleteAll();
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(), "All values in Table has been removed", Toast.LENGTH_SHORT);
    }
}