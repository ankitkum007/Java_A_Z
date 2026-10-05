package ManyToOne;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure(new File("src\\ManyToOne\\hibernate.cfg.xml"));
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Department department = new Department();
		department.setDepartmentName("Backend devloper");
		
		Empolyee empolyee1 = new Empolyee();
		empolyee1.setEmployeeName("Ankit kumar");
		empolyee1.setEmail("ankit123@gmail.com");
		empolyee1.setDepartment(department);
		
		Empolyee empolyee2 = new Empolyee();
		empolyee2.setEmployeeName("Nilesh kumar");
		empolyee2.setEmail("Nilesh@gmail.com");
		empolyee2.setDepartment(department);
		
		session.persist(department);
		session.persist(empolyee1);
		session.persist(empolyee2);
		
		transaction.commit();
		System.out.println("all inforamtion saved");
		
		session.close();
		sessionFactory.close();
	}

}
