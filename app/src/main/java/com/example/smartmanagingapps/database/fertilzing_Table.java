package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fertilizingTable")
public class fertilzing_Table {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private int weightVal;
    @ColumnInfo
    private int num_of_bag;
    @ColumnInfo
    private int areaVal;
    @ColumnInfo
    private int nitrogenVal;
    @ColumnInfo
    private int phosphorusVal;
    @ColumnInfo
    private int potassiumVal;
    @ColumnInfo
    private int startTime;
    @ColumnInfo
    private int endTime;
    @ColumnInfo
    private int durationVal;
    @ColumnInfo
    private int pesticide_Cost;
    @ColumnInfo
    private int labour_Cost;

    public fertilzing_Table(int weightVal, int num_of_bag, int areaVal, int nitrogenVal, int phosphorusVal, int potassiumVal, int startTime, int endTime, int durationVal, int pesticide_Cost, int labour_Cost) {
        this.weightVal = weightVal;
        this.num_of_bag = num_of_bag;
        this.areaVal = areaVal;
        this.nitrogenVal = nitrogenVal;
        this.phosphorusVal = phosphorusVal;
        this.potassiumVal = potassiumVal;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationVal = durationVal;
        this.pesticide_Cost = pesticide_Cost;
        this.labour_Cost = labour_Cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeightVal() {
        return weightVal;
    }

    public void setWeightVal(int weightVal) {
        this.weightVal = weightVal;
    }

    public int getNum_of_bag() {
        return num_of_bag;
    }

    public void setNum_of_bag(int num_of_bag) {
        this.num_of_bag = num_of_bag;
    }

    public int getAreaVal() {
        return areaVal;
    }

    public void setAreaVal(int areaVal) {
        this.areaVal = areaVal;
    }

    public int getNitrogenVal() {
        return nitrogenVal;
    }

    public void setNitrogenVal(int nitrogenVal) {
        this.nitrogenVal = nitrogenVal;
    }

    public int getPhosphorusVal() {
        return phosphorusVal;
    }

    public void setPhosphorusVal(int phosphorusVal) {
        this.phosphorusVal = phosphorusVal;
    }

    public int getPotassiumVal() {
        return potassiumVal;
    }

    public void setPotassiumVal(int potassiumVal) {
        this.potassiumVal = potassiumVal;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getDurationVal() {
        return durationVal;
    }

    public void setDurationVal(int durationVal) {
        this.durationVal = durationVal;
    }

    public int getPesticide_Cost() {
        return pesticide_Cost;
    }

    public void setPesticide_Cost(int pesticide_Cost) {
        this.pesticide_Cost = pesticide_Cost;
    }

    public int getLabour_Cost() {
        return labour_Cost;
    }

    public void setLabour_Cost(int labour_Cost) {
        this.labour_Cost = labour_Cost;
    }
}
