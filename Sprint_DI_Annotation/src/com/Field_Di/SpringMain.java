package com.Field_Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfing.class);
		
		Student s = (Student) container.getBean("student");
		s.displayinfo();
		
		((AbstractApplicationContext) container).close();
	}

}
