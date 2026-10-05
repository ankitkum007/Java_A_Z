package com.maven.demo.HIbernateConnection.oneToMany;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
				.configure(new File("src/main/java/MavenHibernate.cfg.xml"))
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setName("pardip kumar");
		student.setEmail("pardip@gmail.com");
		student.setPhone("1234567890");
		
		Course course1 = new Course();
		course1.setCourseName("Java core");
		
		Course course2 = new Course();
		course2.setCourseName("springBoot with AI");
		
		course1.setStudent(student);
		course2.setStudent(student);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		student.setCourse(courses);
		
		session.persist(student);
		tx.commit();
		System.out.println("student and associated course saved successfully");
		
		Student fetchStudnet = session.get(Student.class, student.getId());
		System.out.println("Fetch Student Details");
		System.out.println("Name: " + fetchStudnet.getName());
		System.out.println("Email: " + fetchStudnet.getEmail());
		System.out.println("Phone: " + fetchStudnet.getPhone());
		
		System.out.println("Enrolled Courses");
		for(Course course: fetchStudnet.getCourse()) {
			System.out.println("_" + course.getCourseName());
		}
		
		sessionFactory.close();
		session.close();
	}

}
