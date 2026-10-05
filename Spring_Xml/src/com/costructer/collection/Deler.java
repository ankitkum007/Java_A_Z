package com.costructer.collection;

public class Deler {
	
	private String delerName;
	private Product product;
	
	public Deler(String delerName, Product product) {
		super();
		this.delerName = delerName;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Deler [delerName=" + delerName + ", product=" + product + "]";
	}
	
}
