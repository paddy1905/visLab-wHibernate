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
	@Column(name="nr")
	private int nr;
	
	@Column(name="name")
	private String name;

	public Category() {
		
	}
	
	public Category(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}
	
	
	

	public int getNr() {
		return nr;
	}




	public void setNr(int nr) {
		this.nr = nr;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
