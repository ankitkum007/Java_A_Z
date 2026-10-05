package com.ObjectBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\ObjectBase\\configFile.xml");
		Employe e1 =  (Employe) context.getBean("employe");
		
		System.out.println(e1.getName());
		
		Address a1 = (Address) context.getBean("add");
		System.out.println(a1.getState());

	}

}
