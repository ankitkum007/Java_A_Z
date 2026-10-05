package com.connection.MavenHabernateConnection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itemId;
	@Column(name = "brandName")
	String brandName;
	@Column(name = "itemName")
	String itemName;
	@Column(name = "quantitie")
	String quantite;
	@Column(name = "rating")
	int rating;

	public Cart() {
	}

	public Cart(String brandName, String itemName, String quantite, int rating) {
		super();
		this.brandName = brandName;
		this.itemName = itemName;
		this.quantite = quantite;
		this.rating = rating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getItemId() {
		return itemId;
	}

	@Override
	public String toString() {
		return "Cart [itemId=" + itemId + ", brandName=" + brandName + ", itemName=" + itemName + ", quantite="
				+ quantite + ", rating=" + rating + "]";
	}

}
