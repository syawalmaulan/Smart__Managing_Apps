package com.example.smartmanagingapps;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "basic_info")
public class Basic_Info_DB {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "name")
    private final String nameVal;

    @ColumnInfo(name = "loc")
    private String locVal;

    @ColumnInfo(name = "size")
    private int sizeVal;

    @ColumnInfo(name = "land_status")
    private boolean landStat;

    public Basic_Info_DB(String nameVal, String locVal, int sizeVal, boolean landStat) {
        this.nameVal = nameVal;
        this.locVal = locVal;
        this.sizeVal = sizeVal;
        this.landStat = landStat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameVal() {
        return nameVal;
    }

    public String getLocVal() {
        return locVal;
    }

    public void setLocVal(String locVal) {
        this.locVal = locVal;
    }

    public int getSizeVal() {
        return sizeVal;
    }

    public void setSizeVal(int sizeVal) {
        this.sizeVal = sizeVal;
    }

    public boolean isLandStat() {
        return landStat;
    }

    public void setLandStat(boolean landStat) {
        this.landStat = landStat;
    }

    @Override
    public String toString() {
        return "Basic_Info_DB{" +
                "id=" + id +
                ", nameVal='" + nameVal + '\'' +
                ", locVal='" + locVal + '\'' +
                ", sizeVal=" + sizeVal +
                ", landStat=" + landStat +
                '}';
    }
}
