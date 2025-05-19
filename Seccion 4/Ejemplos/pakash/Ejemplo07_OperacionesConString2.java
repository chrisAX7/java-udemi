package pakash;

/*
 * Programa para probar algunas instrucciones de manejo
 * de cadenas de texto
 */ 

public class Ejemplo07_OperacionesConString2 {
	
	public static void main(String[] args) {
		
		String texto = "Hola";		
		if (texto.equals("Hola"))
			System.out.println("Hola, qu� tal?");
		else
			System.out.println("No me has saludado");
			
		texto = "Hola buenas tardes";
		if (texto.contains("la"))
			System.out.println("El texto contiene \"la\"");
			
		texto = "Hola, buenas tardes";
		if (texto.endsWith("tardes"))
			System.out.println("Es por la tarde");	
			
		texto = "Este texto es un test";
		int posicion = texto.indexOf("te");
		int posicion2 = texto.indexOf("te", 3);
		System.out.println(posicion);
		System.out.println(posicion2);		

		texto = "Este texto es un test";
		posicion = texto.lastIndexOf("te");
		posicion2 = texto.lastIndexOf("te", 10);
		System.out.println(posicion);
		System.out.println(posicion2);		

		texto = "Este texto es un test";
		String textoReemplazado = texto.replace("te", "****");
		System.out.println(textoReemplazado);
	}
}
