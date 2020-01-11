package intra2revision;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingMain {

	public static void main(String[] args) {
		
		  ArrayList liste = new ArrayList<>(Arrays.asList(5,7,4,7,2,5,8,9,5));
	        System.out.println(liste);
	        removeAll(liste, 5);
	        System.out.println(liste);
	}
	public static void removeAll(ArrayList liste, Object val){
        // remove retourne false si aucun élément est trouvé.
        while (liste.remove(val));
    }
}
