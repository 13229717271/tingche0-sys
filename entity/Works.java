package com.lab.thelab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Works {
    private Integer id;
    private String worknum;
    private Integer fid;
    private String wcont;
    private String gtime;
    private String week;
    private String wtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorknum() {
        return worknum;
    }

    public void setWorknum(String worknum) {
        this.worknum = worknum;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getWcont() {
        return wcont;
    }

    public void setWcont(String wcont) {
        this.wcont = wcont;
    }

    public String getGtime() {
        return gtime;
    }

    public void setGtime(String gtime) {
        this.gtime = gtime;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getWtime() {
        return wtime;
    }

    public void setWtime(String wtime) {
        this.wtime = wtime;
    }
}
