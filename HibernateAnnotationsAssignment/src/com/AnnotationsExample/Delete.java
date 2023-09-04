package com.AnnotationsExample;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Delete {

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
			Product p = new Product();
			
			p.setProductId("1");
			s.delete(p);
			tx.commit();
		
	}
			
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
    }
}

