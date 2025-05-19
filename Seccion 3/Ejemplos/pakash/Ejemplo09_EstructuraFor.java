package pakash;

/*
 * Programa que muestra c�mo utilizar 
 * la estructura repetitiva "for"
 */ 

import java.util.Scanner;

public class Ejemplo09_EstructuraFor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limite;
		
		for (int n = 1; n <= 10; n++) {
			System.out.println(n);
		}
		
		System.out.println("Indica desde qu� n�mero quieres contar:");
		limite = input.nextInt();
		
		for (int n = limite; n >= 1; n-=2) {
			System.out.println(n);
		}
	}
}
