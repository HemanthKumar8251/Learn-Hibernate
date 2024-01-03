package com.hemanth.HibLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		StudentName sname = new StudentName();
    	sname.setFname("Hemanth");
    	sname.setMname("Kumar");
    	sname.setLname("Gurubelli");
		Laptop lappy = new Laptop(101, "Acer Aspire 7");
		Student s = new Student(557, sname, "8919618071", lappy);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(s);
		session.persist(lappy);
//        s = session.get(Student.class, 557);
		tx.commit();
//        System.out.println(s); 
	}
}