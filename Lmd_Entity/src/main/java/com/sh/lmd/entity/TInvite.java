package com.sh.lmd.entity;

import lombok.Data;

@Data
public class TInvite {
    private Integer inviteid;

    private Integer uid;

    private Integer reward;

    private Integer num;

    public Integer getInviteid() {
        return inviteid;
    }

    public void setInviteid(Integer inviteid) {
        this.inviteid = inviteid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}