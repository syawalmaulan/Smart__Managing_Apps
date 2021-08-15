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
    RadioButton Method2;
    EditText editVarietySd;
    EditText editMachineSd;
    EditText editStartSd;
    EditText editEndSd;
    EditText editDateSd;
    EditText editLabourSd;
    EditText editCostSeedSd;
    EditText editCostLabourSd;
    EditText editInputSd;
    Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeding);
        Method1 = findViewById(R.id.radioDirect);
        Method2 = findViewById(R.id.radioTransplanting);
        editVarietySd = findViewById(R.id.editVarietySd);
        editStartSd = findViewById(R.id.editStartSd);
        editEndSd = findViewById(R.id.editEndSd);
        editMachineSd = findViewById(R.id.editMachineSd);
        editLabourSd = findViewById(R.id.editLabourSd);
        editInputSd = findViewById(R.id.editInputSd);
        editCostSeedSd = findViewById(R.id.editCostSeedSd);
        editCostLabourSd = findViewById(R.id.editCostLabourSd);
        editDateSd = findViewById(R.id.editDateSd);
        Btn = findViewById(R.id.Next);

//        List<String> list = new ArrayList<String>();

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String VarietySd = editVarietySd.getText().toString();
                int StartSd = Integer.parseInt(String.valueOf(editStartSd.getText()));
                int EndSd = Integer.parseInt(String.valueOf(editEndSd.getText()));
                String MachineSd = editMachineSd.getText().toString();
                int LabourSd = Integer.parseInt(String.valueOf(editLabourSd.getText()));
                int DateSd = Integer.parseInt(String.valueOf(editDateSd.getText()));
                int CostLabourSd= Integer.parseInt(String.valueOf(editCostLabourSd.getText()));
                int CostSeedSd = Integer.parseInt(String.valueOf(editCostSeedSd.getText()));
                boolean MethodSd = true;
                MethodSd = getMethod(Method1, Method2, MethodSd);

                SeedingTable seedingTable = new SeedingTable(VarietySd, MethodSd,StartSd, EndSd, MachineSd,LabourSd,DateSd, CostLabourSd, CostSeedSd);
                try {
                    insertDataToSeedingTable(seedingTable);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(v.getContext(), data_input.class);
                startActivity(intent);
            }
        });
    }

    void insertDataToSeedingTable(SeedingTable seedingTable) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                DatabaseHandler.getInstance(getApplicationContext()).seeding_dao().InsertBasicInfo(seedingTable);
            }
        });
        thread.start();
        thread.join();
        Toast.makeText(getApplicationContext(), seedingTable.getId(), Toast.LENGTH_SHORT);
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