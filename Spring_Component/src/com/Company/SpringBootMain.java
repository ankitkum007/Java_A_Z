package com.Company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.Company.dept.JavaDept;
//import com.Company.dept.ProjectConfig;

public class SpringBootMain {
	public static void main(String[] args) {
		try {
//			ApplicationContext container = new AnnotationConfigApplicationContext(ConfigBean.class, ProjectConfig.class);
			ApplicationContext container = new AnnotationConfigApplicationContext(ConfigBean.class);
			Company c = (Company) container.getBean("company");
			c.displayInf();

			Employe e = (Employe) container.getBean("employe");
			e.dispaly();
			Employe e2 = (Employe) container.getBean("emp2");
			e2.dispaly();
			
			

			JavaDept j = (JavaDept) container.getBean("javaDept");
			j.display();
			((AbstractApplicationContext) container).close();

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("somting want wrong");

		}

	}
}
