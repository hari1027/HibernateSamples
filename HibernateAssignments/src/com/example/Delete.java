package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

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
				p.setProductId("1");
				s.delete(p);
				tx.commit();
				System.out.println("product record deleted sucessfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}


	}

}
