package com.amazkart.webapp.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private int price;
	
	
	public Product(int productId, String productName, int price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public Product() {
		
	}
	public int getProductId() {
		return productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}