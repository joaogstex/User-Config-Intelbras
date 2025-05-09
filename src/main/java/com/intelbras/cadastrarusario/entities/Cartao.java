package com.intelbras.cadastrarusario.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cartao {
    @JsonProperty("insert")
    private String insert;

    @JsonProperty("CardNo")
    private String cardNo;

    @JsonProperty("CardStatus")
    private Integer cardStatus;

    @JsonProperty("CardName")
    private String cardName;

    @JsonProperty("UserID")
    private Integer userId;

    @JsonProperty("Password")
    private Integer password;

    @JsonProperty("ValidDateStart")
    private String validDateStart;
    
    @JsonProperty("ValidDateEnd")
    private String validDateEnd; 

    public String getInsert() {
        return insert;
    }

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getValidDateStart() {
        return validDateStart;
    }

    public void setValidDateStart(String validDateStart) {
        this.validDateStart = validDateStart;
    }

    public String getValidDateEnd() {
        return validDateEnd;
    }

    public void setValidDateEnd(String validDateEnd) {
        this.validDateEnd = validDateEnd;
    }
}
