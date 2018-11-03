package com.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
//@Table(name = "学生表")
public class Student {
    private String sid;
    private String sname;
    private Classes cla;


//    @ManyToOne
//    @JoinColumn(name = "班级")
    public Classes getCla() {
        return cla;
    }

    public void setCla(Classes cla) {
        this.cla = cla;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
