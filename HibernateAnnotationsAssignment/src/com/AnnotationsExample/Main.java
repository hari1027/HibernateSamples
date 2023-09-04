package com.AnnotationsExample;

import java.util.Scanner;

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
				
				
				
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("enter No.of records you want");
				int n = sc.nextInt();
				
				for(int i=0;i<n;i++)
				{
					
				Transaction tx=s.beginTransaction();
				Product p = new Product();
				System.out.println("enter the productId");
				String id = sc.next();
				p.setProductId(id);
					
				System.out.println("enter the companyName");
				String companyName = sc.next();
				p.setCompanyName(companyName);
				
				System.out.println("enter the productName");
				String productName = sc.next();
				p.setProductName(productName);
				
				System.out.println("enter the productPrice");
				int productPrice = sc.nextInt();
				p.setProductPrice(productPrice);
				
				System.out.println("enter the No.Of quantity");
				int quantity = sc.nextInt();
				p.setQuantity(quantity);
				

				  s.save(p);
					tx.commit();
					System.out.println("Sucessfully product record Inserted");
				}	
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}

					
					
		}
				

	}


