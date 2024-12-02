package com.sarthak.spring.springcore.reftypes.assignment;

public class Item {
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}//providing a human-readable string representation of the object
	//returns a detailed representation of the item properties like id, name, quantity, and price

	private int id;
	private String name;
	private int quantity;
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
