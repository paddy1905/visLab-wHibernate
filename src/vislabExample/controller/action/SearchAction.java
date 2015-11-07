package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Product;



public class SearchAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	private double preisMin;
	private double preisMax;
	private String category;
	
	
	private ArrayList<vislabExample.model.db.Product> result;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		productManager.getProductsBySearch(description, preisMin, preisMax, category);
		return "success";
	}
	
	public ArrayList<Product> getResult() {
		return result;
	}
	
	public void setResult(ArrayList<Product> result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPreisMin() {
		return preisMin;
	}

	public void setPreisMin(double preisMin) {
		this.preisMin = preisMin;
	}

	public double getPreisMax() {
		return preisMax;
	}

	public void setPreisMax(double preisMax) {
		this.preisMax = preisMax;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	
}
