package com.ConstructeDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\ConstructeDI\\constructerXml.xml");
		
		Company c1 = (Company) context.getBean("comp1");
		c1.printWorkInfo();
		
		c1.printWorkInfo2();
		
		
	
	}

}
