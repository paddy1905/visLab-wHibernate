package vislabExample.controller.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CategoryManager;
import vislabExample.model.db.Category;

public class OpenSearchAction extends ActionSupport {
	
	/**
	 * 
	 */
	private ArrayList<Category> resultCat;
	private static final long serialVersionUID = 1L;
	
	
	
	public String execute() throws Exception {
		CategoryManager categoryManager = new CategoryManager();
		setResultCat(categoryManager.getAllAvailableCategories());
		return "success";
	}



	public ArrayList<Category> getResultCat() {
		return resultCat;
	}



	public void setResultCat(ArrayList<Category> resultCat) {
		this.resultCat = resultCat;
	}
}
