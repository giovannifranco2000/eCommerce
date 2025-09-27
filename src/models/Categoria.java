package models;

public class Categoria {
	
	private String name;
	private String description;
	private final String id; // three digit number starting from 001
	
	public Categoria(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Categoria [category=" + name + ", description=" + description + ", id=" + id + "]";
	}

}
