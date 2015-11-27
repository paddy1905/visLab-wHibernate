package vislabExample.controller.action;








import java.text.SimpleDateFormat;
import java.util.Date;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.bl.ProductManager;
import vislabExample.model.db.Product;


public class EditShowProductAction extends BaseProductEditAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Product product = productManager.getProductForPrimaryKey(idFromSelectEdit);
		setNameForEdit(product.getName());
		setDescriptionForEdit(product.getDescription()); 
		setPriceForEdit(product.getPrice());
		setNrForEdit(product.getId());
		setCatForEditShow(product.getCategory().getName());
		
		
		Date dateToFormat = product.getReleaseDate();
		
		SimpleDateFormat sm = new SimpleDateFormat("dd.MM.yyyy");
		
		String newDate = sm.format(dateToFormat);
		
		setReleaseDate(newDate);
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		
		System.out.println(product.getReleaseDate());
		System.out.println(newDate);
		
		return "success";
	}

	
}
