package com.bean.Autowired.byName;

public class Cart {
	private int numberOfProduct;
	private Product product;
	
	public int getNumberOfProduct() {
		return numberOfProduct;
	}
	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Cart [numberOfProduct=" + numberOfProduct + ", product=" + product + "]";
	}
	
	
}
