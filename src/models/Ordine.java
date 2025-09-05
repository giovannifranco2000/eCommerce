package models;

import java.util.ArrayList;
import java.util.List;

public class Ordine {

	private int id;
	private List<Prodotto> orderProductList = new ArrayList<>();
	private double price;
	private String address;
	private Pagamento paymentMethod;
	private String username;
	private String name;
	private String Lastname;

	@Override
	public String toString() {
		return "Ordine [id=" + id + ", orderProductList=" + orderProductList + ", price=" + price + ", address="
				+ address + ", paymentMethod=" + paymentMethod + ", username=" + username + ", name=" + name
				+ ", Lastname=" + Lastname + "]";
	}

	public Ordine(int id, List<Prodotto> orderProductList, double price, String address, Pagamento paymentMethod,
			String username, String name, String lastname) {
		super();
		this.id = id;
		this.orderProductList = orderProductList;
		this.price = price;
		this.address = address;
		this.paymentMethod = paymentMethod;
		this.username = username;
		this.name = name;
		Lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Prodotto> getOrderProductList() {
		return orderProductList;
	}

	public void setOrderProductList(List<Prodotto> orderProductList) {
		this.orderProductList = orderProductList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Pagamento getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Pagamento paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}
}
