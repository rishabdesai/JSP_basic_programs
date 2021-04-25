package beans;

import daos.CustomerDao;
import entities.Customer;

public class LoginBean {
	//name of fields are same as entities 
	private String email;
	private String password;
	private Customer customer;
	
	//constructor
	public LoginBean() {
		this.email = "";
		this.password = "";
		this.customer = null;
	}
	
	//getter and setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//business method
	public void authenticate() {
		try (CustomerDao dao = new CustomerDao()) {
			dao.open();
			Customer dbCust = dao.getCustomer(email);
			if(dbCust != null && password.equals(dbCust.getPassword()))
				this.customer = dbCust;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
