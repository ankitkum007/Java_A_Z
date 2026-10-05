package OneToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure(new File("src\\OneToOne\\hibernate.cfg.xml")); 
		
		SessionFactory sessionFactory = conf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address();
		address.setStreet("btm 123");
		address.setCity("bengaluru");
		address.setState("karnataka");
		address.setZipcode("560037");
		
		
		Kodneststudent student = new Kodneststudent();
		student.setName("Ankit kumar");
		student.setEmail("ankit123@gmail.com");
		student.setPhone("1234567891");
		student.setAddress(address);
		
		session.persist(student);
		
		transaction.commit();
		
		System.out.println("Student & Address saved successfully");
		
		
		Kodneststudent fecthedStudent = session.get(Kodneststudent.class, student.getId());
		if(fecthedStudent != null) {
			System.out.println("Student Information");
			System.out.println("Name: " + fecthedStudent.getName());
			System.out.println("Email: " + fecthedStudent.getEmail());
			System.out.println("Phone: " + fecthedStudent.getPhone());
			System.out.println("Address: " + fecthedStudent.getAddress().getStreet() + ","
					+ fecthedStudent.getAddress().getCity() + ","
					+ fecthedStudent.getAddress().getState() + ","
					+ fecthedStudent.getAddress().getZipcode()
					);
		}
		
		session.close();
		sessionFactory.close();
	}
	

}
