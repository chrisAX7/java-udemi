package pakash;

import java.util.Scanner;

//Programa que le pide al usuario el tamaño del array para luego solicitarle que llene cada 
//posición e imprimir los que sean múltiplos de 3

public class EjercicioPropuesto01_Arrays {

	public static void main(String[] args) {

		//Declarar variables
		int[] numeros;
		Scanner input = new Scanner(System.in);

		//Solicitar datos al usuario
		System.out.println("¿Cuánto será la longitud del array?");
		int longitud = input.nextInt();
		numeros = new int[longitud];
		
		//Rellenar cada posición del array
		System.out.println("Ingrese la cantidad de números correspondiente: ");
		for (int i = 0; i < numeros.length; i++ ) {
			numeros[i] = input.nextInt();
		}
		
		//Imprimir solo los números múltiplos de 3
		System.out.println("Los números múltiplos de 3 son:");
		for(int i = 0; i < numeros.length; i++) {
			if( numeros[i] % 3 == 0) {
				System.out.print(numeros[i]);
			}
		}
		
		//Salida del ciclo
		input.close();
	}

}
