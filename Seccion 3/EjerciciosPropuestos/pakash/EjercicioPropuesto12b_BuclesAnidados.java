package pakash;

import java.util.Scanner;

//Programa que le pide 10 números al usuario, de los cuales solo sumarán los positivos mayores a 
//cero

public class EjercicioPropuesto12b_BuclesAnidados {

	public static void main(String[] args) {
		
		//Declarar variables
		Scanner input = new Scanner(System.in);
		int num = 0, suma = 0;
		
		//Estructura anidada
		for (int i = 0; i <= 9; i++) {
			do {
				System.out.println("Ingrese un número entero positivo:");
				num = input.nextInt();
			} while (num <= 0);
			suma += num;
		}
		
		System.out.println("La suma de los números positivos es " + suma);
			

	}

}
