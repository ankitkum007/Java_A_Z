package com.ConstructeDI;

public class Company {
	
	String id;
	String workTime;
	long mobile;
	double salary;
	
	public Company(String id, String workTime, long mobile, double salary) {
		this.id = id;
		this.workTime = workTime;
		this.mobile = mobile;
		this.salary = salary;
	}
	public Company(String id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public void printWorkInfo() {
		System.out.println("id : " + id + " Worktime: " + workTime + " moblie: " + mobile + " salary: " + salary);
	}
	public void printWorkInfo2() {
		System.out.println("id : " + id + " salary: " + salary);
	}
	
}
