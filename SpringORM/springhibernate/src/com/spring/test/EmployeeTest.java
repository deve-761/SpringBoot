package com.spring.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.entity.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session = null;
		Transaction transaction = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("com/spring/resources/hibernate.cfg.xml");
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Employee emp=new Employee();
			emp.setEno(222);
			emp.setEname("Sudhakar");
			emp.setEsal(30000);
			emp.setEaddr("BLR");
			session.save(emp);
			transaction.commit();
			System.out.println("Employee Inserted Successfully");
			System.out.println("Transaction Success");
			
			/*
			 * Employee emp = (Employee) session.get("com.spring.entity.Employee", 111);
			 * System.out.println("Employee Detaails");
			 * System.out.println("-------------------");
			 * System.out.println("Employee Number :" + emp.getEno());
			 * System.out.println("Employee Name :" + emp.getEname());
			 * System.out.println("Employee Salary :" + emp.getEsal());
			 * System.out.println("Employee Address :" + emp.getEaddr());
			 */
		} catch (Exception e) {
           transaction.rollback();
           System.out.println("Transaction Failure");
           e.printStackTrace();
		}
	}
}
