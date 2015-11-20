package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Product;

public class ShowDetailsAction extends ActionSupport {

	/**
	 * 
	 */
	
	private int detailKey;
	private String name;
	private String description;
	private double price;
	private String catName;
	private int prodNr;
	
	private ArrayList<Product> relatedProducts;
	
	public ArrayList<Product> getRelatedProducts() {
		return relatedProducts;
	}



	public void setRelatedProducts(ArrayList<Product> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}



	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		System.out.println(detailKey);
		Product product = productManager.getProductForPrimaryKey(detailKey);
	
		
		setProdNr(product.getId());
		setName(product.getName());
		setDescription(product.getDescription());
		setPrice(product.getPrice());
		setCatName(product.getCategory().getName());
		
		relatedProducts = productManager.getRelatedProducts(product.getCategory(), product.getId());
		
		return "success";
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public int getDetailKey() {
		return detailKey;
	}



	public void setDetailKey(int detailKey) {
		this.detailKey = detailKey;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getCatName() {
		return catName;
	}



	public void setCatName(String catName) {
		this.catName = catName;
	}



	public int getProdNr() {
		return prodNr;
	}



	public void setProdNr(int prodNr) {
		this.prodNr = prodNr;
	}

}
