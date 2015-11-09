package vislabExample.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
	
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wtStatSEQ")
//	@SequenceGenerator(name = "wtStatSEQ", sequenceName = "seq")
	@Id
	@Column(name = "id")
	private int id;
	
	  
    @Column(name="name")
 	private String name;

	@Column(name="description")
    private String description;

    @Column(name="price")
	private double price;

//    @Column(name="category")
//    private String category;
//    
   
    @Column(name="catId")
    private int catId;
    

	
	
	public Product() {
		
	}
	
	public Product(int id, String name, String description, double price, int catId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.catId = catId;	
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

	public int getCategory() {
		return catId;
	}

	public void setCategory(int category) {
		this.catId = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}