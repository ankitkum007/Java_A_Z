package com.Company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.*")
public class ConfigBean {
	@Bean("emp2")
	public Employe getEmploee() {
		System.out.println("emp2 information");
		return new Employe("ankit" ,"bankend developer");
	}

}
