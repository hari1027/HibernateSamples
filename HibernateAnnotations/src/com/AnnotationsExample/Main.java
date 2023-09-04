package com.AnnotationsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=null;
		Session s=null;
		
		try
		{
			AnnotationConfiguration cfg= new AnnotationConfiguration();
			cfg.configure("/hibernate.cfg.xml");
			sf=cfg.buildSessionFactory();
			s=sf.openSession();
			Transaction tx=s.beginTransaction();
			Employees emp = new Employees();
			emp.setEmpId("122001021");
			emp.setEmpName("hari");
			emp.setEmpAddress("chennai");
			emp.setEmpsalary(40000.00);
			
			s.save(emp);
			tx.commit();
			System.out.println("Sucessfully Employee record Inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
