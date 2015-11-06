package vislabExample.model.db;

public class Product {
	
	private String description;
	private double price;
	private String kategory;
	
	
	public Product(String description, double price, String kategory) {
		this.description = description;
		this.price = price;
		this.kategory = kategory;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setKategory(String kategory) {
		this.kategory = kategory;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getKategory() {
		return kategory;
	}
	
	public double getPrice() {
		return price;
	}
	
	

}
