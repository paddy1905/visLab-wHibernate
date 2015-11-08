package vislabExample.controller.action;

import java.util.ArrayList;
import java.util.Locale.Category;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
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
	private int category;
	private ArrayList<vislabExample.model.db.Category> resultCat;
	
	
	private ArrayList<Product> result;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		//Hier fragen wegen Best Practice (Muss doch irgendwie übernommen werden vom Vorgänger oder nicht)
		CategoryManager categoryManager = new CategoryManager();
		result = productManager.getProductsBySearch(description, preisMin, preisMax, category);
		setResultCat(categoryManager.getAllAvailableCategories());
		
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

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public ArrayList<vislabExample.model.db.Category> getResultCat() {
		return resultCat;
	}

	public void setResultCat(ArrayList<vislabExample.model.db.Category> resultCat) {
		this.resultCat = resultCat;
	}



		
}
