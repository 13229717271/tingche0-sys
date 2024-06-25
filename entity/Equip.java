package com.lab.thelab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equip {
    private String eid;
    private String ename;
    private String equiprequire;
    private String equipnum;
    private String apply;
    private String applicant;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEquiprequire() {
        return equiprequire;
    }

    public void setEquiprequire(String equiprequire) {
        this.equiprequire = equiprequire;
    }

    public String getEquipnum() {
        return equipnum;
    }

    public void setEquipnum(String equipnum) {
        this.equipnum = equipnum;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
}
