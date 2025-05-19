package pakash;

/*
 * Programa para probar algunas instrucciones de manejo
 * de cadenas de texto
 */

public class Ejemplo06_OperacionesConString {
	
	public static void main(String[] args) {
		String texto = String.valueOf(23);
		System.out.println(texto);			// 23 como texto
		
		String textoConcatenado = "El n�mero es " + 3 + 2;
		System.out.println(textoConcatenado);
		String textoConcatenado2 = "El n�mero es " + (3 + 2);
		System.out.println(textoConcatenado2);
		
		texto = "En un lugar de La Mancha";
		char c = texto.charAt(3);			
		System.out.println(c);				// u
		
		texto = "Hola";
		for (int i = 0; i < texto.length(); i++)
			System.out.println(texto.charAt(i));
			
		texto = "Hola";
		String textoMayus = texto.toUpperCase();
		String textoMinus = texto.toLowerCase();
		System.out.println(textoMayus);
		System.out.println(textoMinus);
		
		texto = "Escarabajo";
		String textoCortado1 = texto.substring(2, 6);	// cara
		String textoCortado2 = texto.substring(5);		// abajo
		System.out.println(textoCortado1);
		System.out.println(textoCortado2);
		
		texto = "Hola-buenas-tardes";
		String[] partes = texto.split("-");
		for(int i = 0; i < partes.length; i++)
			System.out.println(partes[i]);
			
	}
}
