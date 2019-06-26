package com.sh.lmd.entity;

import lombok.Data;

import java.util.Date;
@Data
public class TUxu {
    private Integer uxuserviceid;

    private Integer rate;

    private Integer minmoney;

    private Date createdate;

    private Date enddate;

    private Integer uid;

    private Integer holdingmoney;

    private Integer servicenumber;

    private Integer lendingmoney;

    private Integer count;

    public Integer getUxuserviceid() {
        return uxuserviceid;
    }

    public void setUxuserviceid(Integer uxuserviceid) {
        this.uxuserviceid = uxuserviceid;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(Integer minmoney) {
        this.minmoney = minmoney;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getHoldingmoney() {
        return holdingmoney;
    }

    public void setHoldingmoney(Integer holdingmoney) {
        this.holdingmoney = holdingmoney;
    }

    public Integer getServicenumber() {
        return servicenumber;
    }

    public void setServicenumber(Integer servicenumber) {
        this.servicenumber = servicenumber;
    }

    public Integer getLendingmoney() {
        return lendingmoney;
    }

    public void setLendingmoney(Integer lendingmoney) {
        this.lendingmoney = lendingmoney;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}