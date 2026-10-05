package com.connection.MavenHabernateConnection;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to remove the data");
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);

		SessionFactory factory = new Configuration().configure("hibernatSetting.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		int id = sc.nextInt();
		Cart cart = session.get(Cart.class, id);
		
		if (cart != null) {
			session.delete(cart); // belongs to hibernate native api
			session.remove(cart); // belongs to jpa api
			System.out.println(id + " id is removed");
		} else {
			System.out.println(id + " id not found");
		}

		transaction.commit();

		factory.close();
		session.close();
		sc.close();

	}
}
