package com.bean.Autowired.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Springmain {
	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\SpringBoot_Xml\\src\\com\\bean\\Autowired\\beanAutowired.xml");

		AbstractApplicationContext context =
		        new FileSystemXmlApplicationContext("C:\\Users\\niles\\eclipse-workspace\\Spring_Xml\\src\\com\\bean\\Autowired\\byName\\beanAutowired.xml");
		
		

//		Product p1 = (Product) context.getBean("product");
//		System.out.println(p1);
		
//		Cart c1 = (Cart) context.getBean("cart");
//		Product p1 = c1.getProduct();
//		System.out.println(c1.getNumberOfProduct());
//		System.out.println(p1);
		
		Order o1 = (Order) context.getBean("order");
		Cart c2 = o1.getCart();
		System.out.println(c2.getProduct());
		System.out.println(o1.getCart());
		System.out.println(o1.getBuy());
		
		((AbstractApplicationContext) context).close();

		
	}
}
