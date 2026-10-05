package com.connection.MavenHabernateConnection;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id");
		 SessionFactory factory = new Configuration().configure("hibernatSetting.cfg.xml").buildSessionFactory();
		 
		 Session session = factory.openSession();
		 
		 Transaction transaction = session.beginTransaction();
		 
		 int id = sc.nextInt();
		 Cart cart = session.get(Cart.class, id);
		 System.out.println("Enter the brandName");
		 String bName = sc.next();
		 if(cart != null) {
			 cart.setBrandName(bName);
//			 session.update(cart);
			 session.saveOrUpdate(cart);
		 }else {
			 System.out.println("Invalid ID");
		 }
		
		 transaction.commit();
		 
		 factory.close();
		 session.close();
		 sc.close();
	}
}
