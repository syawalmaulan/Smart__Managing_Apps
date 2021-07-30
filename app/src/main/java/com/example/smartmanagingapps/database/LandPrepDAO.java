package com.example.smartmanagingapps.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LandPrepDAO {

    @Query("SELECT * FROM land_prep")
    List<LandPrepTable> getAllData();

    @Insert
    long InsertLandPrepInfo(LandPrepTable landPrepTable);

    @Query("DELETE FROM land_prep")
    void deleteAll();



}
