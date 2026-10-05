package com.Company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employe {
	private String name;
	private String jobRoll;
	
	public Employe(@Value("Ankit")String name, @Value("Java developer") String jobRoll) {
		this.name = name;
		this.jobRoll = jobRoll;
	}
	
	public void dispaly() {
		System.out.println("Employe details");
		System.out.println("name: " + name + " Roll: " + jobRoll);
	}

}
