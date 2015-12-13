package vislabExample.controller.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class SearchAction extends ActionSupport implements Preparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String MIN_DATE = "01.01.1800";
	private static final String MAX_Date = "31.12.2050";
	private static final double MAX_PRICE = 500.00;
	
	private String description;
	private double priceMin;
	private double priceMax;
	private int catIdForSearch;
	private ArrayList<Category> resultCat;
	private String releaseDate;
	private String releaseDateMax;
	
	private ArrayList<Product> result;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Category categoryForSearch = categoryManager.getCategoryWithPrimaryKey(catIdForSearch);
		
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		Date date = formatter.parse(MIN_DATE);
		Date dateMax = formatter.parse(MAX_Date);
		
		if(!releaseDate.isEmpty()) {
			date = formatter.parse(releaseDate);
		}
		if(!releaseDateMax.isEmpty()) {
			dateMax = formatter.parse(releaseDateMax); 
		}
		
		if(priceMax == 0.0) {
			priceMax = MAX_PRICE;
		}
		
		result = productManager.getProductsBySearch(description, priceMin, priceMax, categoryForSearch, date, dateMax);
		
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

	public double getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(double priceMin) {
		this.priceMin = priceMin;
	}

	public double getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(double priceMax) {
		this.priceMax = priceMax;
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

	@Override
	public void prepare() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		
		resultCat = categoryManager.getAllAvailableCategories();	
	}		
}
