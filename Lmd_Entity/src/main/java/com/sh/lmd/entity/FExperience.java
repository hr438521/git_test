package com.sh.lmd.entity;

import lombok.Data;

import java.util.Date;

@Data
public class FExperience {
    private Integer eid;

    private String etitle;

    private String econtext;

    private Date etime;

    private Integer user;

    private Date lasttime;

    private Integer etype;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEtitle() {
        return etitle;
    }

    public void setEtitle(String etitle) {
        this.etitle = etitle == null ? null : etitle.trim();
    }

    public String getEcontext() {
        return econtext;
    }

    public void setEcontext(String econtext) {
        this.econtext = econtext == null ? null : econtext.trim();
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public Integer getEtype() {
        return etype;
    }

    public void setEtype(Integer etype) {
        this.etype = etype;
    }
}