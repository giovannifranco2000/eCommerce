package util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IdGenerator {
	
	/*
	 * COME GENERARE ID CONSECUTIVI E COLLEGATI TRA LORO (es. categoria e prodotto)
	 * E RICOMINCIARE DA ZERO SE UNA NUOVA CLASSE HA BISOGNO DI ESSERE INDICIZZATA?
	 */
	
//	protected int index;
//	private static List<LinkedHashMap<Integer, Integer>> idStack = new ArrayList<>();
//	
//	public IdGenerator() {
//		Entry<Integer, Integer> lastEntry = idStack.get(index).lastEntry();
//		if(lastEntry != null) {
//			idStack.get(index).putLast(lastEntry.getKey() + 1, null);
//		}
//	}
	
	private static Map<Integer, Integer> id = new LinkedHashMap<>();
	// 001 - 0003
	// 002 - 0005
	// 003 - 0002
	// 004
	
	public static String parse(int id) {
		String idAsString = String.valueOf(id);
		
		switch(idAsString.length()) {
			case 1:
				// 1 - 9
				idAsString = "00" + idAsString;
				break;
			case 2:
				// 10 - 99
				idAsString = "0" + idAsString;
				break;
			case 3:
				// 100 - 999
				break;
			default:
				throw new IllegalArgumentException("Error: id out of range");
		}
		
		return idAsString;
	}

}
