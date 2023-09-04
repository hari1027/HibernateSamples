package com.AnnotationsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateEmployees {

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
		
		emp.setEmpId("122001026");
		emp.setEmpName("venky");
		emp.setEmpphone("9225858044");
		emp.setEmpsalary(50000);
		emp.setEmpAddress("madurai");
		s.saveOrUpdate(emp);
		tx.commit();
		System.out.println("Sucessfully Employee record updated");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}


	}

}
