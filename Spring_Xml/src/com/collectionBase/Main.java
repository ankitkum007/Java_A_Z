package com.collectionBase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\collectionBase\\configCollege.xml");
		
		College coll = (College) context.getBean("college");
		System.out.println(coll.getStudentName());
		System.out.println(coll.getNumbers());
		coll.printMap();
		System.out.println(coll);

	}
}
