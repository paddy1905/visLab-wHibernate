package vislabExample.controller.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

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
	private String releaseDate;
	private String releaseDateMax;
	
	private ArrayList<Product> result;
	
	public String execute() throws Exception {
				ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date date = formatter.parse(releaseDate);
		Date dateMax = formatter.parse(releaseDateMax);
			
		Category categoryForSearch = categoryManager.getCategoryWithPrimaryKey(catIdForSearch);
		
		result = productManager.getProductsBySearch(description, preisMin, preisMax, categoryForSearch, date, dateMax);
		
		

		setResultCat(categoryManager.getAllAvailableCategories());
		System.out.println("HIER KOMMT" + catIdForSearch);

		
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

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseDateMax() {
		return releaseDateMax;
	}

	public void setReleaseDateMax(String releaseDateMax) {
		this.releaseDateMax = releaseDateMax;
	}		
}
