package com.connection.MavenHabernateConnection;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class InsertData {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the item details- Brandname, ItemName, Quantiites, Rating");
         Cart cart = new Cart(sc.next(), sc.next(), sc.next(),sc.nextInt());
      
         
         Configuration config = new Configuration().configure("hibernatSetting.cfg.xml");
         SessionFactory factory = config.buildSessionFactory();
         Session session = factory.openSession();
         
         Transaction transaction = session.beginTransaction();
         
         session.persist(cart);
         
         transaction.commit();
         
         factory.close();
         session.close();
         sc.close();
         
         
    }
}
