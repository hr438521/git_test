package com.sh.lmd.entity;

import lombok.Data;

import java.util.Date;
@Data
public class FWelfare {
    private Integer wid;

    private String wtitle;

    private String wcontext;

    private Date wtime;

    private String user;

    private Date lasttime;

    private Integer wtype;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWtitle() {
        return wtitle;
    }

    public void setWtitle(String wtitle) {
        this.wtitle = wtitle == null ? null : wtitle.trim();
    }

    public String getWcontext() {
        return wcontext;
    }

    public void setWcontext(String wcontext) {
        this.wcontext = wcontext == null ? null : wcontext.trim();
    }

    public Date getWtime() {
        return wtime;
    }

    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public Integer getWtype() {
        return wtype;
    }

    public void setWtype(Integer wtype) {
        this.wtype = wtype;
    }
}