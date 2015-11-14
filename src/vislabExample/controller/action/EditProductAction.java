package vislabExample.controller.action;





import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;


public class EditProductAction extends BaseProductEditAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
	}
}
