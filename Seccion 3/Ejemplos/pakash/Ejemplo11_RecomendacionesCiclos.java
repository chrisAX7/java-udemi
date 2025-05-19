/*
 * Programa que muestra cu�ndo utilizar 
 * cada tipo de estructura repetitiva:
 * "while", "do..while", o "for"
 */
package pakash;

import java.util.Scanner;

public class Ejemplo11_RecomendacionesCiclos {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Pedir al usuario n�meros hasta que escriba 0
		System.out.println("Escribe n�meros. Escribe 0 para terminar");
		int n;
		do {
			n = input.nextInt();
		} while(n != 0);
		
		// Contar del 1 al 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Decir cu�ntas veces seguidas es divisible un n�mero entre 2
		int numero = 12;
		int contadorVeces = 0;
		while(numero % 2 == 0) {			
			numero /= 2;
			contadorVeces++;
		}
		System.out.println("El n�mero es divisible " + contadorVeces + " veces");
		
	}
}
