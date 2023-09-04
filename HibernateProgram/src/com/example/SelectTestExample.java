package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectTestExample {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session s = null;
		
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("/hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			s=sf.openSession();
			Student stu =(Student)s.get("com.example.Student" ,"300");
		    if(stu==null)
		    {
		    	System.out.println("Student Not Existed");
		    }
		    	else
		    	{
		    		System.out.println("StudentDetails......");
		    		System.out.println("--------------------");
		    		System.out.println("Student ID:\t" +stu.getId());
		    		System.out.println("Student Name:\t" +stu.getName());
		    		System.out.println("Student Degree:\t" +stu.getDegree());
		    		System.out.println("Student phone:\t" +stu.getPhonenumber());
		    		System.out.println("Student Email:\t"+stu.getEmail());
		    		
		    	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
	    }
					
			
	}

}
//remove create from cfg file


