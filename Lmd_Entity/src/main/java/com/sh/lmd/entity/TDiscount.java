package com.sh.lmd.entity;

import lombok.Data;

import java.util.Date;
@Data
public class TDiscount {
    private Integer discountid;

    private Date usedate;

    private Integer money;

    private Integer point;

    public Integer getDiscountid() {
        return discountid;
    }

    public void setDiscountid(Integer discountid) {
        this.discountid = discountid;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}