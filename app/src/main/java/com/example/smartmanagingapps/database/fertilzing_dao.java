package com.example.smartmanagingapps.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface fertilzing_dao {

    @Query("SELECT * FROM fertilzing_Table")
    List<fertilzing_Table> getAllData();

    @Query("SELECT * FROM fertilizingTable WHERE id =:id")
    fertilzing_Table getRowDataById(int id);

    @Insert
    void insertFertilizingData (fertilzing_Table fertilzing_table);

    @Update
    void updateFertilizingData (fertilzing_Table fertilzing_table);

    @Query("DELETE FROM fertilizingTable")
    void deleteAllData();
}
