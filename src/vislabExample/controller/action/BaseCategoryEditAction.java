package vislabExample.controller.action;



import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import vislabExample.model.db.Category;


public class BaseCategoryEditAction extends ActionSupport {
	
	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	
	protected int catIdFromSelectEdit;
	protected String nameForEdit;
	
	protected ArrayList<Category> catResult;
	
	
	public ArrayList<Category> getCatResult() {
		return catResult;
	}

	public void setCatResult(ArrayList<Category> catResult) {
		this.catResult = catResult;
	}

	public String getNameForEdit() {
		return nameForEdit;
	}

	public void setNameForEdit(String nameForEdit) {
		this.nameForEdit = nameForEdit;
	}

	public int getCatIdFromSelectEdit() {
		return catIdFromSelectEdit;
	}

	public void setCatIdFromSelectEdit(int catIdFromSelectEdit) {
		this.catIdFromSelectEdit = catIdFromSelectEdit;
	}

}
