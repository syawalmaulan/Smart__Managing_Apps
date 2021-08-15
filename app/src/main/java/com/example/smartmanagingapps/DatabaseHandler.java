package com.example.smartmanagingapps;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.smartmanagingapps.database.Basic_Info_DB;
import com.example.smartmanagingapps.database.LandPrepDAO;
import com.example.smartmanagingapps.database.LandPrepTable;
import com.example.smartmanagingapps.database.SeedingTable;
import com.example.smartmanagingapps.database.basic_info_dao;
import com.example.smartmanagingapps.database.fertilzing_dao;
import com.example.smartmanagingapps.database.seeding_dao;

@Database(entities = {Basic_Info_DB.class, LandPrepTable.class, SeedingTable.class, fertilizing.class},version = 1,exportSchema = false)
public abstract class DatabaseHandler extends RoomDatabase {

    public abstract basic_info_dao basic_info_dao();
    public abstract LandPrepDAO landPrepDAO();
    public abstract seeding_dao seeding_dao();
    public abstract fertilzing_dao fertilzing_dao();

    public static volatile DatabaseHandler INSTANCE;

    static DatabaseHandler getInstance(Context context){
        if(INSTANCE == null)
            synchronized (DatabaseHandler.class){
            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DatabaseHandler.class, "PaddyMGT_DB").build();
            }

    }
        return INSTANCE;
}}
