package vislabExample.controller.action;



import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class ShowProductWithKey extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idFromSelectEdit;
	private String nameForEdit;
	private String descriptionForEdit;
	private double priceForEdit;
	private int nrForEdit;
	
	private Product product;
	private ArrayList<Product> result;
	private ArrayList<Category> catResult;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		product = productManager.getProductForPrimaryKey(idFromSelectEdit);
		setNameForEdit(product.getName());
		setDescriptionForEdit(product.getDescription());
		setPriceForEdit(product.getPrice());
		setNrForEdit(product.getId());
	
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
	}

	public int getIdFromSelectEdit() {
		return idFromSelectEdit;
	}

	public void setIdFromSelectEdit(int idFromSelectEdit) {
		this.idFromSelectEdit = idFromSelectEdit;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ArrayList<Product> getResult() {
		return result;
	}

	public void setResult(ArrayList<Product> result) {
		this.result = result;
	}
	
	public String getNameForEdit() {
		return nameForEdit;
	}

	public void setNameForEdit(String nameForEdit) {
		this.nameForEdit = nameForEdit;
	}

	public double getPriceForEdit() {
		return priceForEdit;
	}

	public void setPriceForEdit(double priceForEdit) {
		this.priceForEdit = priceForEdit;
	}

	public String getDescriptionForEdit() {
		return descriptionForEdit;
	}

	public void setDescriptionForEdit(String descriptionForEdit) {
		this.descriptionForEdit = descriptionForEdit;
	}

	public int getNrForEdit() {
		return nrForEdit;
	}

	public void setNrForEdit(int nrForEdit) {
		this.nrForEdit = nrForEdit;
	}

	public ArrayList<Category> getCatResult() {
		return catResult;
	}

	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}

}
