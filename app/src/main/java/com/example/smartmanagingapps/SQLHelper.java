package com.example.smartmanagingapps;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

public class SQLHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "paddyManagement";
    private static final String TABLE_DATA_INPUT = "data_input";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_LOC = "location";
    private static final String KEY_LANDSTAT = "land_status";
    private static final String KEY_SIZE = "size";
    private static final int DATABASE_VERSION = 1 ;

    public SQLHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE =
                "CREATE TABLE " + TABLE_DATA_INPUT + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_LOC + " TEXT," + KEY_LANDSTAT + " INTEGER,"
                + KEY_SIZE + " INTEGER" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DATA_INPUT);

        // Create tables again
        onCreate(db);
    }

    void addBasicData(List dataList) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, (String) dataList.get(0)); // Contact Name
        values.put(KEY_LOC, (String) dataList.get(1)); // Contact Phone
        values.put(KEY_LANDSTAT, Integer.valueOf((String) dataList.get(2)) );
        values.put(KEY_SIZE, Integer.valueOf((String) dataList.get(3)));

        // Inserting Row
        db.insert(TABLE_DATA_INPUT, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }
}
