package vislabExample.controller.action;





import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Preparable;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

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
		
		Product product = new Product (idFromSelectEdit,nameForEdit, descriptionForEdit,priceForEdit,new Date(),category);
		
		if(!releaseDate.isEmpty()) {
			DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
			try {
				Date date = formatter.parse(releaseDate);
				System.out.println(date);
				System.out.println(formatter.format(date));
				product.setReleaseDate(date);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		boolean updated = productManager.editProduct(product);
		
		result = productManager.getAllProducts();
		catResult = categoryManager.getAllAvailableCategories();
		
		addActionMessage("Erfolgreich bearbeitet");
		return "success";
	}
}
