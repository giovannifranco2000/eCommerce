package models;

public class Categoria {
	
	private String category;
	private String description;
	private final String id; // three digit number starting from 001
	
	public Categoria(String id, String category, String description) {
		this.category = category;
		this.description = description;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categoria [category=" + category + ", description=" + description + ", id=" + id + "]";
	}

}
