package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "land_prep")
public class LandPrepTable {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public LandPrepTable(int time_Start_FT, int time_End_FT, int date_FT, int labour_FT, int machine_FT,  int cost_FT, int time_Start_ST, int time_End_ST,  int date_ST, int labour_ST, int machine_ST, int cost_ST, int time_Start_TT, int time_End_TT,  int date_TT, int labour_TT, int machine_TT,int cost_TT) {
        this.time_Start_FT = time_Start_FT;
        this.time_End_FT = time_End_FT;
        this.date_FT = date_FT;
        this.machine_FT = machine_FT;
        this.labour_FT = labour_FT;
        this.cost_FT = cost_FT;
        this.time_Start_ST = time_Start_ST;
        this.time_End_ST = time_End_ST;
        this.date_ST = date_ST;
        this.machine_ST = machine_ST;
        this.labour_ST = labour_ST;
        this.cost_ST = cost_ST;
        this.time_Start_TT = time_Start_TT;
        this.time_End_TT = time_End_TT;
        this.date_TT = date_TT;
        this.machine_TT = machine_TT;
        this.labour_TT = labour_TT;
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

    public int getDate_FT() {
        return date_FT;
    }

    public void setDate_FT(int date_FT) {
        this.date_FT = date_FT;
    }

    public int getMachine_FT() {
        return machine_FT;
    }

    public void setMachine_FT(int machine_FT) { this.machine_FT = machine_FT; }

    public int getLabour_FT() {
        return labour_FT;
    }

    public void setLabour_FT(int labour_FT) { this.labour_FT = labour_FT; }

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

    public int getDate_ST() {
        return date_ST;
    }

    public void setDate_ST(int date_ST) {
        this.date_ST = date_ST;
    }

    public int getMachine_ST() {
        return machine_ST;
    }

    public void setMachine_ST(int machine_ST) { this.machine_ST = machine_ST; }

    public int getLabour_ST() {
        return labour_ST;
    }

    public void setLabour_ST(int labour_ST) { this.labour_ST = labour_ST; }

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

    public int getDate_TT() {
        return date_TT;
    }

    public void setDate_TT(int date_TT) {
        this.date_TT = date_TT;
    }

    public int getMachine_TT() {
        return machine_TT;
    }

    public void setMachine_TT(int machine_TT) { this.machine_TT = machine_TT; }

    public int getLabour_TT() {
        return labour_TT;
    }

    public void setLabour_TT(int labour_TT) { this.labour_TT = labour_TT; }

    public int getCost_TT() { return cost_TT; }

    public void setCost_TT(int cost_TT) { this.cost_TT = cost_TT; }

    @ColumnInfo
    private int time_Start_FT;

    @ColumnInfo
    private int time_End_FT;

    @ColumnInfo
    private int date_FT;

    @ColumnInfo
    private int machine_FT;

    @ColumnInfo
    private int labour_FT;

    @ColumnInfo
    private int cost_FT;

    @ColumnInfo
    private int time_Start_ST;

    @ColumnInfo
    private int time_End_ST;

    @ColumnInfo
    private int date_ST;

    @ColumnInfo
    private int machine_ST;

    @ColumnInfo
    private int labour_ST;

    @ColumnInfo
    private int cost_ST;

    @ColumnInfo
    private int time_Start_TT;

    @ColumnInfo
    private int time_End_TT;

    @ColumnInfo
    private int date_TT;

    @ColumnInfo
    private int machine_TT;

    @ColumnInfo
    private int labour_TT;

    @ColumnInfo
    private int cost_TT;


}
