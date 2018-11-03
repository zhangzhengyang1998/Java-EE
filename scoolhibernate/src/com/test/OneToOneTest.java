package com.test;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class OneToOneTest {
    public static void main(String[] args) {


    StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
        StandardServiceRegistry sr = srb.configure().build();
        SessionFactory sf;
         sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();


        Session s=sf.openSession();
    Transaction tra=s.beginTransaction();
//        String hql="from User  where username=:name";
//        Query q=s.createQuery(hql);
//        q.setParameter("name","zhangsan");
//       User u=(User) q.uniqueResult();
      String sql="select * from usertable";
        NativeQuery q = s.createNativeQuery(sql, User.class);

        List<User> list=q.list();
        for(User u:list){
            System.out.print(u.getPass());
            System.out.print("\n");
        }
        tra.commit();
        s.close();
        sf.close();



    }
}
