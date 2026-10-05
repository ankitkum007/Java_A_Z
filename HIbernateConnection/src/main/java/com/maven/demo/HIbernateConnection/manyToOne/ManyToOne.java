package com.maven.demo.HIbernateConnection.manyToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOne {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/java/MavenHibernate.cfg.xml"))
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Village village = new Village();
		village.setName("rasulpur");
		village.setDistrict("siwan");
		
		House house1 = new House();
		house1.setHouseNumber("253");
		house1.setOwnerName("Ankit kumar");
		
		House house2 = new House();
		house2.setHouseNumber("255");
		house2.setOwnerName("nilesh kumar");
		
		session.persist(village);
		session.persist(house1);
		session.persist(house2);
		
		House fatchHouse = session.get(House.class, 1);
		
		
		tx.commit();
		
		sessionFactory.close();
		session.close();
	}

}
