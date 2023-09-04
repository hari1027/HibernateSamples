package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

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
			
			Product p = new Product();
			
			p.setProductId("2");
			p.setCompanyName("cagemini");
			p.setProductName("react software");
			p.setProductPrice(15000);
			p.setQuantity(500);
			
			
			s.saveOrUpdate(p);
			tx.commit();
			System.out.println("Product updated sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
			

	}

}
