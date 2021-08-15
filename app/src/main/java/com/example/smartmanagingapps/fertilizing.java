package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.smartmanagingapps.database.LandPrepTable;
import com.example.smartmanagingapps.database.SeedingTable;
import com.example.smartmanagingapps.database.fertilzing_Table;

public class fertilizing extends AppCompatActivity {
    EditText editBrandF;
    EditText editMachineF;
    EditText editStartF;
    EditText editEndF;
    EditText editDateF;
    EditText editLabourF;
    EditText editCostfertilizerF;
    EditText editCostLabourF;
    EditText editInputF;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizing);
        editBrandF = findViewById(R.id.editBrandF);
        editStartF = findViewById(R.id.editStartF);
        editEndF = findViewById(R.id.editEndF);
        editMachineF = findViewById(R.id.editMachineF);
        editLabourF = findViewById(R.id.editLabourF);
        editInputF = findViewById(R.id.editTotalinputF);
        editCostfertilizerF = findViewById(R.id.editCostFertilizerF);
        editCostLabourF = findViewById(R.id.editCostLabourF);
        editDateF = findViewById(R.id.editDateF);
        Btn = findViewById(R.id.Next);


        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String BrandF = editBrandF.getText().toString();
                int StartF = Integer.parseInt(String.valueOf(editStartF.getText()));
                int EndF = Integer.parseInt(String.valueOf(editEndF.getText()));
                String MachineF = editMachineF.getText().toString();
                int LabourF = Integer.parseInt(String.valueOf(editLabourF.getText()));
                int DateF = Integer.parseInt(String.valueOf(editDateF.getText()));
                int CostLabourF= Integer.parseInt(String.valueOf(editCostLabourF.getText()));
                int CostfertilizerF = Integer.parseInt(String.valueOf(editCostfertilizerF.getText()));

                fertilzing_Table fertilzing_table = new fertilzing_Table(BrandF,StartF, EndF, MachineF,LabourF,DateF, CostLabourF, CostfertilizerF);
                Intent intent = new Intent(v.getContext(),data_input.class);
                startActivity(intent);
            }
        });
    }
    void insertDataTofertilzing_Table(fertilzing_Table fertilzing_table) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).fertilzing_dao().(fertilzing_Table);
            }
        });
        thread.start();
//        Toast.makeText(getApplicationContext(), fertilzing_Table.getId(), Toast.LENGTH_SHORT);
    }
}