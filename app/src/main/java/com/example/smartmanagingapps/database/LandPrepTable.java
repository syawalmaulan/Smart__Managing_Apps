package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "land_prep")
public class LandPrepTable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public LandPrepTable(int time_Start_FT, int time_End_FT, int durationVal_FT, int weight_FT, int cost_FT, int time_Start_ST, int time_End_ST, int durationVal_ST, int weight_ST, int cost_ST, int time_Start_TT, int time_End_TT, int durationVal_TT, int weight_TT, int cost_TT) {
        this.time_Start_FT = time_Start_FT;
        this.time_End_FT = time_End_FT;
        this.durationVal_FT = durationVal_FT;
        this.weight_FT = weight_FT;
        this.cost_FT = cost_FT;
        this.time_Start_ST = time_Start_ST;
        this.time_End_ST = time_End_ST;
        this.durationVal_ST = durationVal_ST;
        this.weight_ST = weight_ST;
        this.cost_ST = cost_ST;
        this.time_Start_TT = time_Start_TT;
        this.time_End_TT = time_End_TT;
        this.durationVal_TT = durationVal_TT;
        this.weight_TT = weight_TT;
        this.cost_TT = cost_TT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime_Start_FT() {
        return time_Start_FT;
    }

    public void setTime_Start_FT(int time_Start_FT) {
        this.time_Start_FT = time_Start_FT;
    }

    public int getTime_End_FT() {
        return time_End_FT;
    }

    public void setTime_End_FT(int time_End_FT) {
        this.time_End_FT = time_End_FT;
    }

    public int getDurationVal_FT() {
        return durationVal_FT;
    }

    public void setDurationVal_FT(int durationVal_FT) {
        this.durationVal_FT = durationVal_FT;
    }

    public int getWeight_FT() {
        return weight_FT;
    }

    public void setWeight_FT(int weight_FT) {
        this.weight_FT = weight_FT;
    }

    public int getCost_FT() {
        return cost_FT;
    }

    public void setCost_FT(int cost_FT) {
        this.cost_FT = cost_FT;
    }

    public int getTime_Start_ST() {
        return time_Start_ST;
    }

    public void setTime_Start_ST(int time_Start_ST) {
        this.time_Start_ST = time_Start_ST;
    }

    public int getTime_End_ST() {
        return time_End_ST;
    }

    public void setTime_End_ST(int time_End_ST) {
        this.time_End_ST = time_End_ST;
    }

    public int getDurationVal_ST() {
        return durationVal_ST;
    }

    public void setDurationVal_ST(int durationVal_ST) {
        this.durationVal_ST = durationVal_ST;
    }

    public int getWeight_ST() {
        return weight_ST;
    }

    public void setWeight_ST(int weight_ST) {
        this.weight_ST = weight_ST;
    }

    public int getCost_ST() {
        return cost_ST;
    }

    public void setCost_ST(int cost_ST) {
        this.cost_ST = cost_ST;
    }

    public int getTime_Start_TT() {
        return time_Start_TT;
    }

    public void setTime_Start_TT(int time_Start_TT) {
        this.time_Start_TT = time_Start_TT;
    }

    public int getTime_End_TT() {
        return time_End_TT;
    }

    public void setTime_End_TT(int time_End_TT) {
        this.time_End_TT = time_End_TT;
    }

    public int getDurationVal_TT() {
        return durationVal_TT;
    }

    public void setDurationVal_TT(int durationVal_TT) {
        this.durationVal_TT = durationVal_TT;
    }

    public int getWeight_TT() {
        return weight_TT;
    }

    public void setWeight_TT(int weight_TT) {
        this.weight_TT = weight_TT;
    }

    public int getCost_TT() {
        return cost_TT;
    }

    public void setCost_TT(int cost_TT) {
        this.cost_TT = cost_TT;
    }

    @ColumnInfo
    private int time_Start_FT;

    @ColumnInfo
    private int time_End_FT;

    @ColumnInfo
    private int durationVal_FT;

    @ColumnInfo
    private int weight_FT;

    @ColumnInfo
    private int cost_FT;

    @ColumnInfo
    private int time_Start_ST;

    @ColumnInfo
    private int time_End_ST;

    @ColumnInfo
    private int durationVal_ST;

    @ColumnInfo
    private int weight_ST;

    @ColumnInfo
    private int cost_ST;

    @ColumnInfo
    private int time_Start_TT;

    @ColumnInfo
    private int time_End_TT;

    @ColumnInfo
    private int durationVal_TT;

    @ColumnInfo
    private int weight_TT;

    @ColumnInfo
    private int cost_TT;


}
