package com.bean.Autowired.constructer;

public class Hospital {
	private String name;
	private String area;
	private int zipcode;
	
	public Hospital(String name, String area, int zipcode) {
		super();
		this.name = name;
		this.area = area;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", area=" + area + ", zipcode=" + zipcode + "]";
	}
}
