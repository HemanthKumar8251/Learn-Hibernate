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
        s.setSid(524);
        s.setSname("Uday");
        s.setMobile("9888573884");
        
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();
    }
}
