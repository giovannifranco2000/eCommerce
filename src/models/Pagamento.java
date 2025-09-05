package models;

import interfaces.Pagabile;

public abstract class Pagamento implements Pagabile {
	private String name;
	private String lastName;
	private boolean isAccepted;
	@Override
	public String toString() {
		return "Pagamento [name=" + name + ", lastName=" + lastName + ", isAccepted=" + isAccepted + "]";
	}



	public Pagamento(String name, String lastName, boolean isAccepted) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.isAccepted = isAccepted;
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

	public boolean isAccepted() {
		return isAccepted;
	}

	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

}
