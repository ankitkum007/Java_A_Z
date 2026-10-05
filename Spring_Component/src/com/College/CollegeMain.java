package com.College;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CollegeMain {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College clg = (College) container.getBean("colg1");
		clg.displayinfo();

		College clg2 = (College) container.getBean("colg2");
		clg2.displayinfo();

		College clg3 = (College) container.getBean("colg3");
		clg3.displayinfo();
		
		((AbstractApplicationContext) container).close();
	}
}
