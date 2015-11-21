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
	
	private String testDate;

	public String execute() throws Exception {
		ProductManager productManager = new ProductManager();
		CategoryManager categoryManager = new CategoryManager();
		
		Product product = productManager.getProductForPrimaryKey(idFromSelectEdit);
		setNameForEdit(product.getName());
		setDescriptionForEdit(product.getDescription()); 
		setPriceForEdit(product.getPrice());
		setNrForEdit(product.getId());
		setCatForEditShow(product.getCategory().getName());
		
		
		Date dateToFormat = product.getTestDate();
		
		SimpleDateFormat sm = new SimpleDateFormat("dd.MM.yyyy");
		
		String newDate = sm.format(dateToFormat);
		Date lolDate = sm.parse(newDate);
		
		setTestDate(newDate);
	
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		
		System.out.println(product.getTestDate());
		System.out.println(newDate);
		
		return "success";
	}

	public String getTestDate() {
		return testDate;
	}

	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}
}
