package com.example.smartmanagingapps.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface fertilzing_dao {

    @Query("SELECT * FROM fertilizingTable")
    List<fertilzing_Table> getAllData();

    @Insert
    void insertFertilizingData (fertilzing_Table fertilzing_table);

    @Update
    void updateFertilizingData (fertilzing_Table fertilzing_table);

    @Query("DELETE FROM fertilizingTable")
    void deleteAllData();
}
