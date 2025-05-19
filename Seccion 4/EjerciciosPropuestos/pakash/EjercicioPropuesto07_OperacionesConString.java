package pakash;

import java.util.Scanner;

/*Programa que le pide al usuario que ingrese un texto por pantalla, una vez ingresado el programa 
 *hará lo siguiente:
 *1. Reemplazar la palabra "Python" por la palabra "Java".
 *2. Contar cuántas veces aparece la palabra "Java" en el texto, sin importar si está escrito en 
 *mayúsculas o en minúsculas*/

public class EjercicioPropuesto07_OperacionesConString {

	public static void main(String[] args) {
		
		//ENTRADA DE DATOS
		int contador = 0;
		int posicionActual = 0;
		Scanner input = new Scanner(System.in);
		String texto;
		
		System.out.println("Ingrese un texto:");
		texto = input.nextLine();
		
		//REEMPLAZAR "PYTHON" POR "JAVA"
		String textoReemplazo = texto.replace("Python", "Java");
		
		//ENCONTRAR LA PALABRA "JAVA"
		String textoLower = textoReemplazo.toLowerCase();
		String palabraEncontrada = "java";
		
		while ((posicionActual = textoLower.indexOf(palabraEncontrada, posicionActual)) >= 0) {
		    contador++;
		    posicionActual += palabraEncontrada.length(); 
		}
		
		//SALIDA POR PANTALLA
		System.out.println(textoReemplazo);
		System.out.println("La palabra 'Java' aparece " + contador + " veces.");
		
		//CIERRE
		input.close();

	}

}
