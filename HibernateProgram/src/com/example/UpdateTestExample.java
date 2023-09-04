package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTestExample {


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
				
				Student stu = new Student();
				stu.setId("200");
				stu.setName("capgemini");
				stu.setDegree("undergraduate");
				stu.setPhonenumber("77777");
				stu.setEmail("capgemini@gamil.com");
				
				s.saveOrUpdate(stu);
				tx.commit();
				System.out.println("Student updated sucessfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				

	}

}
