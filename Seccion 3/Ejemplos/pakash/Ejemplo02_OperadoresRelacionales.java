package pakash;

/*
 * Programa que muestra cómo utilizar 
 * los operadores relacionales
 */ 
 
public class Ejemplo02_OperadoresRelacionales {
	
	public static void main(String[] args) {
		int n = 10;
		String texto = "Hola";
		
		boolean comprobacion = n > 5;
		boolean comprobacion2 = n != 10;
		boolean comprobacion3 = texto.equals("HOLA");
		
		System.out.println(comprobacion);
		System.out.println(comprobacion2);
		System.out.println(comprobacion3);
	}
}
