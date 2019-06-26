package com.sh.lmd.entity;

import lombok.Data;

@Data
public class NType {
    private Integer id;

    private String nname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname == null ? null : nname.trim();
    }
}