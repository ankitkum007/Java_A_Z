package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		// tow way to provide the file location 
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\SpringBoot_Xml\\src\\configuration.xml");
		
//		Object obj = context.getBean("student1");
//		Student s1 = (Student) obj;
		
		Student s1 = (Student) context.getBean("student1");
		s1.printStudent();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getDept());
		System.out.println(s1.getAddress());
		System.out.println(s1.toString());
		
		Address add = (Address)context.getBean("address");
		System.out.println(add.toString());
		
		

		
	}
}
