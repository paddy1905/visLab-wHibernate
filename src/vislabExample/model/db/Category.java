package vislabExample.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="catId")
	private int catId;
	
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	@Column(name="name")
	private String name;

	public Category() {
		
	}
	
	public Category(int catId, String name) {
		this.catId = catId;
		this.name = name;
	}
	
	
	

	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
