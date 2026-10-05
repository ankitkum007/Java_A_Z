package com.bean.Autowired.byName;

public class Order {
	private String buy;
	private Product product;
	private Cart cart;
	
	
	public String getBuy() {
		return buy;
	}
	public void setBuy(String buy) {
		this.buy = buy;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Order [buy=" + buy + ", product=" + product + ", cart=" + cart + "]";
	}
	
	

}
