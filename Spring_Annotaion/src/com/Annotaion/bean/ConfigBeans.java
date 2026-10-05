package com.Annotaion.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigBeans {
	
	@Bean("student")
	public Student getStudent1() {
		System.out.println("student first");
		Student s = new Student();
		s.setId(100);
		s.setName("Ankit");
		s.setDeprt("computer science engineering");
		return s;
	}
	@Bean
	public Student getStudent2() {
		System.out.println("student second");
		Student s = new Student();
		s.setId(101);
		s.setName("nilesh");
		s.setDeprt("Innforamation Technology");
		return s;
	}

}
