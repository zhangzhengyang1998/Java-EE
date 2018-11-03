package com.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


//@Entity
//@Table(name = "班级表")
public class Classes {

    private int id;
    private String cname;
    private Set  studentset=new HashSet<Student>();
    private Student st;

    //@Column
    @OneToMany(mappedBy = "班级表",targetEntity = Student.class,cascade =CascadeType.ALL)
    public Set getStudentset() {
        return studentset;
    }

    public void setStudentset(Set studentset) {
        this.studentset = studentset;

    }


    //@Id
    //@GenericGenerator(name = "myincre",strategy = "increment")
    //@GeneratedValue(generator = "myincre")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   // @Column
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
}
