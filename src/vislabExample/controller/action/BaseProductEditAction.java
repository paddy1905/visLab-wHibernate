package vislabExample.controller.action;



import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class BaseProductEditAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int idFromSelectEdit;
	protected String nameForEdit;
	protected String descriptionForEdit;
	protected double priceForEdit;
	protected int nrForEdit;
	protected String catForEditShow;
	protected int catIdFromSelectEdit;
	
	protected Product product;
	protected ArrayList<Product> result;
	protected ArrayList<Category> catResult;
	

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

	public String getCatForEditShow() {
		return catForEditShow;
	}

	public void setCatForEditShow(String catForEditShow) {
		this.catForEditShow = catForEditShow;
	}

	public int getCatIdFromSelectEdit() {
		return catIdFromSelectEdit;
	}

	public void setCatIdFromSelectEdit(int catIdFromSelectEdit) {
		this.catIdFromSelectEdit = catIdFromSelectEdit;
	}
}
