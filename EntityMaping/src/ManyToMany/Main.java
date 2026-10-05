package ManyToMany;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure(new File("src\\ManyToMany\\hibernate.cfg.xml"));
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Club c1 = new Club();
		c1.setClubName("Science Club");
		
		Club c2 = new Club();
		c2.setClubName("Math Club");
		
		Student stud =  new Student();
		stud.setName("Rudra Pandit");
		stud.setEmail("rudra123@gamil.com");
		
		Set<Club> clubs = new HashSet<>();
		clubs.add(c1);
		clubs.add(c2);
		stud.setClubs(clubs);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(stud);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		System.out.println("saved the all details");
	}

}
