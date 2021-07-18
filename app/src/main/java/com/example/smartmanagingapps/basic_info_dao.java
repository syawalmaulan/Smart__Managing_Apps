package com.example.smartmanagingapps;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface basic_info_dao {

    @Query("SELECT * FROM basic_info")
    List<Basic_Info_DB> getAllData();

    @Insert
    void InsertBasicInfo(Basic_Info_DB basic_info_db);

    @Query("DELETE FROM basic_info")
    void deleteAll();

}
