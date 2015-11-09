package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class OpenAdminAreaAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Product> result;
	private ArrayList<Category> catResult;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
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
