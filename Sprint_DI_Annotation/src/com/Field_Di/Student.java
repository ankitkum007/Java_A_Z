package com.Field_Di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Ankit kumar")
	private String name;
	@Value("1234568790")
	private int mobileNo;
	
	@Autowired
	private Address address;
	
	public void displayinfo() {
		System.out.println("Student: " + name +", "+ mobileNo);
		address.show();
	}

}
