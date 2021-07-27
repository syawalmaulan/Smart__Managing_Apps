package com.example.smartmanagingapps;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface seeding_dao {

    @Query("SELECT * FROM seeding")
    List<Basic_Info_DB> getAllData();

    @Insert
    void InsertBasicInfo(seeding Seeding);

    @Query("DELETE FROM seeding ")
    void deleteAll();

    @Query("UPDATE sqlite_sequence SET seq = 0 WHERE name = 'basic_info'")
    void clearPrimaryKey();

}

