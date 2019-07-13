package mapImplementation;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Davy Castanet This program demonstrate a map that maps names to colors
 *         
 */

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Color> favoriteColours = new HashMap<String, Color>();
		favoriteColours.put("Alice" , Color.BLUE);
		favoriteColours.put("Bob", Color.GREEN);
		favoriteColours.put("Dave", Color.RED);
		
		//Print all keys and values in the map 
		Set<String>keySet = favoriteColours.keySet();
		
		//enhance for loop to loop through
		for(String key : keySet) {
			Color value = favoriteColours.get(key);
			System.out.println(key + " " + value);
		}
	}//main

}
