package com.hemanth.HibLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
//        s.setSid(557);
//        s.setSname("Hemanth");
//        s.setMobile("7396144429");
        
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
//        session.persist(s);
        s = session.get(Student.class, 557);
        tx.commit();
        System.out.println(s);
    }
}