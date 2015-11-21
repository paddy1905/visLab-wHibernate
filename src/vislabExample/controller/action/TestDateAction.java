package vislabExample.controller.action;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class TestDateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String datepicker;
	
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Category category = new Category(87, "Test");
		categoryManager.createNewCategory(category);
		
		Product product = new Product(987,"nice","nice",15.0,category);
		
		
		
		DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		
		try {
			Date date = formatter.parse(datepicker);
			System.out.println(date);
			System.out.println(formatter.format(date));
			product.setTestDate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		productManager.createNewProduct(product);
		
		
		
		return "success";
	}

	

	public String getDatepicker() {
		return datepicker;
	}

	public void setDatepicker(String datepicker) {
		this.datepicker = datepicker;
	}
}
