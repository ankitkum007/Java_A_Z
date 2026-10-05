package com.College.Q_P;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.College.Q_P")
public class SpringBeanConfig {
	@Primary
	@Bean
	public Course computeScience() {
		Course cse = new Course();
		cse.setCourse("Computer Science");
		return cse;
	}

	@Bean
	public Course inforamtionTechnology() {
		Course it = new Course();
		it.setCourse("Information Technology");
		return it;
	}

	@Bean
	public Course cyberSecurity() {
		Course cybs = new Course();
		cybs.setCourse("cyberSecurity");
		return cybs;
	}
}
