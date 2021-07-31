package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smartmanagingapps.database.Basic_Info_DB;
import com.example.smartmanagingapps.database.LandPrepTable;

public class outputdisplay extends AppCompatActivity implements View.OnClickListener  {
    TextView test;
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
        test = findViewById(R.id.textView14);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//              //Field Capacity = Area/Duration
                //Machine Efficiency = ((96.61 * WT_Tractor)/Field Capacity)* 12000
                float field_capacity = (lsite.getSizeVal())/landPrepTable.getDurationVal_FT();
                float machine_efficiency = (float) (((96.61*landPrepTable.getWeight_FT())/(field_capacity* 12000)));
                String string1 = "Field Capacity = Area/Duration = " + field_capacity ;
                String string2 = "Machine Efficiency = ((96.61 * WT_Tractor)/Field Capacity)* 12000 =" + machine_efficiency;
                test.setText(string1 +"\n" + string2);
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