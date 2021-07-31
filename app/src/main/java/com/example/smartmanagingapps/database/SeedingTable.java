package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SeedingTable")
public class SeedingTable {
    public SeedingTable(String variety, Boolean methodInfo, int time_Start, int time_End, int durationVal, int transplanter_WT, int seed_WT, int num_of_bag, int operation_Cost, int seed_Cost, int labour_Cost) {
        this.variety = variety;
        this.methodInfo = methodInfo;
        this.time_Start = time_Start;
        this.time_End = time_End;
        this.durationVal = durationVal;
        this.transplanter_WT = transplanter_WT;
        this.seed_WT = seed_WT;
        this.num_of_bag = num_of_bag;
        this.operation_Cost = operation_Cost;
        this.seed_Cost = seed_Cost;
        this.labour_Cost = labour_Cost;
    }



    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String variety;

    @ColumnInfo
    private Boolean methodInfo;

    @ColumnInfo
    private int time_Start;

    @ColumnInfo
    private int time_End;

    @ColumnInfo
    private int durationVal;

    @ColumnInfo
    private int transplanter_WT;

    @ColumnInfo
    private int seed_WT;

    @ColumnInfo
    private int num_of_bag;

    @ColumnInfo
    private int operation_Cost;

    @ColumnInfo
    private int seed_Cost;

    @ColumnInfo
    private int labour_Cost;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Boolean getMethodInfo() {
        return methodInfo;
    }

    public void setMethodInfo(Boolean methodInfo) {
        this.methodInfo = methodInfo;
    }

    public int getTime_Start() {
        return time_Start;
    }

    public void setTime_Start(int time_Start) {
        this.time_Start = time_Start;
    }

    public int getTime_End() {
        return time_End;
    }

    public void setTime_End(int time_End) {
        this.time_End = time_End;
    }

    public int getDurationVal() {
        return durationVal;
    }

    public void setDurationVal(int durationVal) {
        this.durationVal = durationVal;
    }

    public int getTransplanter_WT() {
        return transplanter_WT;
    }

    public void setTransplanter_WT(int transplanter_WT) {
        this.transplanter_WT = transplanter_WT;
    }

    public int getSeed_WT() {
        return seed_WT;
    }

    public void setSeed_WT(int seed_WT) {
        this.seed_WT = seed_WT;
    }

    public int getNum_of_bag() {
        return num_of_bag;
    }

    public void setNum_of_bag(int num_of_bag) {
        this.num_of_bag = num_of_bag;
    }

    public int getOperation_Cost() {
        return operation_Cost;
    }

    public void setOperation_Cost(int operation_Cost) {
        this.operation_Cost = operation_Cost;
    }

    public int getSeed_Cost() {
        return seed_Cost;
    }

    public void setSeed_Cost(int seed_Cost) {
        this.seed_Cost = seed_Cost;
    }

    public int getLabour_Cost() {
        return labour_Cost;
    }

    public void setLabour_Cost(int labour_Cost) {
        this.labour_Cost = labour_Cost;
    }
}

