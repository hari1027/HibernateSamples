package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		String name="Arachana" ;
		String degree="B.tech" ;
		String phonenumber= "1234509876" ;
		String email = "987abc@gmail.com";
		
		
		Student s1 = new Student();
		s1.setId("800");
		s1.setName(name);
		s1.setDegree(degree);
		s1.setPhonenumber(phonenumber);
		s1.setEmail(email);
		
		
		try{
		
		SessionFactory sf=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Session s =sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(s1);
        tx.commit();
        s.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Initial Session Factory creation failed! "+e);
			
		}
		System.out.println("Sucessfully added your data in database table");
	}
}


