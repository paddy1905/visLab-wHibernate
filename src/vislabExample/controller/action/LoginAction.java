package vislabExample.controller.action;


import com.opensymphony.xwork2.ActionSupport;
import vislabExample.model.bl.CustomerManager;
import vislabExample.model.db.Customer;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -983183915002226000L;

	private String username = null;
	private String password = null;
	private String firstname = "";
	private String lastname = "";
	
	
	
	public String execute() throws Exception {

		/** hier ist die Schnittstelle zur Geschäftslogik
		 * Verarbeitung der eingegebenen Daten, z.B. Überprüfen der Zugangsdaten, holen der Userdaten
		 */
		
	   	CustomerManager customerManager = new CustomerManager();
	   	
		Customer customer = customerManager.getCustomerByPrimaryKey(getUsername());
		
		if(customer == null) {
			addActionError("Benutzer nicht bekannt");
			return "input";
		}
	    
		if (customer.getPassword().equals(getPassword())) {
			setFirstname(customer.getFirstname());
			setLastname(customer.getLastname());	
			return SUCCESS;
		} else {
			addActionError("Passwort falsch");
			return "input"; 
		}
		
	 }

	
	
	public String getLastname() {
		return lastname;
	}
	
	private void setLastname(String lastname) {
		this.lastname = lastname;	
	}

	public String getFirstname() {
		return firstname;
	}

	private void setFirstname(String firstname) {
		this.firstname = firstname;
	}

    public String getUsername() { return (this.username); }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return (this.password); }
    public void setPassword(String password) { this.password  = password; }

}
