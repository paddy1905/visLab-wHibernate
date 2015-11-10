package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class DeleteCategoryAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int catIdFromSelectDelete;
	private ArrayList<Category> catResult;
	
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		Category category = categoryManager.getCategoryWithPrimaryKey(catIdFromSelectDelete);
		
		boolean deleted = categoryManager.deleteCategoryWithKey(category);
		catResult = categoryManager.getAllAvailableCategories();
		
		addActionMessage("Kategorie gelöscht");
		
		
		return "success";
	}

	public int getCatIdFromSelectDelete() {
		return catIdFromSelectDelete;
	}


	public void setCatIdFromSelectDelete(int catIdFromSelectDelete) {
		this.catIdFromSelectDelete = catIdFromSelectDelete;
	}


	public ArrayList<Category> getCatResult() {
		return catResult;
	}


	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}
}
	