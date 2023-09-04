package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTestExample {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session s = null;
		
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("/hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			s=sf.openSession();
			Transaction tx =s.beginTransaction();
			
			Student st = new Student();
			st.setId("cap101");
			s.delete(st);
			tx.commit();
			System.out.println("Student record deleted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
