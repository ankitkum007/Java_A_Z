package com.costructer.collection;
import java.util.List;

public class Product {
	private String item;
	private int numberOfItem;
	private String brand;
	private List<String> phones;
	
	public Product(List<String> phones) {
		this.phones = phones;
	}

	public Product(String item, int numberOfItem, String brand, List<String> phones) {
		super();
		this.item = item;
		this.numberOfItem = numberOfItem;
		this.brand = brand;
		this.phones = phones;
	}
	public Product(String item, int numberOfItem) {
		this.item = item;
		this.numberOfItem = numberOfItem;
	}

	public void printInfo() {
		System.out.println("item: " + item + " NumberofItem: " + numberOfItem + " brand: " + brand);
	}

	@Override
	public String toString() {
		return "Product item=" + item + ", numberOfItem=" + numberOfItem + ", brand=" + brand + ", phones=" + phones
				;
	}	
}
