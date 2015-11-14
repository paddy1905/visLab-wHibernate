package vislabExample.controller.action;



import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;

public class EditCategoryAction extends BaseCategoryEditAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		
		Category category = new Category(catIdFromSelectEdit, nameForEdit);
		
		boolean updated = categoryManager.editCategory(category);
		catResult = categoryManager.getAllAvailableCategories();
		
		addActionMessage("Erfolgreich bearbeitet");
		
		return "success";
	}
}
