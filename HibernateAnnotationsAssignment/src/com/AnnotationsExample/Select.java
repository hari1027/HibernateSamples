package com.AnnotationsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.AnnotationsExample.Product;

public class Select {

	public static void main(String[] args) {
			SessionFactory sf = null;
			Session s = null;
			
			try
			{
				Configuration cfg=new Configuration();
				cfg.configure("/hibernate.cfg.xml");
				sf = cfg.buildSessionFactory();
				s=sf.openSession();
				Product p =(Product)s.get("com.AnnotationsExample.Product" ,"100");
				Product p2 =(Product)s.get("com.AnnotationsExample.Product","200");
				   if(p==null)
				    {
				    	System.out.println("Product Not Existed");
				    }
				   else
				   {
					   System.out.println("Product Details");
					   System.out.println("--------------------");
					   System.out.println("ProductId:\t" + p.getProductId());
					   System.out.println("CompanyName:\t" + p.getCompanyName());
					   System.out.println("ProductName:\t" + p.getProductName());
					   System.out.println("ProductPrice:\t" + p.getProductPrice());
					   System.out.println("Quantity:\t" + p.getQuantity());
					   
				   }
				   if(p2==null)
				    {
				    	System.out.println("Product Not Existed");
				    }
				   else
				   {
					   System.out.println("Product Details");
					   System.out.println("--------------------");
					   System.out.println("ProductId:\t" + p2.getProductId());
					   System.out.println("CompanyName:\t" + p2.getCompanyName());
					   System.out.println("ProductName:\t" + p2.getProductName());
					   System.out.println("ProductPrice:\t" + p2.getProductPrice());
					   System.out.println("Quantity:\t" + p2.getQuantity());
					   
				   }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


	}

}
