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
    private static final String KEY_SIZE = "size";
    private static final String KEY_LANDSTAT = "land_status";
    private static final String KEY_STARTFT = "time_start_FT";
    private static final String KEY_ENDFT = "time_end_FT";
    private static final String KEY_DURFT = "durationFT";
    private static final String KEY_WEIGHTFT = "weight_tractor_FT";
    private static final String KEY_COSTFT = "cost_FT";
    private static final String KEY_STARTST = "time_start_ST";
    private static final String KEY_ENDST = "time_end_ST";
    private static final String KEY_DURST = "durationST";
    private static final String KEY_WEIGHTST = "weight_tractor_ST";
    private static final String KEY_COSTST = "cost_ST";
    private static final String KEY_STARTTT = "time_start_TT";
    private static final String KEY_ENDTT = "time_end_TT";
    private static final String KEY_DURTT = "durationTT";
    private static final String KEY_WEIGHTTT = "weight_tractor_TT";
    private static final String KEY_COSTTT = "cost_TT";
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
                + KEY_SIZE + " INTEGER" + KEY_STARTFT + " INTEGER" + KEY_ENDFT + " INTEGER" + KEY_DURFT + " INTEGER"
                        + KEY_WEIGHTFT + " INTEGER"  + KEY_COSTFT + " INTEGER"  + KEY_STARTST + " INTEGER"
                        + KEY_ENDST + " INTEGER" + KEY_DURST + " INTEGER"
                        + KEY_WEIGHTST + " INTEGER"  + KEY_COSTST + " INTEGER"
                        + KEY_STARTTT + " INTEGER" + KEY_ENDTT + " INTEGER" + KEY_DURTT + " INTEGER"
                        + KEY_WEIGHTTT + " INTEGER"  + KEY_COSTTT + " INTEGER" +")";
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
        values.put(KEY_STARTFT, Integer.valueOf((String) dataList.get(4)));
        values.put(KEY_ENDFT, Integer.valueOf((String) dataList.get(5)));
        values.put(KEY_DURFT, Integer.valueOf((String) dataList.get(6)));
        values.put(KEY_WEIGHTFT, Integer.valueOf((String) dataList.get(7)));
        values.put(KEY_COSTFT, Integer.valueOf((String) dataList.get(8)));
        values.put(KEY_STARTST, Integer.valueOf((String) dataList.get(9)));
        values.put(KEY_ENDST, Integer.valueOf((String) dataList.get(10)));
        values.put(KEY_DURST, Integer.valueOf((String) dataList.get(11)));
        values.put(KEY_WEIGHTST, Integer.valueOf((String) dataList.get(12)));
        values.put(KEY_COSTST, Integer.valueOf((String) dataList.get(13)));
        values.put(KEY_STARTTT, Integer.valueOf((String) dataList.get(14)));
        values.put(KEY_ENDTT, Integer.valueOf((String) dataList.get(15)));
        values.put(KEY_DURTT, Integer.valueOf((String) dataList.get(16)));
        values.put(KEY_WEIGHTTT, Integer.valueOf((String) dataList.get(17)));
        values.put(KEY_COSTTT, Integer.valueOf((String) dataList.get(18)));

        // Inserting Row
        db.insert(TABLE_DATA_INPUT, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }
//    void addLandPrepData(int area, int p, int k , )
    void deleteSQLData(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+ TABLE_DATA_INPUT);
    }
}
