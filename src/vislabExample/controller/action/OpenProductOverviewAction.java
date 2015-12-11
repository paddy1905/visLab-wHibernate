package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class OpenProductOverviewAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Product> products;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		
		products = productManager.getAllProducts();
		return "success";
	
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	
}
