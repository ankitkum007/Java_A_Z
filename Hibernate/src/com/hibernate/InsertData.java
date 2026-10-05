package com.hibernate;

import java.io.File;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	private static SessionFactory sessionFactory = new Configuration().configure(new File("src/hibernate.cfg.xml"))
			.buildSessionFactory();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n User management System");
			System.out.println("1. Add Users");
			System.out.println("2 View users");
			System.out.println("3 Update Users");
			System.out.println("4 Delete users");
			System.out.println("5 Exit");
			System.out.println("Enter your Operation");
			int choice = sc.nextInt();

			switch (choice) {
				case 1 -> addUsers();
				case 2 -> viewUsers();
				case 3 -> updateUsers();
				case 4 -> deleteUsers();
				case 5 -> {
					System.out.println("Exiting Program");
					sessionFactory.close();
					return;
				}
				default -> System.out.println("Invalid choice Please try again");
			}
		}

	}
	private static void addUsers() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user = new User();
		System.out.println("Enter Name: ");
		user.setName(sc.next());
		System.out.println("Ener Project: ");
		user.setProject(sc.next());
		sc.nextLine();
		System.out.println("Enter Salary: ");
		user.setSalary(sc.nextDouble());
		System.out.println("Enter Phone: ");
		user.setPhoneNumber(sc.nextInt());
		
		session.persist(user);
		tx.commit();
		session.close();
		System.out.println("User add successfully with Id: " + user.getId());
	}
	
	private static void viewUsers() {
		Session session = sessionFactory.openSession();
		System.out.println("Enter User ID: ");
		int id = sc.nextInt();
		
		User user = session.get(User.class, id);
		
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("User not found");
		}
	}
	
	private static void updateUsers() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Enter User ID: ");
		int id = sc.nextInt();
		
		User user = session.get(User.class, id);
		
		if(user != null) {
			System.out.println("Enter Name: ");
			user.setName(sc.next());
			System.out.println("Enter Project");
			user.setProject(sc.next());
			System.out.println("Enter Salary");
			user.setSalary(sc.nextDouble());
			System.out.println("Enter Phone");
			user.setPhoneNumber(sc.nextInt());
			
			session.update(user);
			tx.commit();
			System.out.println("User update successfully");
		}else {
			System.out.println("User not found");
		}
		session.close();
	}
	
	private static void deleteUsers() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Enter User ID: ");
		int id = sc.nextInt();
		
		User user = session.get(User.class, id);
		if(user != null) {
			session.remove(user);
			tx.commit();
			System.out.println("User deleted successfully");
		}else {
			System.out.println("User not found");
		}
		session.close();
		
	}

}
