package com.intelbras.cadastrarusario.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioCount {
    @JsonProperty("AccessUserInfo")
    private String accessUserInfo;
    @JsonProperty("AccessControlCard")
    private Integer accessControlCard;
    @JsonProperty("count")
    private Integer count;

    public String getAccessUserInfo() {
        return accessUserInfo;
    }

    public void setAccessUserInfo(String accessUserInfo) {
        this.accessUserInfo = accessUserInfo;
    }

    public Integer getAccessControlCard() {
        return accessControlCard;
    }

    public void setAccessControlCard(Integer accessControlCard) {
        this.accessControlCard = accessControlCard;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    } 
}
