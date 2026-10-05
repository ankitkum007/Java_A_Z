package com.costructer.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\costructer\\collection\\product.xml");
		
		Product p = (Product) context.getBean("product1");
		System.out.println(p);
		
		Product p1 = (Product) context.getBean("product2");
		System.out.println(p1);
		
//		p.printInfo();
//		p1.printInfo();
		
		Deler d = (Deler) context.getBean("delar1");
		System.out.println(d);
		
	}

}
