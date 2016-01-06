package vislabExample.controller.action;




import vislabExample.model.bl.CategoryManager;
import vislabExample.model.db.Category;



public class EditShowCategoryAction extends BaseCategoryEditAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		
		Category category = categoryManager.getCategoryWithPrimaryKey(catIdFromSelectEdit);
		setNameForEdit(category.getName());
		
		catResult = categoryManager.getAllAvailableCategories();
		
		return "success";
	}
}
