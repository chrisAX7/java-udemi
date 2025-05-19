/*
 * Programa que muestra el uso de StringBuilder y StringJoiner para
 * facilitar algunas operaciones típicas con cadenas de texto
 */
package pakash;

import java.util.StringJoiner;

public class Ejemplo08_StringBuilderYStringJoiner {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("Hola");
		s.append(" tardes");
		s.insert(4, " buenas");		
		System.out.println(s.toString());
		System.out.println(s.indexOf("tardes"));
		System.out.println(s.substring(5, 11));
		s.delete(5, 12);
		System.out.println(s.toString());	
		
		StringJoiner nombres = new StringJoiner(" - ");
		nombres.add("Juan");
		nombres.add("Isabel");
		nombres.add("Elena");
		System.out.println(nombres.toString());	
	}
} 
