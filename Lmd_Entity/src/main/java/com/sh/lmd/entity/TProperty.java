package com.sh.lmd.entity;

import lombok.Data;

@Data
public class TProperty {
    private Integer propertyid;

    private Integer total;

    private Integer currbalance;

    private Integer uid;

    public Integer getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrbalance() {
        return currbalance;
    }

    public void setCurrbalance(Integer currbalance) {
        this.currbalance = currbalance;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}