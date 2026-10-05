package com.College;

import org.springframework.stereotype.Component;

@Component
public class College {
	private int id;
	private String name;
	private double feeStructure;
	
	public College() {}
	
	public College(int id, String name, double feeStructure) {
		this.id = id;
		this.name = name;
		this.feeStructure = feeStructure;
	}
	
	public void displayinfo() {
		System.out.println("id: " + id + " name: " + name + " feeStructure: " + feeStructure);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(double feeStructure) {
		this.feeStructure = feeStructure;
	}
}
