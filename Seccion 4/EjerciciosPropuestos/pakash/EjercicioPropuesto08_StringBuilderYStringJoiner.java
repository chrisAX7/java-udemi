package pakash;

/*Programa que le pide al usuario que ingrese frases, el programa finalizará cuando el usuario 
 *ingrese una frase vacía. Una vez finalizada la ejecución se imprimirán las frases con un salto 
 *de línea y despúes separadas con una coma ",".*/

import java.util.Scanner;
import java.util.StringJoiner;


public class EjercicioPropuesto08_StringBuilderYStringJoiner {

	public static void main(String[] args) {
		
		//ENTRADA
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe una frase:");
		String respuesta = input.nextLine();
		StringBuilder frases = new StringBuilder(respuesta);
		
		//PROCESO
		do {
			System.out.println("Escribe otra frase:");
			respuesta = input.nextLine();
			if (!respuesta.equals("")) {
				frases.append("\n");
				frases.append(respuesta);
			}
			
		} while (!respuesta.equals(""));
		
		//SALIDA
		System.out.println("Has escrito:");
		System.out.println(frases.toString());
		
		String fragmentos[] = frases.toString().split("\n");
		StringJoiner fraseFinal = new StringJoiner(",");
		for (String fragmento : fragmentos) {
			fraseFinal.add(fragmento);
		}
		
		System.out.println(fraseFinal);
		
		input.close();
	}

}
