package com.maven.demo.HIbernateConnection.oneToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneExample {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/java/MavenHibernate.cfg.xml"))
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Address add = new Address();
		add.setCity("bengaluru");
		add.setState("karnatka");
		add.setStreet("btm 2nd stage");
		add.setZipcode("560076");
		
		Student student = new Student();
		student.setName("ankit");
		student.setEmail("ankit@gmail.com");
		student.setPhone("123456789");
		student.setAddress(add);
		
		session.persist(student);
		tx.commit();
		
		System.out.println("student info in saved assoicated with address");
		
		Student stud = session.get(Student.class, 4);
		if(stud != null) {
			System.out.println(stud.getId() + stud.getName() + stud.getPhone());
			System.out.println(stud.getAddress().getId() + stud.getAddress().getCity() + stud.getAddress().getState() + stud.getAddress().getStreet() + stud.getAddress().getZipcode());
		}else {
			System.out.println("student info not found");
		}
		
		sessionFactory.close();
		session.close();
	}

}
