package com.intelbras.cadastrarusario.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioInfo {

    @JsonProperty("Authority")
    private int authority;

    @JsonProperty("CitizenIDNo")
    private String citizenIDNo;

    @JsonProperty("Doors[0]")
    private int door0;

    @JsonProperty("FirstEnterDoors[0]")
    private int firstEnterDoor0;

    @JsonProperty("FirstEnterDoors[1]")
    private int firstEnterDoor1;

    @JsonProperty("IsFirstEnter")
    private boolean isFirstEnter;

    @JsonProperty("Password")
    private String password;

    @JsonProperty("SpecialDaysSchedule[0]")
    private int specialDaysSchedule;

    @JsonProperty("TimeSections[0]")
    private int timeSection;

    @JsonProperty("UseTime")
    private int useTime;

    @JsonProperty("UserID")
    private int userID;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("UserStatus")
    private int userStatus;

    @JsonProperty("UserType")
    private int userType;

    @JsonProperty("VTOPosition")
    private String vtoPosition;

    @JsonProperty("ValidFrom")
    private String validFrom;

    @JsonProperty("ValidTo")
    private String validTo;

    // Getters e Setters

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public String getCitizenIDNo() {
        return citizenIDNo;
    }

    public void setCitizenIDNo(String citizenIDNo) {
        this.citizenIDNo = citizenIDNo;
    }

    public int getDoor0() {
        return door0;
    }

    public void setDoor0(int door0) {
        this.door0 = door0;
    }

    public int getFirstEnterDoor0() {
        return firstEnterDoor0;
    }

    public void setFirstEnterDoor0(int firstEnterDoor0) {
        this.firstEnterDoor0 = firstEnterDoor0;
    }

    public int getFirstEnterDoor1() {
        return firstEnterDoor1;
    }

    public void setFirstEnterDoor1(int firstEnterDoor1) {
        this.firstEnterDoor1 = firstEnterDoor1;
    }

    public boolean isFirstEnter() {
        return isFirstEnter;
    }

    public void setFirstEnter(boolean isFirstEnter) {
        this.isFirstEnter = isFirstEnter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSpecialDaysSchedule() {
        return specialDaysSchedule;
    }

    public void setSpecialDaysSchedule(int specialDaysSchedule) {
        this.specialDaysSchedule = specialDaysSchedule;
    }

    public int getTimeSection() {
        return timeSection;
    }

    public void setTimeSection(int timeSection) {
        this.timeSection = timeSection;
    }

    public int getUseTime() {
        return useTime;
    }

    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getVtoPosition() {
        return vtoPosition;
    }

    public void setVtoPosition(String vtoPosition) {
        this.vtoPosition = vtoPosition;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}
