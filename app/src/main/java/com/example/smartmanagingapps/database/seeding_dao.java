package com.example.smartmanagingapps.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface seeding_dao {

    @Query("SELECT * FROM SeedingTable")
    List<SeedingTable> getAllData();

    @Insert
    void InsertBasicInfo(SeedingTable seedingTable);

    @Query("DELETE FROM SeedingTable")
    void deleteAll();

    @Query("UPDATE sqlite_sequence SET seq = 0 WHERE name = 'SeedingTable'")
    void clearPrimaryKey();

    @Query("SELECT * FROM SeedingTable WHERE id = :id")
    SeedingTable getRowDataById(int id);

}

