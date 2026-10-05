package com.Annotaion.bean;

public class Student {

	private int id;
	private String name;
	private String deprt;
	
	public Student() {
		System.out.println("student bean created");
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

	public String getDeprt() {
		return deprt;
	}

	public void setDeprt(String deprt) {
		this.deprt = deprt;
	}

}
