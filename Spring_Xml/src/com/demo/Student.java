package com.demo;

public class Student {
	private String name;
	private int age;
	private String dept;
	private String address;
	
	public Student() {
		System.out.println("student bean created");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dept=" + dept + ", address=" + address + "]";
	}

	public String getName() {
		System.out.println("name are initiated by ioc");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void printStudent() {
		System.out.println("bean created");
	}
	
}
