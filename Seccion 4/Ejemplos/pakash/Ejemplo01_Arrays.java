/*
 * Programa que muestra cómo definir y usar arrays
 */
package pakash;

import java.util.Scanner;
 
public class Ejemplo01_Arrays {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[3];
		numeros[0] = 3;
		numeros[1] = 2;
		System.out.println("Escribe el valor de la tercera casilla:");
		numeros[2] = input.nextInt();		
		System.out.println("La primera casilla es " + numeros[0]);
		System.out.println(numeros[1] + numeros[2]);
		
		float[] notas = new float[5];
		System.out.println("Escribe las 5 notas:");
		for(int i = 0; i < notas.length; i++) {
			notas[i] = input.nextFloat();
		}
		System.out.println("Estas son las notas que has escrito:");
		for(float nota: notas) {
			System.out.println(nota);
		}
		
		int[] numerosPrefijados = { 3, 7, 8, 12, 7 };
		numerosPrefijados[1] = 10;
		System.out.println("Datos del array predefinido:");
		for(int numero: numerosPrefijados) {
			System.out.println(numero);
		}
		
	}
}
