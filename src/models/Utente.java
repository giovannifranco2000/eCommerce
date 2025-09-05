package models;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	private String name;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private String role;
	private boolean isLogged;
	private int phone;
	private List<String> addressList = new ArrayList<>();
	private List<String> paymentMethods = new ArrayList<>();

	public Utente(String name, String lastName, String username, String email, String password, String role,
			boolean isLogged, int phone, List<String> addressList, List<String> paymentMethods) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.isLogged = isLogged;
		this.phone = phone;
		this.addressList = addressList;
		this.paymentMethods = paymentMethods;
	}

	@Override
	public String toString() {
		return "Utente [name=" + name + ", lastName=" + lastName + ", username=" + username + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", isLogged=" + isLogged + ", phone=" + phone
				+ ", shippingAddress=" + addressList + ", paymentMethods=" + paymentMethods + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public List<String> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

}
