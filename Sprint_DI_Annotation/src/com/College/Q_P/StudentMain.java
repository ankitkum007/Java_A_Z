package com.College.Q_P;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
		
		College clg = (College) container.getBean("college");
		System.out.println(clg);
		Course course = clg.getCourse();
		System.out.println(course.getCourse());
		
		((AbstractApplicationContext) container).close();
	}

}
