package util;

public class IdGenerator {
	
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
