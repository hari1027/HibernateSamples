package com.AnnotationsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteEmployees {

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
			
			emp.setEmpId("122001022");
			s.delete(emp);
			tx.commit();
			System.out.println("Employee record deleted sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
			

	}

}
