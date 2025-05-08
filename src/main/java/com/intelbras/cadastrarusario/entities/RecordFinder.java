package com.intelbras.cadastrarusario.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordFinder {
    @JsonProperty("doSeekFind")
    private String doSeekFind;
    @JsonProperty("accessControlCard")
    private Integer accessControlCard;
    @JsonProperty("count")
    private Integer count;

    public String getDoSeekFind() {
        return doSeekFind;
    }

    public void setDoSeekFind(String doSeekFind) {
        this.doSeekFind = doSeekFind;
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
