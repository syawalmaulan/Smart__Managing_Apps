package com.example.smartmanagingapps;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Basic_Info_DB.class,LandPrepTable.class},version = 1,exportSchema = false)
public abstract class DatabaseHandler extends RoomDatabase {

    public abstract basic_info_dao basic_info_dao();
    public abstract LandPrepDAO landPrepDAO();

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
