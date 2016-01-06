package vislabExample.controller.action;

import java.util.ArrayList;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class CreateCategoryAction extends ActionSupport implements Preparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int catNr;
	private String name;
	
	private ArrayList<Category> catResult;
	
	
	@Override
	public void prepare() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		catResult = categoryManager.getAllAvailableCategories();
	}
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		Category category = new Category(catNr, name);
		
		Category category2 = categoryManager.getCategoryWithPrimaryKey(catNr);
		
		if(category2 != null) {
			addActionMessage("Kategorie id bereits vergeben");
			catResult = categoryManager.getAllAvailableCategories();
			return "success";
		} else {
			categoryManager.createNewCategory(category);
			catResult = categoryManager.getAllAvailableCategories();
			
			addActionMessage("Erfolgreich angelegt");
			
			return "success";	
		}
	}

	public ArrayList<Category> getCatResult() {
		return catResult;
	}

	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatNr() {
		return catNr;
	}

	public void setCatNr(int catNr) {
		this.catNr = catNr;
	}

	
}
	