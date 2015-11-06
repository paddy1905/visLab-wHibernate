package vislabExample.controller.action;

import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username = null;
	private String password = null;
	private String passwordRepeat = null;
	private String firstName = null;
	private String lastName = null;
	
	public String execute() {
		return "success";
		
	}
	
	public void validate() {
		if(!this.password.equals(this.passwordRepeat)){
			addFieldError("passwordRepeat", "Passwörter sind nicht identisch!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	

}
