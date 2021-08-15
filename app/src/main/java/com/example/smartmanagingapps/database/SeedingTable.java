package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SeedingTable")
public class SeedingTable {
    public SeedingTable(String variety, Boolean methodInfo, int time_Start, int time_End, int durationVal, int transplanter_WT, int seed_WT, int num_of_bag, int operation_Cost, int seed_Cost, int labour_Cost) {
        this.methodInfo = methodInfo;
        this.varietySd = varietySd;
        this.time_StartSd = time_StartSd;
        this.time_EndSd = time_EndSd;
        this.dateSd = dateSd;
        this.machineSd = machineSd;
        this.labourSd = labourSd;
        this.inputSd = inputSd;
        this.costlabourSd = costlabourSd;
        this.costseedSd = costseedSd;
    }



    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String varietySd;

    @ColumnInfo
    private Boolean methodInfo;

    @ColumnInfo
    private int time_StartSd;

    @ColumnInfo
    private int time_EndSd;

    @ColumnInfo
    private int dateSd;

    @ColumnInfo
    private String machineSd;

    @ColumnInfo
    private int inputSd;

    @ColumnInfo
    private int labourSd;

    @ColumnInfo
    private int costlabourSd;

    @ColumnInfo
    private int costseedSd;

    public SeedingTable(String varietySd, boolean methodSd, int time_EndSd, int time_StartSd, String machineSd, int labourSd, int dateSd, int costlabourSd, int costseedSd) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVarietySd() {
        return varietySd;
    }

    public void setVarietySd(String varietySd) {
        this.varietySd = varietySd;
    }

    public Boolean getMethodInfo() {
        return methodInfo;
    }

    public void setMethodInfo(Boolean methodInfo) {
        this.methodInfo = methodInfo;
    }

    public int getTime_StartSd() {
        return time_StartSd;
    }

    public void setTime_StartSd(int time_StartSd) {
        this.time_StartSd = time_StartSd;
    }

    public int getTime_EndSd() {
        return time_EndSd;
    }

    public void setTime_EndSd(int time_EndSd) {
        this.time_EndSd = time_EndSd;
    }

    public int getDateSd() {
        return dateSd;
    }

    public void setDateSd(int dateSd) {
        this.dateSd = dateSd;
    }

    public String getMachineSd() { return machineSd; }

    public void setMachineSd(String machineSd) { this.machineSd = machineSd; }

    public int getInputSd() {
        return inputSd;
    }

    public void setInputSd(int inputSd) {
        this.inputSd = inputSd;
    }

    public int getLabourSd() {
        return labourSd;
    }

    public void setLabourSd(int labourSd) {
        this.labourSd = labourSd;
    }

    public int getCostlabourSd() {
        return costlabourSd;
    }

    public void setCostlabourSd(int costlabourSd) {
        this.costlabourSd = costlabourSd;
    }

    public int getCostseedSd() {
        return costseedSd;
    }

    public void setCostseedSd(int costseedSd) {
        this.costseedSd = costseedSd;
    }


}

