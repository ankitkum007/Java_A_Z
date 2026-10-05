package com.bean.Autowired.byName;

public class Product {
	private String item;
	private int itemCount;
	private String brand;
	
	public Product() {
		System.out.println("Product bean is created");
	}
	public Product(String item, int itemCount, String brand) {
		this.item = item;
		this.itemCount = itemCount;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [item=" + item + ", itemCount=" + itemCount + ", brand=" + brand + "]";
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
