package colecciones;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PruebaMapas {
	   private String title;
	    private String author;

	public static void main(String[] args) {
		
		Map<Integer, String> mapa1 = new HashMap<Integer, String>();
		
		mapa1.put(1, "amarillo");
		mapa1.put(2, "azul");
		mapa1.put(3, "rojo");
		mapa1.put(4, "naranja");
		
		
		String datoAntiguo = mapa1.put(1, "Azul");
		System.out.println( datoAntiguo);
		
		System.out.println(mapa1.containsKey(1));
		System.out.println(mapa1.containsValue("azul"));
		
		//Accedemos a todas las claves
		Set<Integer> claves = mapa1.keySet();
		for (Integer num : claves) {
			System.out.println(num);
			System.out.println(mapa1.get(num));
		}
		
		
		Collection<String> valores = mapa1.values();
		for (String color : valores) {
			System.out.println(color);
		}
		
		for (Map.Entry<Integer, String> book: mapa1.entrySet()) {
		    System.out.println("key: " + book.getKey() + " value: " + book.getValue());
		}
		
	}
}
