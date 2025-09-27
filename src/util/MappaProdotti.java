package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import models.Categoria;

import java.util.AbstractMap.SimpleImmutableEntry;

public final class MappaProdotti {
	
	private MappaProdotti() {
		throw new AssertionError();
	}
	
	public static List<Entry<Categoria, Entry<String, String>>> idProdotti = new ArrayList<>();
	
	static {
		
		List<Categoria> categorie = new ArrayList<>();
		for(Entry<String, String> entry : MappaCategorie.idCategorie.entrySet()) {
			categorie.add(new Categoria(entry.getKey(), entry.getValue(), ""));
		}
		
		// elettronica
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						categorie.get(0),
						new SimpleImmutableEntry<>("0001", "pc")
				)
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0002", "smartphone")
				)
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0003", "aspirapolvere")
				)
		);
		
		// abbigliamento
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0001", "maglietta")
				)
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0002", "pantaloni")
				)
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0003", "mutande")
				)
		);
		
		// accessori
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0001", "occhiali")
				)
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0002", "cover")
				)				
		);
		
		idProdotti.add(
				new SimpleImmutableEntry<>(
						new Categoria("", "", ""),
						new SimpleImmutableEntry<>("0003", "pellicole protettive")
				)				
		);
	}

}
