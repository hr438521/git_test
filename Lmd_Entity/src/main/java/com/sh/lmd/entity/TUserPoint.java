package com.sh.lmd.entity;

import lombok.Data;

@Data
public class TUserPoint {
    private Integer pointid;

    private Integer uid;

    private Integer total;

    private Integer currentpoint;

    public Integer getPointid() {
        return pointid;
    }

    public void setPointid(Integer pointid) {
        this.pointid = pointid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCurrentpoint() {
        return currentpoint;
    }

    public void setCurrentpoint(Integer currentpoint) {
        this.currentpoint = currentpoint;
    }
}