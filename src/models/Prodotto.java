package models;

public class Prodotto {
	
	private String name;
	private String description;
	private String id; // three digits category id + successive id number. e.g. 0030001 = first item of category 3
	private Categoria category;
	private int price;

	@Override
	public String toString() {
		return "Prodotto [name=" + name + ", description=" + description + ", id=" + id + ", category=" + category
				+ ", price=" + price + "]";
	}

	public Prodotto(String name, String description, String id, Categoria category, int price) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Categoria getCategory() {
		return category;
	}

	public void setCategory(Categoria category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
