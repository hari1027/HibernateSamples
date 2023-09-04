package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		String productId ="1";
		String companyName = "capgemini";
		String productName = "Jpa software";
		int productPrice = 10000 ;
		int quantity = 100 ;
		
		Product p = new Product();
		  p.setProductId(productId);
		  p.setCompanyName(companyName);
		  p.setProductName(productName);
		  p.setProductPrice(productPrice);
		  p.setQuantity(quantity);
		  
		  try{
				
				SessionFactory sf=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
		        Session s =sf.openSession();
		        Transaction tx=s.beginTransaction();
		        s.save(p);
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
