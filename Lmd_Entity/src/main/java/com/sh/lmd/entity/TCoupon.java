package com.sh.lmd.entity;

import lombok.Data;

import java.util.Date;
@Data
public class TCoupon {
    private Integer cid;

    private Integer uid;

    private Integer status;

    private Date createtime;

    private Date endtime;

    private Integer minmoney;

    private Integer money;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(Integer minmoney) {
        this.minmoney = minmoney;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}