package pakash;

/*
 * Programa que muestra c�mo utilizar 
 * bucles anidados
 */ 

import java.util.Scanner;

public class Ejemplo12_BuclesAnidados {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.println("Escribe n�meros. Cero o negativo para finalizar:");
		//En este programa cuenta hasta el número que le indique el usuario, sigue así hasta que se
		//coloque cero o un negativo.
		do {
			numero = input.nextInt();
			//Esta condición indica que solo se cuenten los positivos mayores a cero
			if (numero > 0) {
				for(int i = 1; i <= numero; i++) {
					//Se coloca "print" para que los números se impriman uno al lado del otro
					System.out.print(i + " ");
				}
				//Con esta instrucción se hace un salto de línea para el siguiente conteo
				System.out.println();
			}
		} while(numero > 0);
		
		int base = 8, altura = 4;
		//Este programa hace un cuadrilátero en 2D, el bucle exterior indica la cantidad de filas
		//y el interior la cantidad de columnas
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
