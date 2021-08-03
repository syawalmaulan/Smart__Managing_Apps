package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smartmanagingapps.database.Basic_Info_DB;
import com.example.smartmanagingapps.database.LandPrepTable;

public class outputdisplay extends AppCompatActivity implements View.OnClickListener  {
    TextView resultFT;
    Button button;
    Basic_Info_DB lsite;
    LandPrepTable landPrepTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputdisplay);
        try {
            getData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultFT = findViewById(R.id.textResultFT);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//              //Field Capacity = Area/Duration
                //Machine Efficiency = ((96.61 * WT_Tractor)/Field Capacity)* 12000
                float field_capacityFT = (lsite.getSizeVal())/landPrepTable.getDurationVal_FT();
                float field_capacityST = (lsite.getSizeVal())/landPrepTable.getDurationVal_ST();
                float field_capacityTT = (lsite.getSizeVal())/landPrepTable.getDurationVal_TT();
                float total_cost_LP = (landPrepTable.getCost_FT()+landPrepTable.getCost_ST()+landPrepTable.getCost_TT();
                String string1 = "Field Capacity For First Tillage=" + field_capacityFT + "hec/hrs";
                String string2 = "Field Capacity For Second Tillage=" + field_capacityST + "hec/hrs";
                String string3 = "Field Capacity For First Tillage=" + field_capacityTT + "hec/hrs";
                String string4 = "Total Cost for Land preparation=" + total_cost_LP + "RM/hec";
                resultFT.setText(string1 +"\n" + string2 +"\n"+ string3 +"\n"+ string4);

                break;
        }


    }
    public void getData() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lsite = DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().getRowDataById(1);
                landPrepTable = DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().getRowDataById(1);
            }
        });
        thread.start();
        thread.join();
    }
}