package com.test;

import com.entity.Classes;
import com.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestOneToMany {
    public static void main(String[] args) {


        Classes c=new Classes();
        c.setId(5);
        c.setCname("加油");


        Student s1=new Student();
        s1.setSid("2016017");
        s1.setSname("zhang");
        s1.setCla(c);



        Student s2=new Student();
        s2.setSid("2016018");
        s2.setSname("wang");
        s2.setCla(c);


        c.getStudentset().add(s1);
        c.getStudentset().add(s2);




        StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
        StandardServiceRegistry sr=srb.configure().build();


        SessionFactory sf=new MetadataSources(sr).buildMetadata().buildSessionFactory();

        Session s=sf.openSession();
        Transaction tra=s.beginTransaction();

        s.save(c);

        tra.commit();
        s.close();
        sf.close();
    }
}
