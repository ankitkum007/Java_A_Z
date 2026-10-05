package com.bean.Autowired.constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\bean\\Autowired\\constructer\\beanAutowired_constructer.xml");
		
		Docter d1 = (Docter) container.getBean("docter");
		
		System.out.println(d1);
		Hospital h1 = (Hospital) container.getBean("hospital");
		System.out.println(h1);
		
		
	}

}
