package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "spraying_table")
public class spraying_table {
    @PrimaryKey(autoGenerate = true)
    private int id;
    //Pesticide Part
    @ColumnInfo
    private String pesticide_brand_Name;
    @ColumnInfo
    private int pesticide_volume_per_bottle;
    @ColumnInfo
    private int pesticide_volume_used;
    @ColumnInfo
    private int pesticide_area_val;
    @ColumnInfo
    private int pesticide_startTime;
    @ColumnInfo
    private int pesticide_endTime;
    @ColumnInfo
    private int pesticide_durationVal;
    @ColumnInfo
    private int pesticide_Cost;
    @ColumnInfo
    private int pesticide_labour_Cost;
    @ColumnInfo
    private int herbicide_brand_Name;
    //Herbicide Part
    @ColumnInfo
    private int herbicide_volume_per_bottle;
    @ColumnInfo
    private int herbicide_volume_used;
    @ColumnInfo
    private int herbicide_area_val;
    @ColumnInfo
    private int herbicide_startTime;
    @ColumnInfo
    private int herbicide_endTime;
    @ColumnInfo
    private int herbicide_durationVal;
    @ColumnInfo
    private int herbicide_Cost;
    @ColumnInfo
    private int herbicide_labour_Cost;
    public spraying_table(String pesticide_brand_Name, int pesticide_volume_per_bottle, int pesticide_volume_used, int pesticide_area_val, int pesticide_startTime, int pesticide_endTime, int pesticide_durationVal, int pesticide_Cost, int pesticide_labour_Cost, int herbicide_brand_Name, int herbicide_volume_per_bottle, int herbicide_volume_used, int herbicide_area_val, int herbicide_startTime, int herbicide_endTime, int herbicide_durationVal, int herbicide_Cost, int herbicide_labour_Cost) {
        this.pesticide_brand_Name = pesticide_brand_Name;
        this.pesticide_volume_per_bottle = pesticide_volume_per_bottle;
        this.pesticide_volume_used = pesticide_volume_used;
        this.pesticide_area_val = pesticide_area_val;
        this.pesticide_startTime = pesticide_startTime;
        this.pesticide_endTime = pesticide_endTime;
        this.pesticide_durationVal = pesticide_durationVal;
        this.pesticide_Cost = pesticide_Cost;
        this.pesticide_labour_Cost = pesticide_labour_Cost;
        this.herbicide_brand_Name = herbicide_brand_Name;
        this.herbicide_volume_per_bottle = herbicide_volume_per_bottle;
        this.herbicide_volume_used = herbicide_volume_used;
        this.herbicide_area_val = herbicide_area_val;
        this.herbicide_startTime = herbicide_startTime;
        this.herbicide_endTime = herbicide_endTime;
        this.herbicide_durationVal = herbicide_durationVal;
        this.herbicide_Cost = herbicide_Cost;
        this.herbicide_labour_Cost = herbicide_labour_Cost;
    }

    public String getPesticide_brand_Name() {
        return pesticide_brand_Name;
    }

    public void setPesticide_brand_Name(String pesticide_brand_Name) {
        this.pesticide_brand_Name = pesticide_brand_Name;
    }

    public int getPesticide_volume_per_bottle() {
        return pesticide_volume_per_bottle;
    }

    public void setPesticide_volume_per_bottle(int pesticide_volume_per_bottle) {
        this.pesticide_volume_per_bottle = pesticide_volume_per_bottle;
    }

    public int getPesticide_volume_used() {
        return pesticide_volume_used;
    }

    public void setPesticide_volume_used(int pesticide_volume_used) {
        this.pesticide_volume_used = pesticide_volume_used;
    }

    public int getPesticide_area_val() {
        return pesticide_area_val;
    }

    public void setPesticide_area_val(int pesticide_area_val) {
        this.pesticide_area_val = pesticide_area_val;
    }

    public int getPesticide_startTime() {
        return pesticide_startTime;
    }

    public void setPesticide_startTime(int pesticide_startTime) {
        this.pesticide_startTime = pesticide_startTime;
    }

    public int getPesticide_endTime() {
        return pesticide_endTime;
    }

    public void setPesticide_endTime(int pesticide_endTime) {
        this.pesticide_endTime = pesticide_endTime;
    }

    public int getPesticide_durationVal() {
        return pesticide_durationVal;
    }

    public void setPesticide_durationVal(int pesticide_durationVal) {
        this.pesticide_durationVal = pesticide_durationVal;
    }

    public int getPesticide_Cost() {
        return pesticide_Cost;
    }

    public void setPesticide_Cost(int pesticide_Cost) {
        this.pesticide_Cost = pesticide_Cost;
    }

    public int getPesticide_labour_Cost() {
        return pesticide_labour_Cost;
    }

    public void setPesticide_labour_Cost(int pesticide_labour_Cost) {
        this.pesticide_labour_Cost = pesticide_labour_Cost;
    }

    public int getHerbicide_brand_Name() {
        return herbicide_brand_Name;
    }

    public void setHerbicide_brand_Name(int herbicide_brand_Name) {
        this.herbicide_brand_Name = herbicide_brand_Name;
    }

    public int getHerbicide_volume_per_bottle() {
        return herbicide_volume_per_bottle;
    }

    public void setHerbicide_volume_per_bottle(int herbicide_volume_per_bottle) {
        this.herbicide_volume_per_bottle = herbicide_volume_per_bottle;
    }

    public int getHerbicide_volume_used() {
        return herbicide_volume_used;
    }

    public void setHerbicide_volume_used(int herbicide_volume_used) {
        this.herbicide_volume_used = herbicide_volume_used;
    }

    public int getHerbicide_area_val() {
        return herbicide_area_val;
    }

    public void setHerbicide_area_val(int herbicide_area_val) {
        this.herbicide_area_val = herbicide_area_val;
    }

    public int getHerbicide_startTime() {
        return herbicide_startTime;
    }

    public void setHerbicide_startTime(int herbicide_startTime) {
        this.herbicide_startTime = herbicide_startTime;
    }

    public int getHerbicide_endTime() {
        return herbicide_endTime;
    }

    public void setHerbicide_endTime(int herbicide_endTime) {
        this.herbicide_endTime = herbicide_endTime;
    }

    public int getHerbicide_durationVal() {
        return herbicide_durationVal;
    }

    public void setHerbicide_durationVal(int herbicide_durationVal) {
        this.herbicide_durationVal = herbicide_durationVal;
    }

    public int getHerbicide_Cost() {
        return herbicide_Cost;
    }

    public void setHerbicide_Cost(int herbicide_Cost) {
        this.herbicide_Cost = herbicide_Cost;
    }

    public int getHerbicide_labour_Cost() {
        return herbicide_labour_Cost;
    }

    public void setHerbicide_labour_Cost(int herbicide_labour_Cost) {
        this.herbicide_labour_Cost = herbicide_labour_Cost;
    }
}
