package vislabExample.controller.action;





import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Category;
import vislabExample.model.db.Product;



public class EditProductAction extends BaseProductEditAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Category category = categoryManager.getCategoryWithPrimaryKey(catIdFromSelectEdit);
		
		Product product = new Product (idFromSelectEdit,nameForEdit, descriptionForEdit,priceForEdit,category);
		
		boolean updated = productManager.editProduct(product);
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
	}
}
