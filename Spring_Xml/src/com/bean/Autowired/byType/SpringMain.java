package com.bean.Autowired.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\bean\\Autowired\\byType\\beanAutowirde_byType.xml");
		
		Patient p1 = (Patient) container.getBean("patient");
		Hospital h1 = p1.getHospital();
		System.out.println(h1);
		System.out.println(p1.getHospital());
		System.out.println(p1.getPatientName());
		System.out.println(p1.getPatientNumber());

	}

}
