package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smartmanagingapps.database.Basic_Info_DB;
import com.example.smartmanagingapps.database.LandPrepTable;
import com.example.smartmanagingapps.database.SeedingTable;

public class outputdisplay extends AppCompatActivity implements View.OnClickListener  {
    TextView resultLP;
    TextView resultSeed;
    Button button;
    Basic_Info_DB lsite;
    LandPrepTable landPrepTable;
    SeedingTable  seedingTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputdisplay);
        try {
            getData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resultLP = findViewById(R.id.textResultLP);
        resultSeed = findViewById(R.id.textResultSeed);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//              //Field Capacity = Area/Duration
                //Machine Efficiency = ((96.61 * WT_Tractor)/Field Capacity)* 12000
                float field_capacityFT = (float) (lsite.getSizeVal()/landPrepTable.getDurationVal_FT());
                float field_capacityST = (float) (lsite.getSizeVal()/landPrepTable.getDurationVal_ST());
                float field_capacityTT = (float) (lsite.getSizeVal()/landPrepTable.getDurationVal_TT());
                float total_cost_LP = (float) (landPrepTable.getCost_FT()+landPrepTable.getCost_ST()+landPrepTable.getCost_TT());
                String variety = (String) (seedingTable.getVariety());
                float field_capacityseed = (float) (lsite.getSizeVal()/seedingTable.getDurationVal());
                float seed_input = (float) ((seedingTable.getSeed_WT()*seedingTable.getNum_of_bag())/lsite.getSizeVal());
                float seed_cost = (float)((seedingTable.getNum_of_bag()*seedingTable.getSeed_Cost())/lsite.getSizeVal());
                float seed_labour_cost = (float)(seedingTable.getLabour_Cost()/lsite.getSizeVal());
                float transplanter_cost = (float)(seedingTable.getOperation_Cost()/lsite.getSizeVal());
                float total_operational_cost_seeding = (float)(seed_cost+seed_labour_cost+transplanter_cost);
                String string1 = "Field Capacity For First Tillage=" + field_capacityFT + "hec/hrs";
                String string2 = "Field Capacity For Second Tillage=" + field_capacityST + "hec/hrs";
                String string3 = "Field Capacity For First Tillage=" + field_capacityTT + "hec/hrs";
                String string4 = "Total Cost for Land preparation=" + total_cost_LP + "RM/hec";
                String string5 = "Variety of Paddy Used=" + variety ;
                String string6 = "Field Capacity For Seeding Operation=" + field_capacityseed+ "hec/hrs";
                String string7 = "Seed input per unit area=" + seed_input + "kg/ha" ;
                String string8 = "Total cost for seeds used=" + seed_cost +"RM/ha" ;
                String string9 = "Labour cost for Direct Seeding Method=" + seed_labour_cost +"RM/ha"  ;
                String string10 = "Cost for Transplanting method=" + transplanter_cost + "RM/ha" ;
                String string11 = "Total operational cost for seeding=" + total_operational_cost_seeding + "RM/ha" ;
                resultLP.setText(string1 +"\n" + string2 +"\n"+ string3 +"\n"+ string4);
                resultSeed.setText(string5 +"\n" + string6+"\n"+string7+ " "+string8 + "\n"+string9
                        + "\n"+string10+ "\n"+string11);

                break;
        }


    }
    public void getData() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lsite = DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().getRowDataById(1);
                landPrepTable = DatabaseHandler.getInstance(getApplicationContext()).landPrepDAO().getRowDataById(1);
                seedingTable = DatabaseHandler.getInstance(getApplicationContext()).seeding_dao().getRowDataById(1);
            }
        });
        thread.start();
        thread.join();
    }
}