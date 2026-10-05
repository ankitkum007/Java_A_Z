package OneToMany;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration confg = new Configuration();
		confg.configure(new File("src\\OneToMany\\hibernate.cfg.xml"));
		
		SessionFactory sessionFactory = confg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setName("Nilesh kumar");
		student.setEmail("nilesh123@gmail.com");
		student.setPhone("1234567890");
		
		Course course1 = new Course();
		course1.setCourseName("java");
		
		Course course2 = new Course();
		course2.setCourseName("springboot");
		
		course1.setStudent(student);
		course2.setStudent(student);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		student.setCourses(courses);
		
		session.persist(student);
		
		transaction.commit();
		
		System.out.println("student and associated course saved");
		
		Student fetchStudent = new Student();
		System.out.println("Fetch the detials");
		System.out.println("Name: " + fetchStudent.getName());
		System.out.println("email: " + fetchStudent.getEmail());
		System.out.println("phone: " + fetchStudent.getPhone());
		
		System.out.println("Course Enrolled");
		
		for(Course c : fetchStudent.getCourses()) {
			System.out.println("-" + c.getCourseName());
		}
		
		session.close();
		sessionFactory.close();
		
		
	}
}
