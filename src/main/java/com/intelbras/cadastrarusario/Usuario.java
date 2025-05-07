package com.intelbras.cadastrarusario;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Usuario {

    @JsonProperty("UserID")
    private String userID;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("UserType")
    private Integer userType;

    @JsonProperty("UseTime")
    private Integer useTime;

    @JsonProperty("Password")
    private String password; 

    @JsonProperty("Authority")
    private Integer authority;

    @JsonProperty("Doors")
    private List<Integer> doors; 

    @JsonProperty("TimeSections")
    private List<Integer> timeSections; 

    @JsonProperty("ValidFrom")
    private String validFrom;

    @JsonProperty("ValidTo")
    private String validTo;

    @JsonProperty("SpecialDaysSchedule")
    private List<Integer> specialDaysSchedule; 

    @JsonProperty("UserStatus")
    private Integer userStatus; 

    public Usuario() {}

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public List<Integer> getDoors() {
        return doors;
    }

    public void setDoors(List<Integer> doors) {
        this.doors = doors;
    }

    public List<Integer> getTimeSections() {
        return timeSections;
    }

    public void setTimeSections(List<Integer> timeSections) {
        this.timeSections = timeSections;
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

    public List<Integer> getSpecialDaysSchedule() {
        return specialDaysSchedule;
    }

    public void setSpecialDaysSchedule(List<Integer> specialDaysSchedule) {
        this.specialDaysSchedule = specialDaysSchedule;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
