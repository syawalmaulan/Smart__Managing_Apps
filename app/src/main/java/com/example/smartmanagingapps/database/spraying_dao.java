package com.example.smartmanagingapps.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface spraying_dao {

    @Query("SELECT * FROM spraying_table")
    List<SeedingTable> getAllData();

    @Insert
    void InsertBasicInfo(spraying_table spraying_table);

    @Query("DELETE FROM spraying_table")
    void deleteAll();

    @Query("UPDATE sqlite_sequence SET seq = 0 WHERE name = 'spraying_table'")
    void clearPrimaryKey();
}
