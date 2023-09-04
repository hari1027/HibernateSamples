package com.AnnotationsExample;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UserInput {

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
			
			System.out.println("enter how many records you needed");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the id");
				String id = sc.next();
				emp.setEmpId(id);
				
				System.out.println("enter the name");
				String name = sc.next();
				emp.setEmpName(name);
				
				System.out.println("enter the address");
				String address = sc.next();
				emp.setEmpAddress(address);
				
				System.out.println("enter the salary");
				double salary = sc.nextDouble();
				emp.setEmpsalary(salary);
				
				System.out.println("enter the phonenumber");
				String phonenumber = sc.next();
				emp.setEmpphone(phonenumber);
			
			}
				
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


