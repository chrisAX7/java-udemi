/*
 * Programa que muestra c�mo generar n�meros aleatorios
 */
package pakash;

import java.util.Random;

public class Ejemplo05_NumerosAleatorios
{
	static Random r = new Random();
	
	public static void main(String[] args)
	{		
		double aleatorio1 = Math.random();		// Aleatorio real entre 0 y 1
		double aleatorio2 = Math.random() * 10;	// Aleatorio real entre 0 y 10
		
		int aleatorio3 = (int)(Math.random() * 10);			// Aleatorio entero entre 0 y 10
		int aleatorio4 = 10 + (int)(Math.random() * 10);	// Aleatorio entero entre 10 y 20
		
		System.out.println(aleatorio1);
		System.out.println(aleatorio2);
		System.out.println(aleatorio3);
		System.out.println(aleatorio4);					
		
		int aleatorio5 = r.nextInt(10);			// Entero entre 0 y 10
		int aleatorio6 = 10 + r.nextInt(10);	// Entero entre 10 y 20
		System.out.println(aleatorio5);
		System.out.println(aleatorio6);
	}
}
