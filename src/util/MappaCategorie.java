package util;

import java.util.HashMap;
import java.util.Map;

public final class MappaCategorie {
	
	private MappaCategorie() {
		throw new AssertionError();
	}
	
	public static Map<String, String> idCategorie = new HashMap<>();
	
	static {
		
		idCategorie.put("001", "elettronica");
		idCategorie.put("002", "abbigliamento");
		idCategorie.put("003", "accessori");
		
	}

}
