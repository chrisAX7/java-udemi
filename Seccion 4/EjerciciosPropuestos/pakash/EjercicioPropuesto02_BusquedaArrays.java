package pakash;

import java.util.Scanner;

public class EjercicioPropuesto02_BusquedaArrays {
	/*Programa que le pide al usuario 10 números enteros y le debe imprimir el número mínimo, 
	 * máximo y el promedio*/
	public static void main(String[] args) {
		
		//Declarar variables
		int [] numeros = new int[10];
		int maximo;
		int minimo;
		int suma = 0;
		Scanner input = new Scanner(System.in);
		
		//Pedir datos al usuario
		System.out.println("Ingrese 10 números enteros: ");
		for(int i = 0; i <= 9; i++) {
			numeros[i] = input.nextInt();
			suma += numeros[i];
		}
			maximo = minimo = numeros[0];
			
		for(int i = 1; i < 10; i++) {
				
			//Obtener número mínimo
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
			//Obtener número maximo
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}
		
		//Salida por pantalla
		double promedio = suma / (double)numeros.length;
		System.out.println("El número mínimo es: " + minimo);
		System.out.println("El número máximo es: " + maximo);
		System.out.println("El promedio de todos los números es: " + promedio);
		
		//Cierre
		input.close();

	}

}
