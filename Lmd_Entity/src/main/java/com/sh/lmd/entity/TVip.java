package com.sh.lmd.entity;

import lombok.Data;

@Data
public class TVip {
    private Integer vipid;

    private String level;

    private Integer pointv;

    private Integer reward;

    private String gift;

    private String birthgift;

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getPointv() {
        return pointv;
    }

    public void setPointv(Integer pointv) {
        this.pointv = pointv;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift == null ? null : gift.trim();
    }

    public String getBirthgift() {
        return birthgift;
    }

    public void setBirthgift(String birthgift) {
        this.birthgift = birthgift == null ? null : birthgift.trim();
    }
}