package vislabExample.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@Id   
    @Column(name="name")

 	private String name;

	@Column(name="description")
    private String description;

    @Column(name="price")
	private double price;

    @Column(name="category")
    private String category;

	
	
	public Product() {
		
	}
	
	public Product(String name, String description, double price, String category) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}