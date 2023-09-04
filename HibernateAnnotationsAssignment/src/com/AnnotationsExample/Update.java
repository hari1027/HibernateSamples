package com.AnnotationsExample;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {

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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the record you want to update");
		String st = sc.next();
		
		String update1=null ;
		
		if(st.contentEquals("CompanyName") || st.contentEquals("ProductName"))
		{
			System.out.println("enter the updated value");
			 update1 = sc.next();
		}
		
		int update2=0 ;
		if(st.contentEquals("ProductPrice") || st.contentEquals("quantity"))
		{
			System.out.println("enter the updated value");
			update2 = sc.nextInt();
		}
		
		p.setProductId("100");
		p.setCompanyName(update1);
		p.setProductName("Jpasoftware");
		p.setProductPrice(10000);
		p.setQuantity(100);
		
		s.saveOrUpdate(p);
		tx.commit();
		System.out.println("Sucessfully product record updated");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
		
	}

}
