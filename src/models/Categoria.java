package models;

import util.IdGenerator;

public class Categoria {
	
	private static int count = 0;
	
	private String category;
	private String description;
	private final String id; // three digit number starting from 001
	
	public Categoria(String category, String description) {
		this.category = category;
		this.description = description;
		id = IdGenerator.parse(++count);
	}

}
