0package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


import com.example.smartmanagingapps.LandPrepTable;

import java.util.ArrayList;
import java.util.List;

public class land_preparation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.layout.activity_land_preparation);
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

        List<String> list = new ArrayList<String>();
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
                LandPrepTable landPrepTable = new LandPrepTable(StartFT,EndFT,DurFT,WeightFT,CostFT,StartST,EndST,DurST,WeightST,CostST,StartTT,EndTT,DurTT,WeightTT,CostTT);
                insertDataToLandPrepTable(landPrepTable)=;
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