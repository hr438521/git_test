package com.sh.lmd.entity;

import lombok.Data;

@Data
public class TInvi_detail {
    private Integer invdetail;

    private Integer inviteid;

    private Integer fuid;

    private Integer reward;

    public Integer getInvdetail() {
        return invdetail;
    }

    public void setInvdetail(Integer invdetail) {
        this.invdetail = invdetail;
    }

    public Integer getInviteid() {
        return inviteid;
    }

    public void setInviteid(Integer inviteid) {
        this.inviteid = inviteid;
    }

    public Integer getFuid() {
        return fuid;
    }

    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }
}