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
        EditText editDurFT = findViewById(R.id.editDurationFT);
        EditText editWeightFT = findViewById(R.id.editWeightFT);
        EditText editCostFT = findViewById(R.id.editCostFT);
        EditText editStartST = findViewById(R.id.editStartST);
        EditText editEndST = findViewById(R.id.editEndST);
        EditText editDurST = findViewById(R.id.editDurationST);
        EditText editWeightST = findViewById(R.id.editWeightST);
        EditText editCostST = findViewById(R.id.editCostST);
        EditText editStartTT = findViewById(R.id.editStartTT);
        EditText editEndTT = findViewById(R.id.editEndTT);
        EditText editDurTT = findViewById(R.id.editDurationTT);
        EditText editWeightTT = findViewById(R.id.editWeightTT);
        EditText editCostTT = findViewById(R.id.editCostTT);
        skipBtn1 = findViewById(R.id.textView2);
        skipBtn2 = findViewById(R.id.textView3);

        skipBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editStartST.setText("0");
                editEndST.setText("0");
                editDurST.setText("0");
                editWeightST.setText("0");
                editCostST.setText("0");
                editStartST.setEnabled(false);
                editEndST.setEnabled(false);
                editDurST.setEnabled(false);
                editWeightST.setEnabled(false);
                editCostST.setEnabled(false);

            }
        });
        skipBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editStartTT.setText("0");
                editEndTT.setText("0");
                editDurTT.setText("0");
                editWeightTT.setText("0");
                editCostTT.setText("0");
                editStartTT.setEnabled(false);
                editEndTT.setEnabled(false);
                editDurTT.setEnabled(false);
                editWeightTT.setEnabled(false);
                editCostTT.setEnabled(false);

            }
        });

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int StartFT = Integer.parseInt(editStartFT.getText().toString());
                int EndFT = Integer.parseInt(editEndFT.getText().toString());
                int DurFT = Integer.parseInt(editDurFT.getText().toString());
                int WeightFT = Integer.parseInt(editWeightFT.getText().toString());
                int CostFT = Integer.parseInt(editCostFT.getText().toString());
                int StartST = Integer.parseInt(editStartST.getText().toString());
                int EndST = Integer.parseInt(editEndST.getText().toString());
                int DurST = Integer.parseInt(editDurST.getText().toString());
                int WeightST = Integer.parseInt(editWeightST.getText().toString());
                int CostST = Integer.parseInt(editCostST.getText().toString());
                int StartTT = Integer.parseInt(editStartTT.getText().toString());
                int EndTT = Integer.parseInt(editEndTT.getText().toString());
                int DurTT = Integer.parseInt(editDurTT.getText().toString());
                int WeightTT = Integer.parseInt(editWeightTT.getText().toString());
                int CostTT = Integer.parseInt(editCostTT.getText().toString());

                LandPrepTable landPrepTable = new LandPrepTable(StartFT, EndFT, DurFT, WeightFT, CostFT, StartST, EndST, DurST, WeightST, CostST, StartTT, EndTT, DurTT, WeightTT, CostTT);
                insertDataToLandPrepTable(landPrepTable);
                Intent intent = new Intent(v.getContext(), Test.class);
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