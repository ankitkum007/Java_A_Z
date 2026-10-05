package com.bean.Autowired.byType;

public class Hospital {
	private String hospitalName;
	private String address;
	private int pincode;
	
	public Hospital(String hospitalName, String address, int pincode) {
		super();
		this.hospitalName = hospitalName;
		this.address = address;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", address=" + address + ", pincode=" + pincode + "]";
	}
}
