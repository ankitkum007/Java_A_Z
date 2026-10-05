package com.bean.Autowired.constructer;

public class Docter {
	
//	private String docterName;
//	private String  specialist;
//	private long number;
	private Hospital hospital;
	
	public Docter(Hospital hospital) {
	this.hospital = hospital;
}

	@Override
	public String toString() {
		return "Docter [hospital=" + hospital + "]";
	}

}
