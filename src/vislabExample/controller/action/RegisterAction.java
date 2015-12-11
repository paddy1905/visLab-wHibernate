package vislabExample.controller.action;

import com.opensymphony.xwork2.ActionSupport;

import vislabExample.model.bl.CustomerManager;
import vislabExample.model.db.Customer;


public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String passwordRepeat;
	private String firstname;
	private String lastname;
	
	public String execute() {
		CustomerManager manager = new CustomerManager();
		Customer customer = manager.getCustomerByPrimaryKey(username);
		
		if(customer == null) {
			Customer newCustomer = new Customer();
			newCustomer.setUsername(username);
			newCustomer.setPassword(password);
			newCustomer.setFirstname(firstname);
			newCustomer.setLastname(lastname);
			manager.saveCustomer(newCustomer);
			if(newCustomer.getUsername().startsWith("admin")) {
				return "admin";
			}
			return "success";
		} else {
			return "fail";
		}	
	}
	
//	public void validate() {
//		if(!this.password.equals(this.passwordRepeat)){
//			addFieldError("passwordRepeat", "Passwörter sind nicht identisch!");
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastName) {
		this.lastname = lastName;
	}
	
	
	
	
	

}
