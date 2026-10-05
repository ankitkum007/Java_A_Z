package com.maven.demo.HIbernateConnection.manyToMany;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure(new File("src/main/java/MavenHibernate.cfg.xml"))
				.buildSessionFactory();

		Club club1 = new Club();
		club1.setClubName("Science club");

		Club club2 = new Club();
		club2.setClubName("Coding club");

		Student student = new Student();
		student.setName("ankit kumar");
		student.setEmail("ankit@email.com");

		Set<Club> clubs = new HashSet<>();
		clubs.add(club1);
		clubs.add(club2);
		student.setClub(clubs);

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.persist(student);

		tx.commit();
		session.close();
		sessionFactory.close();

		System.out.println("Student and their club info saved successfully");
	}

}
