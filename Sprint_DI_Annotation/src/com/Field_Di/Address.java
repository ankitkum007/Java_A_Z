package com.Field_Di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Btm2 stage")
	private String village;
	@Value("560076")
	private int zipcode;
	@Value("Bengaluru")
	private String state;
	
	public void show() {
		System.out.println("Address: " + village +", "+ state+", "+ zipcode);
	}

}
