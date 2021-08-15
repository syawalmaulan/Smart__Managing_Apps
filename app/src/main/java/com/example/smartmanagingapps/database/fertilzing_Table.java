package com.example.smartmanagingapps.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fertilizingTable")
public class fertilzing_Table {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String brandF;

    @ColumnInfo
    private int time_StartF;

    @ColumnInfo
    private int time_EndF;

    @ColumnInfo
    private int dateF;

    @ColumnInfo
    private String machineF;

    @ColumnInfo
    private int inputF;

    @ColumnInfo
    private int labourF;

    @ColumnInfo
    private int costlabourF;

    @ColumnInfo
    private int costfertilizerF;

    public fertilzing_Table(String varietyF, int time_StartF, int time_EndF, String machineF, int labourF, int dateF, int costlabourF, int costseedF) {
        this.brandF = brandF;
        this.time_StartF= time_StartF;
        this.time_EndF = time_EndF;
        this.dateF = dateF;
        this.machineF = machineF;
        this.labourF = labourF;
        this.inputF = inputF;
        this.costlabourF = costlabourF;
        this.costfertilizerF = costfertilizerF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandF() {
        return brandF;
    }

    public void setBrandF(String varietySd) {
        this.brandF = brandF;
    }

    public int getTime_StartF() {
        return time_StartF;
    }

    public void setTime_StartF(int time_StartF) {
        this.time_StartF = time_StartF;
    }

    public int getTime_EndF() {
        return time_EndF;
    }

    public void setTime_EndF(int time_EndF) {
        this.time_EndF = time_EndF;
    }

    public int getDateF() {
        return dateF;
    }

    public void setDateF(int dateF) {
        this.dateF = dateF;
    }

    public String getMachineF() { return machineF; }

    public void setMachineF(String machineF) { this.machineF = machineF; }

    public int getInputF() {
        return inputF;
    }

    public void setInputF(int inputF) {
        this.inputF = inputF;
    }

    public int getLabourF() {
        return labourF;
    }

    public void setLabourF(int labourSd) { this.labourF = labourF; }

    public int getCostlabourF() {
        return costlabourF;
    }

    public void setCostlabourF(int costlabourF) {
        this.costlabourF = costlabourF;
    }

    public int getCostfertilizerF() {
        return costfertilizerF;
    }

    public void setCostfertilizerF(int costfertilizerF) {
        this.costfertilizerF = costfertilizerF;
    }

}
