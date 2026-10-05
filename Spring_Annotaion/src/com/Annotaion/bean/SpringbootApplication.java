package com.Annotaion.bean;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringbootApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigBeans.class);
			
			Student s =(Student) container.getBean("student");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getDeprt());
			
			Student s2 = (Student) container.getBean("getStudent2");
			System.out.println(s2.getId());
			System.out.println(s2.getName());
			System.out.println(s2.getDeprt());
			
			((AbstractApplicationContext) container).close();
		
		
		
	}

}
