package com.code.main.model;


public class Product {

	private int id;
	private String productName;
	private int amount;
	
	
	public Product(int id,String productName,int amount) {
		this.id = id;
		this.productName = productName;
		this.amount = amount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
