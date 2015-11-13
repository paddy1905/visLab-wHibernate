package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class DeleteProductAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idFromSelectDelete;
	
	private ArrayList<Product> result;
	private ArrayList<Category> catResult;
	
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Product product = productManager.getProductForPrimaryKey(idFromSelectDelete);
		productManager.deleteProduct(product);
		
		catResult = categoryManager.getAllAvailableCategories();
		setResult(productManager.getAllProducts());
		
		addActionMessage("Produkt gelöscht");
		
		return "success";
	}

	public int getIdFromSelectDelete() {
		return idFromSelectDelete;
	}

	public void setIdFromSelectDelete(int idFromSelectDelete) {
		this.idFromSelectDelete = idFromSelectDelete;
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
	