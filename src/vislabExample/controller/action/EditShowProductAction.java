package vislabExample.controller.action;




import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;


public class EditShowProductAction extends BaseProductEditAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		product = productManager.getProductForPrimaryKey(idFromSelectEdit);
		setNameForEdit(product.getName());
		setDescriptionForEdit(product.getDescription());
		setPriceForEdit(product.getPrice());
		setNrForEdit(product.getId());
		setCatForEditShow(product.getCategory().getName());
	
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		return "success";
	}
}
