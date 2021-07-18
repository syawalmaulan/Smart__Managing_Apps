package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

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
        SQLHelper db = new SQLHelper(this);


        List<String> list = new ArrayList<String>();
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String StartFT = editStartFT.getText().toString();
                String EndFT = editEndFT.getText().toString();Button Btn = findViewById(R.id.NextLP);
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
                String DurFT = editDurFT.getText().toString();
                String WeightFT = editWeightFT.getText().toString();
                String CostFT = editCostFT.getText().toString();
                String StartST = editStartST.getText().toString();
                String EndST = editEndST.getText().toString();
                String DurST = editDurST.getText().toString();
                String WeightST = editWeightST.getText().toString();
                String CostST = editCostST.getText().toString();
                String StartTT = editStartTT.getText().toString();
                String EndTT = editEndTT.getText().toString();
                String DurTT = editDurTT.getText().toString();
                String WeightTT = editWeightTT.getText().toString();
                String CostTT = editCostTT.getText().toString();

                list.add(StartFT);list.add(EndFT);list.add(DurFT);list.add(WeightFT);
                list.add(CostFT);//First tillage
                list.add(StartST);list.add(EndST);list.add(DurST);list.add(WeightST);
                list.add(CostST);//second tillage
                list.add(StartTT);list.add(EndTT);list.add(DurTT);list.add(WeightTT);
                list.add(CostTT);//third tillage
                db.addBasicData(list);

                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed () {
        Toast.makeText(this, "To Get Back To Previous Page, Finish Filling Up the Details", Toast.LENGTH_SHORT).show();
    }

    void insertDataToLandPrepTable(LandPrepTable landPrepTable){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().InsertLandPrepInfo(landPrepTable);
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(),landPrepTable.getId(),Toast.LENGTH_SHORT);
    }
    void deleteTable(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().deleteAll();
            }
        });
        thread.start();
        Toast.makeText(getApplicationContext(),"All values in Table has been removed",Toast.LENGTH_SHORT);
    }
}