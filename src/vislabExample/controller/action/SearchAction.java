package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class SearchAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	private double preisMin;
	private double preisMax;
	private int catIdForSearch;
	private ArrayList<Category> resultCat;
	
	private ArrayList<Product> result;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Category categoryForSearch = categoryManager.getCategoryWithPrimaryKey(catIdForSearch);
		
		result = productManager.getProductsBySearch(description, preisMin, preisMax, categoryForSearch);
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

	public ArrayList<Category> getResultCat() {
		return resultCat;
	}

	public void setResultCat(ArrayList<Category> resultCat) {
		this.resultCat = resultCat;
	}

	public int getCatIdForSearch() {
		return catIdForSearch;
	}

	public void setCatIdForSearch(int catIdForSearch) {
		this.catIdForSearch = catIdForSearch;
	}		
}
