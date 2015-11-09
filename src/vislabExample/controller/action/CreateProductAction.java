package vislabExample.controller.action;

import java.util.ArrayList;


import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class CreateProductAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int artNr;
	private int catIdFromSelectCreate;
	private String name;
	private double price;
	private String description;
	
	private ArrayList<Product> result;
	private ArrayList<Category> catResult;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Product product = new Product(artNr,name,description,price, catIdFromSelectCreate);
		
		productManager.createNewProduct(product);
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
	}

	
	
	
	public int getArtNr() {
		return artNr;
	}

	public void setArtNr(int artNr) {
		this.artNr = artNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCatIdFromSelectCreate() {
		return catIdFromSelectCreate;
	}

	public void setCatIdFromSelectCreate(int catIdFromSelectCreate) {
		this.catIdFromSelectCreate = catIdFromSelectCreate;
	}

	public ArrayList<Product> getResult() {
		return result;
	}

	public void setResult(ArrayList<Product> result) {
		this.result = result;
	}

	public ArrayList<Category> getCatResult() {
		return catResult;
	}

	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}
}
	