package com.connection.MavenHabernateConnection;

//JPA API (standard)        Hibernate Native API
//------------------------------------------------
//EntityManager  --------> Session
//find()                 get()
//persist()              save()
//remove()               delete()
//merge()                update()


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FatchData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");

		Logger.getLogger("org.hibernate").setLevel(Level.OFF);

		SessionFactory factory = new Configuration().configure("hibernatSetting.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = sc.nextInt();
		Cart cart = session.get(Cart.class, id);
		

		if (cart != null) {
			System.out.println(cart);
		} else {
			System.out.println("Item not in cart");
		}
		transaction.commit();

		factory.close();
		session.close();
		sc.close();
	}

}
