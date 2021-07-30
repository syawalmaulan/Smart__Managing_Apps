package com.example.smartmanagingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smartmanagingapps.database.Basic_Info_DB;

public class outputdisplay extends AppCompatActivity implements View.OnClickListener {
    TextView test;
    Button button;
    Basic_Info_DB lsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputdisplay);
        getData();
        test = findViewById(R.id.textView14);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//                //Create a new thread object, to use the Database Handler. DB cannot run on the UI Thread.
//                Thread thread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        lsite = DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().getRowDataById(1);
//                    }
//                });
//                thread.start();
//                Log.d(TAG, String.valueOf(thread.isAlive()));
//                try {
//                    //When using this, the UI thread will wait for *thread* to finish doing whatever it's doing. The UI will freeze until it's done (you won't notice it)
//                    thread.join();
//                    Log.d(TAG, "After Join" + String.valueOf(thread.isAlive()));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //After thread join, data is now available
                test.setText(lsite.toString());
                break;
        }


    }
    public void getData(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lsite = DatabaseHandler.getInstance(getApplicationContext()).basic_info_dao().getRowDataById(1);
            }
        });
        thread.start();
    }
}