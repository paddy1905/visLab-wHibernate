package vislabExample.controller.action;







import vislabExample.model.bl.CategoryManager;
import vislabExample.model.db.Category;


public class EditCategoryAction extends BaseCategoryEditAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		
		Category category = new Category(catIdFromSelectEdit, nameForEdit);
		
		categoryManager.editCategory(category);
		catResult = categoryManager.getAllAvailableCategories();
		
		addActionMessage("Erfolgreich bearbeitet");
		
		return "success";
	}
}
