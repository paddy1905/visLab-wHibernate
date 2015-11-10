package vislabExample.controller.action;



import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class EditCategoryAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int catIdFromSelectEdit;
	private String nameForEdit;
	
	private ArrayList<Category> catResult;
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		Category category = categoryManager.getCategoryWithPrimaryKey(catIdFromSelectEdit);
		catResult = categoryManager.getAllAvailableCategories();
		
		setNameForEdit(category.getName());
		return "success";
	}

	


	public ArrayList<Category> getCatResult() {
		return catResult;
	}

	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}

	public String getNameForEdit() {
		return nameForEdit;
	}

	public void setNameForEdit(String nameForEdit) {
		this.nameForEdit = nameForEdit;
	}

	public int getCatIdFromSelectEdit() {
		return catIdFromSelectEdit;
	}

	public void setCatIdFromSelectEdit(int catIdFromSelectEdit) {
		this.catIdFromSelectEdit = catIdFromSelectEdit;
	}

}
